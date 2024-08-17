package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args){

        HusbandRole male = new Male("철수");
        Wife wife = new Female("영희");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("금동이");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        EmplyeeRole maleEmplyee = (EmplyeeRole) maleDaddy;
        EmplyeeRole femaleEmplyee = new Female("정희");

        maleEmplyee.workTogether(femaleEmplyee);
    }
}
