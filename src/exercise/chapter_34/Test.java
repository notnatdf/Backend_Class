package exercise.chapter_34;

public class Test {

    public static void main(String[] args){

        Customer customer = new Customer("나철수");
        VIPCustomer vipCustomer = new VIPCustomer("나만호");
        Customer customer2 = new Customer("김정희");

        customer.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();
    }
}
