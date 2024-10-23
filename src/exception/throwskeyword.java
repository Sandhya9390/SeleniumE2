package exception;
import java.io.IOException;
public class throwskeyword {
	public static void m1() throws IOException
	{
		throw new IOException();
	}
	public static void main(String[] args) throws IOException{
		m1();
		
	}
}



