package exercise.chapter_28;

public class Birthday extends Person {
    //
    private int year;
    private int month;
    private int day;

    public void setYear(int Year){
        this.year = Year;

    }

    private void printHi(){
        System.out.println("Hi");
    }

    Birthday(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi();
    }

    public Birthday returnMySelf(){
        return this;
    }

}
