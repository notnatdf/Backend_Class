package exercise.chapter_34;

public class VIPCustomer extends Customer {
    static int serialNums = 1;



    private String agentId;
    private double discountRatio;

    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){
        System.out.println("담당직원" + this.agentId + "님 문의드릴게 있어요");
    }

    public VIPCustomer(String name){
        super();
        this.customerID = "VIP" + serialNums++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;

    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
    @Override
    public void printMyInfo(){
        System.out.print("VIP ");
       super.printMyInfo();
    }
}
