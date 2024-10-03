package reflection.practice;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import reflection.practice.web.WebServer;

public class AccessingPrivateConstructor_WithReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		initConfiguration();
		WebServer server = new WebServer();
		server.startServer();
	}

	public static void initConfiguration() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<ServerConfiguration> constructor = ServerConfiguration.class.getDeclaredConstructor(int.class,
				String.class);
		constructor.setAccessible(true);
		constructor.newInstance(8080, "Good DaY!!!");
	}
}
