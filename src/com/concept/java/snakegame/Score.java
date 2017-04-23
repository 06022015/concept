package com.concept.java.snakegame;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/21/17
 * Time: 7:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class Score {
    
    public static int DEFAULT_POINTS_FOR_FOOD = 10;
    public static int DEFAULT_POINTS_FOR_MEGA_FOOD = 100;
    public static int DEFAULT_MEGA_FOOD_CRITERIA = 5;

    private int pointsForFood; 
    private int pointsForMegaFood; 
    private int numOfFood;
    private int numOfMegaFood;
    private int currentScore;
    private int megaFoodCriteria;
    
    public Score() {
        this.init(DEFAULT_POINTS_FOR_FOOD,DEFAULT_POINTS_FOR_MEGA_FOOD,DEFAULT_MEGA_FOOD_CRITERIA);
    }

    public Score(int pointForFood, int pointsForMegaFood){
        this.init(pointForFood,pointsForMegaFood, DEFAULT_MEGA_FOOD_CRITERIA);
    }

    public Score(int pointForFood, int pointsForMegaFood, int megaFoodCriteria){
        this.init(pointForFood,pointsForMegaFood,megaFoodCriteria);
    }
    
    private void init(int pointForFood, int  pointsForMegaFood, int megaFoodCriteria){
        this.pointsForFood = pointForFood;
        this.pointsForMegaFood = pointsForMegaFood;
        this.megaFoodCriteria = megaFoodCriteria;
        this.numOfFood = 0;
        this.numOfMegaFood = 0;
        this.currentScore = 0; 
    }

    public boolean isMegaApplicable(){
        return this.numOfFood%this.megaFoodCriteria==0;
    }

    public int getNumOfFood() {
        return numOfFood;
    }

    public int getNumOfMegaFood() {
        return numOfMegaFood;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void update(CellType cellType){
        if(cellType.equals(CellType.FOOD)){
            this.numOfFood++;
            this.currentScore = this.currentScore+this.pointsForFood;
        }else if(cellType.equals(CellType.MEGA_FOOD)){
            this.numOfMegaFood++;
            this.currentScore = this.currentScore+this.pointsForMegaFood;
        }
    }
}
