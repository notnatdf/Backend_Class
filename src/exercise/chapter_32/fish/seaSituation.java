package exercise.chapter_32.fish;

public class seaSituation {

    public static void main(String[] args){
        // 자식 물고기
//        FishChild fishChild = new FishChild();
//        fishChild.setSex("Maie");
//        fishChild.setEatable(true);
//        fishChild.setLivingSea("동해");
//
//        fishChild.printfMyInfo();
//
//        // 생성자 오버로딩
//
//        FishChild fishChild2 = new FishChild("Female",true,"서해");
//
//        fishChild2.printfMyInfo();

        //자식 물고기 생성
//        FishChild fishChild = new FishChild();
//        fishChild.setLivingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//
//        fishChild.printSea();

        // 핵심 타입

        Fish fish1 = new Fish();
        fish1.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");

//        FishChild fish4 = new Fish();



    }
}
