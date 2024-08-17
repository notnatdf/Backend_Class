package exercise.chapter_37;

public class Female implements EmplyeeRole,Wife {
    private String name;
    private int age;
    private String job;

    @Override
    public void workTogether(EmplyeeRole emplyeeRole) {
        String name = emplyeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 열심히 하고 있습니다.");
    }

    @Override
    public void takeCareHusband(HusbandRole husband) {
        String name = husband.getName();
        System.out.println(name + "인 남편을 케어해줍니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Female(String name) {
        this.name = name;
    }
}
