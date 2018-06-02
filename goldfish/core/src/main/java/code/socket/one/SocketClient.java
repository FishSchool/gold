package code.socket.one;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * TODO:Socket发送方
 *
 * @Version 1.0.0
 * @Author ZYQ
 * @Date 2018-04-14 23:52
 **/
public class SocketClient {


    private static OutputStream outputStream;

    public static void main(String[] args) throws Exception {

        try {
            Socket socket = new Socket("localhost", 8888);

            outputStream = socket.getOutputStream();

            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.append("你好这是一个Socket测试" + Math.round(Math.random() * 10));
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
