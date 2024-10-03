package reflection.practice.web;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpServer;

import reflection.practice.ServerConfiguration;

public class WebServer {

	public void startServer() throws IOException {
		HttpServer server = HttpServer.create(ServerConfiguration.getInstance().getServerAddress(), 0);

		server.createContext("/greetings").setHandler(exchange -> {
			String responseMessage = ServerConfiguration.getInstance().getGreetingMessage();
			exchange.sendResponseHeaders(200, responseMessage.length());

			OutputStream responseBody = exchange.getResponseBody();

			responseBody.write(responseMessage.getBytes());

			responseBody.flush();
			responseBody.close();
		});

		System.out.println(String.format("Starting Server on Address %s: %d",
				ServerConfiguration.getInstance().getServerAddress().getHostName(),
				ServerConfiguration.getInstance().getServerAddress().getPort()));
		server.start();
	}

}
