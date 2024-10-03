package reflection.practice;

import java.net.InetSocketAddress;

public class ServerConfiguration {

	private final InetSocketAddress serverAddress;

	private final String greetingMessage;

	private static ServerConfiguration serverConfiguration;

	private ServerConfiguration(int port, String message) {
		this.greetingMessage = message;
		this.serverAddress = new InetSocketAddress("localhost", port);
		
		if (serverConfiguration == null) {
			serverConfiguration = this;
		}
	}

	public static ServerConfiguration getInstance() {
		return serverConfiguration;
	}

	public InetSocketAddress getServerAddress() {
		return this.serverAddress;
	}

	public String getGreetingMessage() {
		return this.greetingMessage;

	}
}
