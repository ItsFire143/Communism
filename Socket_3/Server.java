package Socket_3;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7183);
        System.out.println("Сервер запущен");
        Socket input = serverSocket.accept();
        Scanner in = new Scanner(input.getInputStream());
        while(in.hasNext()){
         System.out.println(in.nextLine());
        }
        in.close();
        input.close();
        serverSocket.close();
    }
}
