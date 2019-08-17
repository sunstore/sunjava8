package study.time;

import java.time.LocalDate;

public class JavaTime 
{
	public static void main(String[] args)
	{
		//java.time.LocalDate
		LocalDate today = LocalDate.now();
		System.out.println("���ش� " + today.getYear() + "���Դϴ�.");
		System.out.println("������ " + today.getMonthValue() + "�� "+ today.getDayOfMonth() + "���Դϴ�.");
		LocalDate otherDay = today.withYear(1993);
		
		System.out.println("���ش� " + otherDay.getYear() + "���Դϴ�.");
	}
}
