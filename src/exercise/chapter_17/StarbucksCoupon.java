package exercise.chapter_17;

public class StarbucksCoupon {
    public static void main(String[] args){

        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        if(clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4){
            System.out.println("이벤트참여");
        }
        else {
            System.out.println("내가 사먹는다");
        }
    }
}
