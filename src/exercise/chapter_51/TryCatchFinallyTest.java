package exercise.chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args){
        System.out.println("메인메소드가 실행됩니다.");

        try{
            Integer myInt = 10;
            Integer data = 100 / myInt;

            System.out.println("data : " + data);
        } catch (ArithmeticException e){
            System.out.println("MyInt는 0이 될 수 없음");
            e.printStackTrace();
        } finally {
            System.out.println("여기는 무조건 실행되는 Finally 영역임");
        }

        System.out.println("메인메소드가 종료됩니다.");
    }
}
