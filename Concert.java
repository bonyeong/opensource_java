import java.util.Scanner;

class Seat{
	String name = null;
	
	public Seat(String name)
	{
		this.name = name;
	}
}


public class Concert{

	public static void main(String[] args) {

		Seat [] s = new Seat[100];
		Seat [] a = new Seat[100];
		Seat [] b = new Seat[100];

		Scanner scanner = new Scanner(System.in);
		String name;
		int n , num, seat;

		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		for(int i = 0;i<10;i++)
		{
			s[i] = new Seat(null);
			a[i] = new Seat(null);
			b[i] = new Seat(null);
			
		}

		while(true) {
			System.out.print("����: 1, ��ȸ:2, ���:3, ������:4>>");

			num = scanner.nextInt();
			if(num == 1)
			{
				System.out.print("�¼����� S(1) , A(2), B(3)>>");
				seat = scanner.nextInt();

				if(seat == 1)
				{
					System.out.print("S>>");

					for(int i =0; i<10;i++)
					{
						if(s[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(s[i].name);
					}
					System.out.println();
					System.out.print("�̸�>>");
					name = scanner.next();
					System.out.print("��ȣ>>");
					n = scanner.nextInt();
					if(n>10)
						System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
					if(s[n-1].name == null)
						s[n-1]= new Seat(name);
					else
						System.out.println("�ڸ��� �̹� ���� �Ǿ��ֽ��ϴ�.");
				}
				else if(seat == 2)
				{
					System.out.print("A>>");

					for(int i =0; i<10;i++)
					{
						if(a[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(a[i].name);
					}
					System.out.println();
					System.out.print("�̸�>>");
					name = scanner.next();
					System.out.print("��ȣ>>");
					n = scanner.nextInt();
					
					if(n>10)
						System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
					
					if(a[n-1].name == null)
					a[n-1]= new Seat(name);
					else
						System.out.println("�ڸ��� �̹� ���� �Ǿ��ֽ��ϴ�.");
				}
				else if(seat == 3)
				{
					System.out.print("B>>");

					for(int i =0; i<10;i++)
					{
						if(b[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(b[i].name);
					}
					System.out.println();
					System.out.print("�̸�>>");
					name = scanner.next();
					System.out.print("��ȣ>>");
					n = scanner.nextInt();
					if(n>10)
						System.out.println("���� ��ȣ�� �Է��ϼ̽��ϴ�.");
					
					if(b[n-1].name == null)
					b[n-1]= new Seat(name);
					else
						System.out.print("�ڸ��� �̹� ���� �Ǿ��ֽ��ϴ�.");
				}
			}
			else if(num ==2)
			{	
				System.out.print("S>>");
				for(int i = 0 ;i<10;i++)
				{
					if(s[i].name == null)
						System.out.print(" ---");
					else
					System.out.print(s[i].name);
				}
				System.out.println();
				System.out.print("A>>");
				for(int i = 0 ;i<10;i++)
				{
					if(a[i].name == null)
						System.out.print(" ---");
					else
					System.out.print(a[i].name);
				}
				System.out.println();
				System.out.print("B>> ");
				for (int i = 0;i<10;i++)
				{
					if(b[i].name == null)
						System.out.print(" ---");
					else
					System.out.print(b[i].name);
				}
				System.out.println();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
			else if (num == 3)
			{
				System.out.print("�¼����� S(1) , A(2), B(3)>>");
				seat = scanner.nextInt();
				
				if(seat == 1)
				{
					System.out.print("S>>");

					for(int i =0; i<10;i++)
					{
						if(s[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(s[i].name);
					}
					System.out.println();

					System.out.print("�̸�>>");
					name = scanner.next();
					int i = 0;
					while(i<10)
					{
						if(name.equals(s[i].name))
						{
							s[i].name = null;
							break;
						}
						i++;
					}
					
					if(i>=10)
						System.out.println("���� �̸����� �� ������ �������� �ʽ��ϴ�.");
				}
				else if(seat == 2)
				{
					System.out.print("A>>");

					for(int i =0; i<10;i++)
					{
						if(a[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(a[i].name);
					}
					System.out.println();
					
					System.out.print("�̸�>>");
					name = scanner.next();
					
					int i = 0;
					
					while(i<10)
					{	
						if(name.equals(a[i].name))
						{
							a[i].name = null;
							break;
						}
						i++;
					}
					if(i>=10)
						System.out.println("���� �̸����� �� ������ �������� �ʽ��ϴ�.");
				}
				else if(seat == 3)
				{
					System.out.print("B>>");

					for(int i =0; i<10;i++)
					{
						if(b[i].name == null)
							System.out.print(" ---");
						else
						System.out.print(b[i].name);
					}
					System.out.println();
					
					System.out.print("�̸�>>");
					name = scanner.next();
					int i = 0;
					while(i<10)
					{
						if(name.equals(b[i].name))
						{
							b[i].name = null;
							break;
						}
						i++;
					}
					if(i>=10)
						System.out.println("���� �̸����� �� ������ �������� �ʽ��ϴ�.");
				}
			}
			else if (num == 4)
			{
				System.out.println("���α׷��� ��Ĩ�ϴ�.");
				break;
			}
			else
			{
				System.out.println("���� �޴��� �Է��ϼ̽��ϴ�. ù ȭ������ ���ư��ϴ�.");
			}
		}
	}
}


