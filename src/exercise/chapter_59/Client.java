package exercise.chapter_59;

import exercise.chapter_57.Customer;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args){
        try(Socket socket = new Socket("localhost",1234)){

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("ID 117" , "조국");

            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            String response = bufferedReader.readLine();
            System.out.println("서버의 응답 (고객대기리스트) : " + response);

            System.out.println("Client가 종료되었습니다.");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
