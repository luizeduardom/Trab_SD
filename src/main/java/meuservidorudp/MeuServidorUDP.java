package meuservidorudp;

import java.net.*;
import java.io.*;


public class MeuServidorUDP {
    private static BaseDeDados bd = null;

    public static void main(String[] args) {
        DatagramSocket aSocket = null;
        bd = new BaseDeDados();
        bd.criarMatriz();
        
        try {
            aSocket = new DatagramSocket(6789);
            
            while(true) {


                byte[] buffer = new byte[600];
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);

                String message = new String(request.getData());

                bd.insere(message.toUpperCase());
                String resposta = bd.le();
                byte[] todasMsg = resposta.getBytes();

                DatagramPacket reply = new DatagramPacket(todasMsg, todasMsg.length, request.getAddress(), request.getPort());

                aSocket.send(reply);
            }
        }
        catch(SocketException zz) {
            System.out.println("SERVIDOR - Socket: " + zz.getMessage());
        }
        catch(IOException zz) {
            System.out.println("SERVIDOR: Input Output: " + zz.getMessage());
        }
        finally {
            if(aSocket != null) aSocket.close();
        }
    }
}
