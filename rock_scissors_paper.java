import java.util.Scanner;

public class rock_scissors_paper {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = (int)(Math.random()*3+1 );
		
		
		String user ;
		String computer = null;
		
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			user = scanner.next();
			
			switch(n)
			{case 1:
				computer = "����";
				break;
			case 2:
				computer = "����";
				break;
			case 3:
				computer = "��";
				break;
			}	
			
			if(user.equals("�׸�"))
				{System.out.println("������ �����մϴ�...");
				break;
				}
			
			if (user.equals(computer))
				System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", �����ϴ�.");
			else
			{
				if(user.equals("����"))
				{
					if(computer.equals("����"))
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ��ǻ�Ͱ� �̰���ϴ�.");
					else
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ����ڰ� �̰���ϴ�.");
				}
				else if(user.equals("����"))
				{
					if(computer.equals("����"))
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ����ڰ� �̰���ϴ�.");
					else
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(user.equals("��"))
				{
					if(computer.equals("����"))
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ��ǻ�Ͱ� �̰���ϴ�.");
					else
						System.out.println("�����  = "+ user + ", ��ǻ�� = "+computer+", ����ڰ� �̰���ϴ�.");
							
				}
			}
		}
	}
}
