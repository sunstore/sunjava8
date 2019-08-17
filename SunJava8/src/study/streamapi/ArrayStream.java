package study.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream 
{
	public static void main(String[] args)
	{
		String arr[] = new String[] {"넷", "셋", "둘", "하나"};
		
		//배열에서 스트림 생성
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//배열에서 특정 부분만 이용한 스트림 생성
		Stream<String> stream2 = Arrays.stream(arr, 1, 4);
		stream2.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		String arr2[] = new String[] { "셋", "둘", "하나"};
		
		//배열에서 스트림 생성
		Stream<String> stream3 = Arrays.stream(arr2);
		stream3.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//배열에서 특정 부분만 이용한 스트림 생성
		Stream<String> stream4 = Arrays.stream(arr2, 2, 3);
		stream4.forEach(e -> System.out.print(e + " "));
	
		
	}
}
