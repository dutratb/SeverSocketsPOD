package controller;
import java.applet.Applet;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;


public class ClienteServer extends Applet {
	private static final long serialVersionUID = 1L;
	public static final int PORTA = 3000;
	public Socket clisocket;
	public TextArea OutputArea;
	public TextField InputArea, nomefield;
	public PrintStream out;
	public String Name;

	  public void init()
	  {
	    OutputArea=new TextArea(20,45);
	    InputArea=new TextField(45);
	    nomefield=new TextField(10);
	   
	    //Tela da Applet
	    add(new Label("Chat usando conexao - Socket"));
	    add(new Label("Nome do usuario"));
	    add(nomefield);
	    add(OutputArea);
	    add(new Label("Digite uma mensagem e pressione ENTER"));
	    add(InputArea);
	    resize(350,445);
	    try
	    {
	    	
	      clisocket = new Socket("127.0.0.1",PORTA);
	      
	      out = new PrintStream(clisocket.getOutputStream());
	      
	    }
	    catch(IOException e)
	    {
	      System.out.println(e);
	    }
	  }
	

	public static void main(String[] args) {

		new ClienteServer();
		
	}

}
