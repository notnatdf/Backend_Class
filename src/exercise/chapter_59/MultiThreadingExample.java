package exercise.chapter_59;

public class MultiThreadingExample {

    public static void main(String[] args){

        Thread thread1 = new Thread(new PrintNumberRunnale(1, 33));
        Thread thread2 = new Thread(new PrintNumberRunnale(34, 66));
        Thread thread3 = new Thread(new PrintNumberRunnale(67, 100));

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
