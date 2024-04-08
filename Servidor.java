import java.net.*;
import java.io.*;
import java.util.Scanner;

class Servidor{
    public static void main(String args[]){
        ServerSocket s = null;
        Socket cliente = null;

        try{
            s = new ServerSocket(9999);
        }catch(IOException e){
            System.out.print(e);
        }

        while (true){
            cliente = s.accept();
            new GestorPeticion(cliente).start():
        }catch(IOException e){
            System.out.print(e);
        }
    }
}

class GestorPeticion extends Thread {
    Socket s;

    public GestorPeticion (Socket s){
        this.s = s;
    }

    public void run(){
        DataInputStream sln
        PrintStream sOut;
        Scanner lee = new Scanner(System.in);

        try{
            sln = new DataInputStream(s.getInputStream())
            sOut = new PrintStream(s.getOutputStream());
            String texto = sln.readLine();
            System.out.print("Mensaje cliente= "+ texto);
            System.out.print("Dame respuesta del Servidor= ");
            String cad = lee.nextLine();
            sOut.print("Server: "+ cad);

            sln.close();
            sOut.close();
            s.close();
        }catch(IOException e){
            System.out.println(e):
        }
    }
}