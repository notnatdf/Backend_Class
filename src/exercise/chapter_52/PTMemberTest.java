package exercise.chapter_52;

public class PTMemberTest {
    public static void main(String[] args){
        PTMember member = new PTMember("민철",178,70,"남자");
        try {
            member.setID("ahuhuufwe");
        } catch (Exception e){
            System.out.println("ID는 Null 불가");
            e.printStackTrace();
        }
        System.out.println(member);
    }


}