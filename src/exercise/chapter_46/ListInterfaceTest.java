package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args){
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");

        System.out.println("FruitList 요소:" + fruitList);

        fruitList.add(3,"Mango");
        System.out.println("FruitList 요소:" + fruitList);

        fruitList.remove(3);
        System.out.println("FruitList 요소:" + fruitList);

        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은:" + myFruit);

        fruitList.set(1, "PineApple");
        System.out.println("FruitList 요소:" + fruitList);

        System.out.println("리스트 사이즈" + fruitList.size());

        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("PineApple"));

        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println("FruitList 요소:" + fruitList);
    }
}
