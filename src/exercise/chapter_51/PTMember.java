package exercise.chapter_51;

import exercise.chapter_51.exceptions.IDFormatException;
import exercise.chapter_51.exceptions.PositiveNumberException;

public class PTMember {
    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;

    public PTMember(String name, Integer height, Integer weight, String gender) {
       if (height <= 0) throw new PositiveNumberException("키는 0 초과여야 함");
       if (weight <=0) throw new PositiveNumberException("몸무게는 0 초과여야 함");
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 Null 불가");
        if (ID.length() < 8 || ID.length() >20 ) throw new IDFormatException("ID는 8자 이상 20자 이하로 만들어야 함");
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
