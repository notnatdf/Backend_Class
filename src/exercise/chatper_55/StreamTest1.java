package exercise.chatper_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] agrs){

        Stream<String> fruits = Stream.of("Apple","Banana","Orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple","Banana","Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,10});

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Grapes");
        fruitsList.add("Melon");

        Stream<String> fruits3 = fruitsList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        for(String fruit : fruitsList){
            System.out.println("for-loop 로 fruit 산출 : " + fruit.toUpperCase());
        }

        fruits3.forEach( (fruit) -> System.out.println("forEach 로 fruit 산출 : " + fruit.toUpperCase() ) );

        for(Integer integer : integerList){
            if(integer % 2 == 0) System.out.println("for-loop로 산출 : " + integer);
            else continue;
        }

        integerStream3.filter( (i) -> i % 2 == 0)
                .filter( (i) -> i >4 )
                .forEach( i -> System.out.println("forEach로 산출 : " + i));


        for(Integer integer : integerList){
            if(integer % 2 == 0) System.out.println("for-loop로 산출 : " + integer);
            else continue;
        }

    }

}
