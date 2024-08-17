package exercise.chapter_37;

public class MaleTwo extends FamilyMan implements FamilyRole,EmplyeeRole {
       @Override
    public void educateBaby(Baby baby) {

    }


    @Override
    public void workTogether(EmplyeeRole emplyeeRole) {
        String name = emplyeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 열심히 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public MaleTwo(String name){
           this.name = name;
    }
}
