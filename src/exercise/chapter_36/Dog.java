package exercise.chapter_36;

public class Dog extends Animal {

    @Override
    public void eat(String food) {
        System.out.printf("개는 %s 을 날카로운 이빨로 뜯어먹는다.\n", food);

    }

    @Override
    public void sleep() {
        System.out.printf("개는 엎드려 잠을 잔다.");
    }
}
