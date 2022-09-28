package Socket_3;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 7183);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(20 + 14); // я знаю, что это работает не так, мне ещё 10 домашек делать, сегодня среда Т_Т

        out.close();
        socket.close();
    }
}
