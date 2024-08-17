package exercise.chapter_59;

import exercise.chapter_57.Customer;

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
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + "서버가 시작되었습니다.");

            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();

                    Thread request = new Thread(new RequestHandler(clientSocket,customerList));
                    request.start();


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                // TODO: 클라이언트로부터 데이터를 읽고 화면에 출력

                    // TODO: 클라이언트에게 응답을 보냄


            }

            } catch(IOException e){
                e.printStackTrace();
            }
        }


    }
