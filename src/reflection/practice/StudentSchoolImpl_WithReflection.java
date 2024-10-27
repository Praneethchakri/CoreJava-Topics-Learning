package reflection.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSchoolImpl_WithReflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		printConstructorDetails(Student.class);

		Student s = createObejct(Student.class, 1, "Praneeth", "Frankfurt");
		System.out.println(s);
	}

	// DynamicObject Creation based on the Class Name and parameter Details
	// Generic Factory Method can take any number of args and find the right constructor
	public static <T> T createObejct(Class<T> clazz, Object... params)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
			if (constructor.getParameterTypes().length == params.length) {
				return (T) constructor.newInstance(params);
			}
		}
		System.out.println("No Matching Constructor Found ...!!");
		return null;
	}

	// Fetch Class Constructors and Parameter Types
	public static void printConstructorDetails(Class<?> clazz) {

		Constructor<?>[] constructors = clazz.getDeclaredConstructors();

		System.out.println(String.format("Declared class Name %s with Constructor %d  Count ", clazz.getSimpleName(),
				constructors.length));

		for (int i = 0; i < constructors.length; i++) {
			Class<?>[] paramterTypes = constructors[i].getParameterTypes();

			List<String> addingParamter = Arrays.stream(paramterTypes).map(params -> params.getCanonicalName())
					.collect(Collectors.toList());
			System.out.println("Details " + addingParamter);
		}

	}
}
