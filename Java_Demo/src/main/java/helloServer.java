import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class helloServer {
    public static void main(String[] args) throws Exception {

        //Create a server that listens on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        //Create a page at the address /hello
        server.createContext("/hello", exchange -> {
            String message = "Hello from my first Java server!";

            // send the message to the browser
            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });
        //Create a page at the address /about
        server.createContext("/about", exchange -> {
            String message = "This server is part of my FSD practice.";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        server.createContext("/time", exchange -> {
            String message = "Current time: " + java.time.LocalDateTime.now();

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });
        server.createContext("/status", exchange -> {
            String message = "Server is running on port 8080";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });
        server.createContext("/info", exchange -> {
            String message = "Available pages: /hello, /about, /time, /status, /info";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });
        //Start the server
        server.start();
        System.out.println("Server started. Open http://localhost:8080/hello");
    }
}
