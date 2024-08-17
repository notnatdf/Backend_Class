package exercise.chapter_39;

import exercise.chapter_33.Animal;
import exercise.chapter_33.Bird;
import exercise.chapter_33.Person;

public class AnimalDownCasting {

    public static void main (String[] args){
        // 다운 캐스팅 확인여부

        exercise.chapter_33.Animal animal = new exercise.chapter_33.Bird();

        checkBirdAndFly(animal);

        exercise.chapter_33.Animal animal2 = new exercise.chapter_33.Animal();

        checkBirdAndFly(animal2);

        exercise.chapter_33.Animal animal3 = new Person();

        checkBirdAndFly(animal3);
    }

    static void checkBirdAndFly(Animal animal){
        if (animal instanceof exercise.chapter_33.Bird){
            exercise.chapter_33.Bird bird = (Bird) animal;
            bird.fly();
        }
        else {
            System.out.println("너는 새가 아니야");
        }
    }
}
