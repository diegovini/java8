package java8.interfaces;

import java.util.List;

@FunctionalInterface
public interface ConsumerInterface<T> {
	void consume(T t);

}
