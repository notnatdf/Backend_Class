package exercise.chapter_32.fish;

public class FishChild extends Fish {

    private boolean eatable;
    protected String leavingSeaChild;

    // 새로운 메소드
    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고있습니다.");
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger(){
        this.havingPoison = true;
    }

    @Override
    void eat(String food) {
        System.out.printf(myInfo() + "는 %s를 아주 열심히 먹고 있습니다.\n", food);
    }

    void printSea(){
        System.out.println(myInfo() + "는" + this.leavingSeaChild + "바다 출신이고," +
                "부모 물고기는" + super.livingSea + "바다 출신이야");
    }

    @Override
    String myInfo() {
        return super.myInfo() + "는 부모 물고기, " + String.format("자식 물고기 (eatable=%b, leavingSea=%s", this.eatable, this.leavingSeaChild);
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    FishChild(){
        System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.livingSea = leavingSea;
    }

    FishChild(String sex, boolean eatable, String livingSea){
        super(sex, false,"2022","2022",livingSea);
        this.eatable = eatable;

    }

}



