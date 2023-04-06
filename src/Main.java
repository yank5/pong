import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        String x=NetworkInterface.getByName("wlan0").getInterfaceAddresses().get(1).getAddress().getHostAddress();
//        System.out.println("Copy this ip address and give it to another user\n"+x);
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Ip to connect to: ");
//        InetAddress ip=InetAddress.getByName(scanner.next());
//        System.out.print("\nPort to connect to: ");
//        int port=scanner.nextInt();
//        Socket socket=new Socket();
//        SocketAddress socketAddress=new InetSocketAddress(ip,port);
//        socket.connect(socketAddress);
//        InputStream inputStream=socket.getInputStream();
//        OutputStream outputStream=socket.getOutputStream();


        Pong.draw2Screen();

    }
}