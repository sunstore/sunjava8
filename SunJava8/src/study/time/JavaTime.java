package study.time;

import java.time.LocalDate;

public class JavaTime 
{
	public static void main(String[] args)
	{
		//java.time.LocalDate
		LocalDate today = LocalDate.now();
		System.out.println("올해는 " + today.getYear() + "년입니다.");
		System.out.println("오늘은 " + today.getMonthValue() + "월 "+ today.getDayOfMonth() + "일입니다.");
		LocalDate otherDay = today.withYear(1993);
		
		System.out.println("올해는 " + otherDay.getYear() + "년입니다.");
	}
}
