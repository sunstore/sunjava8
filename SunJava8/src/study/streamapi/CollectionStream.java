package study.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream = list.stream();
		Stream<String> parallelStream = list.parallelStream(); //º´·Ä
		
		stream.forEach(e -> System.out.print(e + " "));
		System.out.println();
		parallelStream.forEach(e -> System.out.print(e + " "));
		
	}
}
