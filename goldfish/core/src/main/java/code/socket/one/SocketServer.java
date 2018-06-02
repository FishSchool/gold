package code.socket.one;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TODO:socket接收方
 *
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-14 22:54
 **/
public class SocketServer {

    private static Socket socket;
    private static InputStream inputStream;
    private static BufferedReader reader;
    private static String string;

    public static void main(String[] args) throws Exception {


        ServerSocket serverSocket = new ServerSocket(8888);

        socket = serverSocket.accept();
        inputStream = socket.getInputStream();

        reader = new BufferedReader(new InputStreamReader(inputStream));

        string = reader.readLine();
        System.out.println(string);
        reader.close();

    }

}
