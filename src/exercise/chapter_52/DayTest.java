package exercise.chapter_52;

public class DayTest {

    public static void main(String[] args){
        Day monday = Day.MONDAY;

//        System.out.println("요일 : " + monday);
//        System.out.println("요일 : " + monday.getKoreanName());
        Day day = Day.SATURDAY;

        switch (day){
            case MONDAY:
                System.out.println("한 주의 시작입니다. " + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case TURSDAY:
            case FRIDAY:
                System.out.println("오늘은 평일입니다. " +day.getKoreanName());
                break;
            case SATURDAY:
                System.out.println("오늘만 지나면 주말입니다. " +day.getKoreanName());

            case SUNDAY:
                System.out.println("야호 하루 주말" + day.getKoreanName());
                break;
        }
    }
}
