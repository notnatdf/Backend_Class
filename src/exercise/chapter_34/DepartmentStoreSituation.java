package exercise.chapter_34;

public class DepartmentStoreSituation {

    public static void main(String[] args){

        int price = 50_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer1 = new VIPCustomer("코인사기꾼");

        Customer[] customerQueue = {
          new Customer("딴따라"),new Customer("건달"), new VIPCustomer("A급 딴따라"),
          new VIPCustomer("A급 광대"),new Customer("핫바리 딴따라"),new VIPCustomer("B급 광대"),
                new Customer("코인사기꾼"),new Customer("백수"),new VIPCustomer("히키코모리"),
                new GolderCustomer("스님"),new GolderCustomer("프로겜블러"),new GolderCustomer("목사")

        };

        for (Customer customerEach: customerQueue){
            customerEach.printMyInfo();
            int cash = staff.helpPayment((VIPCustomer) customerEach, price);
            System.out.printf("내가 내는 금액: %d", cash);
            staff.setSalesAmount(cash);

        }

        staff.printMySalesAmount();
    }
}
