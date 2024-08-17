package exercise.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args){
        System.out.println("메인메소드가 시작합니다.");

        try {
            int i = 10;
            int data = 50 / i;

            System.out.println("data : " + data);
        } catch (ArithmeticException e) {

            System.out.println("0으로는 못 나눔" );
            System.out.println("data : " + 0 );
            e.printStackTrace();

        }


        System.out.println("메인메소드가 종료합니다.");
    }
}
