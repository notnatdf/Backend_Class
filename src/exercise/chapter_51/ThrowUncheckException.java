package exercise.chapter_51;

public class ThrowUncheckException {

    public static void main(String[] args) {
        System.out.println("메인 메소드 실행");

        int myInt = 0;
        try {
            myInt = getDivide(10);
        } catch (Exception e){
            System.out.println("Exception 처리 완료");
            e.printStackTrace();
        }

        System.out.println("myInt : " + myInt);

        System.out.println("메인 메소드 종료");

    }

    static int getIntElement(int index) throws Exception {
        int [] arrInt = {1,2,3,4,5,6,7,8,9,10};

        if (index >= arrInt.length){
            throw new Exception("Index는 ArrInt의 길이를 넘을 수 없음");
        }

        return arrInt[index];
    }

    static int getDivide(int num) throws Exception {

        if (num == 0){
            throw new Exception("num은 0이 될 수 없음");
        }

        int data = 100 / num;

        return data;
    }
}
