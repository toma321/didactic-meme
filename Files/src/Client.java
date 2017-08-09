import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 10000);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("hello from the other side".getBytes());
		outputStream.close();
	}
}
