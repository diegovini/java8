package java8.interfaces;

@FunctionalInterface
public interface FunctionInterface<T,R> {
	R apply(T t);

}
