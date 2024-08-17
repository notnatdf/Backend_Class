package exercise.chapter_43;

import exercise.chapter_34.VIPCustomer;

public class ObjectTest {

    public static void main(String[] args){
        Customer customer = new Customer("덕소");

        System.out.println(customer);

        GolderCustomer customer1 = new GolderCustomer("재인");
        System.out.println(customer1);

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("철수");

        System.out.println(staff);
        System.out.println(vipCustomer.toString());
    }
}
