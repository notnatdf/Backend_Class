package exercise.chapter_42;

public class Customer {

    static int serialNums = 1;
    String hello1 = "Hello";
    String hello2 = "Hello2";

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price){
        this.bonusPoint += price *bonusPointRatio;
        return price;
    }

    Customer(){

    }
    public Customer(String name){
        this.customerID = "Customer" + serialNums ++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
