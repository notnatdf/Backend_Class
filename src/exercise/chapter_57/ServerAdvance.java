package exercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    public static void main(String[] args) throws IOException {

        List<Customer> customerList = new ArrayList<>();


        // TODO: 서버 소켓 생성


        // TODO: 클라이언트 접속 대기

        try (ServerSocket serverSocket = new ServerSocket(1234);

        ) {
            System.out.println("서버가 시작되었습니다.");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                ) {

                    System.out.println("클라이언트가 접속하였습니다.");

                    InputStream clientInputstream = clientSocket.getInputStream();
                    ObjectInputStream objectInputStream = new ObjectInputStream(clientInputstream);

                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);


                    // TODO: 클라이언트로부터 데이터를 받기 위한 InputStream 생성

                    // TODO: 클라이언트로부터 데이터를 보내기 위한 OutputStream 생성

                    // inputLine;
//                    String inputLine;
//
////                    while ((inputLine = objectInputStream.readLine()) != null) {
//                        System.out.println("클라이언트로부터 온 요청은 " + inputLine);

//                        String[] strs = inputLine.split(",");
//
//                        String ID = strs[0];
//                        String name = strs[1];



                        Customer customer = (Customer) objectInputStream.readObject();

                        customerList.add(customer);
                        System.out.println(customer + "가 대기명단에 추가되었습니다.");

                        printWriter.println("현재 고객 대기명단은 : " + customerList);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                // TODO: 클라이언트로부터 데이터를 읽고 화면에 출력

                    // TODO: 클라이언트에게 응답을 보냄


            }

            } catch(IOException e){
                e.printStackTrace();
            }
        }


    }
