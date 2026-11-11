/*
 * helloServer.java
 * A simple Java web server built with the JDK's built-in HttpServer.
 * Pages: /hello, /about, /time, /status, /info, /visits, /reset, /uptime
 * Run this file, then open http://localhost:8080/info in a browser.
 */

import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class helloServer {

    // the port number the server listens on
    static final int PORT = 8080;

    // counts how many times the /hello page has been opened
    static int visitCount = 0;

    // remembers when the server started (in milliseconds)
    static long startTime = System.currentTimeMillis();

    public static void main(String[] args) throws Exception {

        // 1. Create a server that listens on the PORT number
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // 2. Create a page at the address /hello
        server.createContext("/hello", exchange -> {
            visitCount++;
            String message = "Hello from my first Java server! Visits: " + visitCount;

            // send the message to the browser
            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 3. Create another page at the address /about
        server.createContext("/about", exchange -> {
            String message = "This server is part of my FSD practice.";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 4. Create a page at /time that shows the current date and time
        server.createContext("/time", exchange -> {
            String message = "Current time: " + java.time.LocalDateTime.now();

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 5. Create a page at /status that shows the server is running
        server.createContext("/status", exchange -> {
            String message = "Server is running on port " + PORT;

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 6. Create a page at /info that lists all the available pages
        server.createContext("/info", exchange -> {
            String message = "Available pages: /hello, /about, /time, /status, /info";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 7. Create a page at /visits that shows the count without increasing it
        server.createContext("/visits", exchange -> {
            String message = "Total visits to /hello: " + visitCount;

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 8. Create a page at /reset that sets the visit count back to 0
        server.createContext("/reset", exchange -> {
            visitCount = 0;
            String message = "Visit count has been reset to 0";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 9. Create a page at /uptime that shows how long the server has been running
        server.createContext("/uptime", exchange -> {
            long seconds = (System.currentTimeMillis() - startTime) / 1000;
            String message = "Server has been running for " + seconds + " seconds";

            exchange.sendResponseHeaders(200, message.length());
            OutputStream os = exchange.getResponseBody();
            os.write(message.getBytes());
            os.close();
        });

        // 10. Start the server
        server.start();
        System.out.println("Server started. Open http://localhost:8080/hello");
        System.out.println("Also try http://localhost:8080/about");
        System.out.println("And try http://localhost:8080/time");
        System.out.println("And try http://localhost:8080/status");
        System.out.println("And try http://localhost:8080/info");
        System.out.println("And try http://localhost:8080/visits");
        System.out.println("And try http://localhost:8080/reset");
        System.out.println("And try http://localhost:8080/uptime");
    }
}