package exercise.chapter_47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args){
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("Orange");
        fruitSet.add("Grape");

        System.out.println("fruitSet : " + fruitSet);


    }
}
