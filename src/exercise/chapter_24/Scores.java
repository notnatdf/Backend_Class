package exercise.chapter_24;

public class Scores {

    public static void main(String[] args){
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;


        double averageAClass = calculateAverage(studentAClass1,studentAClass2,studentAClass3);


        double averageBClass = calculateAverage(studentBClass1,studentBClass2,studentBClass3);

        System.out.printf("A Class 의 평균점수는 %.2f, B Class 의 평균점수는 %.2f\n",averageAClass, averageBClass);

    }

    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3){
        int sumAClass = studentScore1 + studentScore2 + studentScore3;
        return sumAClass / (double) 3;
    }
}
