package exercise.chapter_57;

import java.io.*;

public class SerializeExampleTest {

    public static void main(String[] args){

        Person person = new Person("재키 리","Male",40,"Usa","3급 딴따라");

        byte[] serializeData = null;

        try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
        ){
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            serializeData = bao.toByteArray();
            System.out.println("Person 직렬화 후 : " + new String(serializeData));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ByteArrayInputStream bio = new ByteArrayInputStream(serializeData);
             ObjectInputStream objectInputStream = new ObjectInputStream(bio);
        ){
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("직렬화 된 Data 가 다시 Person으로 역직렬화 후 : " + person1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
