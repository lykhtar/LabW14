import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    Server(Socket clientSocket, ServerSocket server, BufferedWriter out, BufferedReader in) throws IOException {
        try {
            server = new ServerSocket(8080);
            System.out.println("Server is open");
            clientSocket = server.accept();
            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                String word = in.readLine();
                System.out.println(word);
                out.write("Message to server : " + word + "\n");
                out.flush();
            } finally {
                clientSocket.close();
                in.close();
                out.close();
            }
        } finally {
            System.out.println("Server closed!");
            server.close();
        }
    }
}





