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

		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		for(int i = 0;i<10;i++)
		{
			s[i] = new Seat(null);
			a[i] = new Seat(null);
			b[i] = new Seat(null);
			
		}

		while(true) {
			System.out.print("예약: 1, 조회:2, 취소:3, 끝내기:4>>");

			num = scanner.nextInt();
			if(num == 1)
			{
				System.out.print("좌석구분 S(1) , A(2), B(3)>>");
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
					System.out.print("이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					n = scanner.nextInt();
					if(n>10)
						System.out.println("없는 번호를 입력하셨습니다.");
					if(s[n-1].name == null)
						s[n-1]= new Seat(name);
					else
						System.out.println("자리가 이미 예약 되어있습니다.");
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
					System.out.print("이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					n = scanner.nextInt();
					
					if(n>10)
						System.out.println("없는 번호를 입력하셨습니다.");
					
					if(a[n-1].name == null)
					a[n-1]= new Seat(name);
					else
						System.out.println("자리가 이미 예약 되어있습니다.");
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
					System.out.print("이름>>");
					name = scanner.next();
					System.out.print("번호>>");
					n = scanner.nextInt();
					if(n>10)
						System.out.println("없는 번호를 입력하셨습니다.");
					
					if(b[n-1].name == null)
					b[n-1]= new Seat(name);
					else
						System.out.print("자리가 이미 예약 되어있습니다.");
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
				System.out.println("<<<조회를 완료하였습니다.>>>");
			}
			else if (num == 3)
			{
				System.out.print("좌석구분 S(1) , A(2), B(3)>>");
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

					System.out.print("이름>>");
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
						System.out.println("현재 이름으로 한 예약이 존재하지 않습니다.");
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
					
					System.out.print("이름>>");
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
						System.out.println("현재 이름으로 한 예약이 존재하지 않습니다.");
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
					
					System.out.print("이름>>");
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
						System.out.println("현재 이름으로 한 예약이 존재하지 않습니다.");
				}
			}
			else if (num == 4)
			{
				System.out.println("프로그램을 마칩니다.");
				break;
			}
			else
			{
				System.out.println("없는 메뉴를 입력하셨습니다. 첫 화면으로 돌아갑니다.");
			}
		}
	}
}


