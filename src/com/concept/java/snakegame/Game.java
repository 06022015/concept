package com.concept.java.snakegame;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/20/17
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract  class Game{
    
    public static int DEFAULT_ROW_COUNT = 20;
    public static int DEFAULT_COLUMN_COUNT = 16;

    private Board board;
    private Snake snake;
    private Direction direction;
    private GameStatus status;
    private Score score;
    
    public Game(){
         init(DEFAULT_ROW_COUNT,DEFAULT_COLUMN_COUNT, new Score());
    }

    public Game(Score score){
        init(DEFAULT_ROW_COUNT,DEFAULT_COLUMN_COUNT, score);
    }
    
    private void init(int rowCount, int columnCount, Score score){
        this.board = new Board(rowCount, columnCount);
        this.snake = new Snake(getSnakeInitialPosition());
        this.status = GameStatus.NEW;
        this.score = score;
    }
    
    private Cell[] getSnakeInitialPosition(){

        return null;

    }

    public void play(){
        this.status = GameStatus.PLAY;
        run();
    }

    public void pause(){
        this.status = GameStatus.PAUSED;
    }

    public void over(){
        this.status = GameStatus.OVER;
    }

    private boolean isGameOver(){
        return this.status.equals(GameStatus.OVER);
    }

    private boolean isGameRunning(){
        return this.status.equals(GameStatus.PLAY);
    }

    public void changeDirection(Direction direction){
        this.direction = direction;
    }

    private void updateScore(CellType cellType){
        this.score.update(cellType);
        currentScore(this.score);
    }


    public abstract void crashed();

    public abstract void currentScore(Score score);

    public abstract void gameOver();

    private void update(){
        if(isGameRunning()){
            if(!this.direction.equals(Direction.NONE)){
                Cell nextPos = getNextPosition(snake.getHead());
                if(!snake.isCrashed(nextPos)){
                     this.snake.move(nextPos);
                    this.updateScore(nextPos.getCellType());
                    if(nextPos.getCellType().equals(CellType.FOOD)){
                        this.board.generateFood();
                    }
                    if(this.score.isMegaApplicable()){
                        this.board.generateMegaFood();
                    }
                }else{
                    over();
                    crashed();
                }
            }
        }else if(isGameOver()){
            gameOver();
        }
    }

    private Cell getNextPosition(Cell currentPosition){
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getCol();
          /*switch (this.direction.ordinal()){
              case Direction.DOWN: currentRow--;
                  break;
              case Direction.UP: currentRow++;
                  break;
              case Direction.LEFT: currentColumn--;
                  break;
              case Direction.RIGHT: currentColumn++;
                  break;
          }*/
        return this.board.getCell(currentRow,currentColumn);
    }

    private void run() {
        while(this.status.equals(GameStatus.PLAY)){
            update();
        }
    }
}
