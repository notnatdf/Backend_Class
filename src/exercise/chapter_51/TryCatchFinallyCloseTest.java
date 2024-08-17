package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("메인 메소드를 실행");


        try(FileInputStream fs = new FileInputStream("src/exercise/chapter_50/text.txt")) {
            int i ;
            while ((i= fs.read()) !=-1){
                System.out.write(i);
            }

            int myInt = 0;
            int data = 100 / myInt;


        }catch (FileNotFoundException e){
            System.out.println("File을 찾을 수 없음");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("입출력 과정에서 문제가 생김");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없음");
            e.printStackTrace();
        }
        System.out.println("메인 메소드를 종료");

        while (true){
            Thread.sleep(1000);
        }
    }
}
