package java8.interfaces;

@FunctionalInterface
public interface Function<T,R> {
	R apply(T t);

}
