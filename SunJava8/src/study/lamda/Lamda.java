package study.lamda;

public class Lamda 
{
	public static void main(String[] args)
	{
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�������� ����� ��ȸ�� ������ ����");
			}
		}).start();
	

		// ���ٽ� ���
		new Thread(()->{
			System.out.println("���� ǥ������ ����� ��ȸ�� ������ ����");
		}).start();
		
	}

}