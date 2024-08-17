package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args){
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_50/text.txt");

            int i = 10;
            int data = 100 / i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 0;
            int [] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 가 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println
                    ("Arithmetic Exception 또는 NullPointerException 오류가 발생");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("최종 Exception 필터에 걸림");
            e.printStackTrace();
        }
//        } catch (NullPointerException e){
////            System.out.println("NullPointerException 오류 발생");
////            e.printStackTrace();
//        }
        System.out.println("메인메소드가 종료됩니다.");
    }
}
