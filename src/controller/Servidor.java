package controller;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;


public class Servidor extends Thread {
	  int PORTA=3000;
	  protected int port;
	  protected ServerSocket server_port;
	  protected ThreadGroup CurrentConnections;
	  private Calendar datatual;

	  //Criar um ServerSocket
	  public Servidor()
	  {
	    super("Server");
	    this.port = PORTA;
	   
	    try
	    {
	      server_port=new ServerSocket(port);
	    } 
	    catch (IOException e)
	    {
	      System.out.println(e+"Exception");
	    }
   	    //Inicia o servidor e conexoes
	    CurrentConnections = new ThreadGroup("Server Connections");
	    System.out.println("=== ««« Conexoes Realizadas »»» ===");
	    this.start();
	  }
	
	
	  public void run()
	  {
	    try
	    {
	      while(true)
	      {
	        datatual = Calendar.getInstance();
	        Socket cliente_socket = server_port.accept();
	        
	        //Exibe o host do cliente, a porta e a data e hora da conexao
	        System.out.println("Host:"+cliente_socket.getInetAddress()+"Porta:"+
	        cliente_socket.getPort()+" Data: "+datatual.getTime());
	      }
	    }
	    catch(IOException e)
	    {
	      System.out.println(e+"Exception");
	    }
	  }

	  //Inicia o servidor
	  public static void main(String[] args)
	  {
	    new Servidor();
	  }
	}	
	  
	  
	
