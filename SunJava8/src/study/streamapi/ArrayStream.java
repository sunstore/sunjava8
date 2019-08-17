package study.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream 
{
	public static void main(String[] args)
	{
		String arr[] = new String[] {"��", "��", "��", "�ϳ�"};
		
		//�迭���� ��Ʈ�� ����
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//�迭���� Ư�� �κи� �̿��� ��Ʈ�� ����
		Stream<String> stream2 = Arrays.stream(arr, 1, 4);
		stream2.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		String arr2[] = new String[] { "��", "��", "�ϳ�"};
		
		//�迭���� ��Ʈ�� ����
		Stream<String> stream3 = Arrays.stream(arr2);
		stream3.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//�迭���� Ư�� �κи� �̿��� ��Ʈ�� ����
		Stream<String> stream4 = Arrays.stream(arr2, 2, 3);
		stream4.forEach(e -> System.out.print(e + " "));
	
		
	}
}
