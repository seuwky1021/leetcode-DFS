package Net;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread{//创建类，该类为多线程执行程序
    String weather="节目预报:八点有大型晚会，请收听";
    int port=9898;
    InetAddress iaddress=null;
    MulticastSocket socket=null;
    Weather(){
        try {
            iaddress =InetAddress.getByName("224.255.10.0");
            socket=new MulticastSocket(port);//实例化多点广播套接字
            socket.setTimeToLive(1);//指定发送范围是本地网络
            socket.joinGroup(iaddress);//加入广播组
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        while (true){
            DatagramPacket packet=null;
            byte data[]=weather.getBytes();
            packet=new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));//将广播信息输出
            try {
                socket.send(packet);
                sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Weather w=new Weather();
        w.start();
    }
}
