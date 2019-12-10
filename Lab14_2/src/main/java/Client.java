import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Client {


    Client(Socket clientSocket, ServerSocket server, BufferedWriter out, BufferedReader in, BufferedReader reader ) throws IOException {
        try {
            clientSocket = new Socket("localhost", 8080);
            reader = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String word = "Something information";
            out.write(word + "\n");
            out.flush();
        } finally {
            clientSocket.close();
            in.close();
            out.close();
        }
    }
}
