package exercise.chapter_43;

public class EqaulsTest {
    public static void main(String[] args){

        Customer customer1 = new Customer("ID 1", "재인");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID 1", "재인");
        Customer customer4 = new Customer("ID 1", "인재");

        System.out.println(customer1);
        System.out.println(customer3);

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
        System.out.println(customer1.equals(customer4));
    }
}
