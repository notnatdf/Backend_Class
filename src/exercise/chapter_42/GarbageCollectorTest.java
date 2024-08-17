package exercise.chapter_42;

public class GarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++){
            Customer customer = new Customer("사기꾼");
            customer.printMyInfo();
        }

        System.gc();

        while (true){
            Thread.sleep(100);
        }
    }
}
