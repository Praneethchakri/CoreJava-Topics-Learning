package coreJava.lambda.topics;

@FunctionalInterface
public interface Condition<T> {
	public boolean test(T t);
}
