import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Copyright 2004-2020 by xdja.com  All rights reserved.
 *
 * @author xxx
 * @version 1.0.0
 * @ClassName Main.java
 * @Description TODO
 * @createTime 2020/03/26 21:23:19
 */
public class Main {
	public static void main(String[] args) {
		/*Integer a = 1;*/
		distinctByKeyOrigin(a -> a);
	}

	void Function(Method method) {
		Function f = Function.identity();
		method = (Method) f.apply(method);
		System.out.println(method);
		method.m();
	}

	public static <T> Predicate<T> distinctByKeyOrigin(Function<? super T, Object> keyExtractor) {
		HashMap<Object, Boolean> seen = new HashMap<>();
		object -> seen.put(keyExtractor.apply(object), Boolean.TRUE) == null;
		return object -> seen.put(keyExtractor.apply(object), Boolean.TRUE) == null;
	}

}
