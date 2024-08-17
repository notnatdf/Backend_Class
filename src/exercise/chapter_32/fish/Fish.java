package exercise.chapter_32.fish;

public class Fish {

    private String sex;
    protected boolean havingPoison;
    private String StarSpawingDate;
    private String EndSpawingDate;
    protected String livingSea;

    void eat(String food) {
        System.out.printf(myInfo() + "는 %s를 먹고 있습니다.\n", food);
    }

    void swim(int meter){
            System.out.println("나는 헤엄칩니다 미터:" + meter);
    }

    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    void sleep (){};

    String myInfo(){
        return String.format("물고기(sex=%s, havingPoison=%b, livingSea=%s\n",
                this.sex, this.havingPoison, this.livingSea);
    }

    void printfMyInfo (){
        System.out.printf(myInfo());
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStarSpawingDate(String starSpawingDate) {
        StarSpawingDate = starSpawingDate;
    }

    public void setEndSpawingDate(String endSpawingDate) {
        EndSpawingDate = endSpawingDate;
    }

    public void setLivingSea(String livingSea) {
        this.livingSea = livingSea;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    Fish(){}

    public Fish(String sex, boolean havingPoison, String starSpawingDate, String endSpawingDate, String livingSea) {
        this.sex = sex;
        this.havingPoison = havingPoison;
        StarSpawingDate = starSpawingDate;
        EndSpawingDate = endSpawingDate;
        this.livingSea = livingSea;
    }
}

