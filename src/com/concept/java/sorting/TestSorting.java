package com.concept.java.sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestSorting {



    public static void main(String args[])  {
        System.out.println((1.0/0.0));
        int bubble[] = {8, 4, 10, 6, 9, 2};
        System.out.println("Bubble sort test");
        Sort bubbleSort = new BubbleSort();
        System.out.println("Input");
        bubbleSort.printArray(bubble);
        bubbleSort.printArray(bubbleSort.sort(bubble));

        int quick[] = {8,4,10,6,9,2};
        System.out.println("Quick sort test");
        Sort quickSort = new QuickSort();
        System.out.println("Input");
        quickSort.printArray(quick);
        quickSort.printArray(quickSort.sort(quick));

        int heap[] = {8, 4, 10, 6, 9, 2};
        System.out.println("Heap sort test");
        Sort heapSort = new HeapSort();
        System.out.println("Input");
        heapSort.printArray(heap);
        heapSort.printArray(heapSort.sort(heap));
        String s = "" ;
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        out.format(date);

        Scanner scanner = new Scanner(System.in);
        int input[] = new int[4];
        while(scanner.hasNextLine())
        {
            for(int i = 0 ; i< 4; i++){
                input[i] = scanner.nextInt();
            }

            int rect = 0;
            int square = 0;
            if(input[0] == input[2] && input[1] == input[3] && input[0]!=input[1]){
                rect++;
            }else if(input[0]==input[1] && input[1] == input[2] && input[2] == input[3] && input[3] == input[0]){
                square++;
            }


        }

    }



    public static void main2(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input[][] = new int[100][4];
        int row = 0;
        while(row<6){
            for(int i = 0 ; i< 4; i++){
                input[row][i] = scanner.nextInt();
            }
            row++;
            scanner.nextLine();
        }
        int rect = 0;
        int square = 0;
        int other = 0;
        for(int i=0; i< row;i++){
            int line[]  = input[i];
            if(line[0] == line[2] && line[1] == line[3] && line[0]!=line[1]){
                rect++;
            }else if(line[0]==line[1] && line[1] == line[2] && line[2] == line[3] && line[3] == line[0]){
                square++;
            }else{
                other++;
            }
        }
        System.out.print(rect+" "+ square+" "+ other);
    }

    static class Hotel{
        Long id;
        List<String> reviews;

        Hotel(Long id, List<String> reviews) {
            this.id = id;
            this.reviews = reviews;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Hotel hotel = (Hotel) o;

            if (id != null ? !id.equals(hotel.id) : hotel.id != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }
    }

    public static void main5(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final List<String> words  = new ArrayList<String>();
        String revewCom = scanner.nextLine();
        for(String  com : revewCom.split("\\s"))
            words.add(com);
        int reviewCount   = scanner.nextInt();
        scanner.nextLine();
        Map<Long, List<String>> hotelReview = new HashMap<Long, List<String>>();
        for(int i=0;i< reviewCount;i++){
            Long hotelId = scanner.nextLong();
            scanner.nextLine();
            String review = scanner.next();
            List<String> reviews = null;
            if(hotelReview.containsKey(hotelId)){
                reviews = hotelReview.get(hotelId);
            }else{
                reviews = new ArrayList<String>();
            }
            reviews.add(review);
            hotelReview.put(hotelId, reviews);
            scanner.nextLine();
        }
        List<Hotel> hotels = new ArrayList<Hotel>();
        for(Long id : hotelReview.keySet()){
            hotels.add(new Hotel(id, hotelReview.get(id)));
        }
        Collections.sort(hotels, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                int o1Count = 0;
                int o2Count = 0;
                for(String word : words){
                    if(o1.reviews.contains(word))
                        o1Count++;
                    if(o2.reviews.contains(word))
                        o2Count++;
                }
                return o1Count==o2Count?0:o1Count>o2Count?1:-1;
            }
        });
        for(Hotel hotel : hotels){
            System.out.print(hotel.id+" ");
        }
        
        
        
        
    }

    public static void main1(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] list = input.split(";");
        int num_args= Integer.parseInt( list[0] );
        int startIndex = 1;
        for(int i=0; i< num_args; i++){
            Integer id = Integer.parseInt(list[startIndex]);
            startIndex = startIndex+1;
            String name = list[startIndex];
            startIndex = startIndex+1;
            String surname = list[startIndex];
            startIndex = startIndex+1;
            Person person = PersonFactory.createPerson(id, name, surname);
            System.out.println(person.toString());

        }
    }

}


// to be implemented
 class Person {
    Integer id;
    String name;
    String surname;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                '}';
    }

}
// to be implemented
             class PersonFactory {

    public static Person createPerson(Integer id, String name, String surname){
        Person person = new Person();
        person.id = id;
        person.name = name;
        person.surname = surname;
        return person;
    }

}


