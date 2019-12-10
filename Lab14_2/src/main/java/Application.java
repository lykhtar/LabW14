import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {
    static BufferedReader in = null, reader;
    static BufferedWriter out = null;
    static ServerSocket server = null;
    public static void main(String[] args) throws IOException {
        Socket clientSocket = null;
        Server s = new Server(clientSocket,  server,  out,  in);
        Client s1 = new Client(clientSocket, server,  out,  in, reader);
    }
}
