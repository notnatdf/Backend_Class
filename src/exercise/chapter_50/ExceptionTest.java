package exercise.chapter_50;

import java.io.File;

public class ExceptionTest {
    public static void main(String[] args){
        System.out.println("메인메소드가 시작합니다.");
        makeUncheckException();

        System.out.println("메인메소드가 종료합니다.");
    }

    public static void makeUncheckException(){
        int [] intArr = {1,2,3,4,5,6,7,8,9,10};
        int index= 10;
        System.out.println("값 : " + intArr[index]);
    }

    public static void makeCheckedException(){
        File file = new File("");
    }
}
