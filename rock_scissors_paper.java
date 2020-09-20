import java.util.Scanner;

public class rock_scissors_paper {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = (int)(Math.random()*3+1 );
		
		
		String user ;
		String computer = null;
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			
			switch(n)
			{case 1:
				computer = "가위";
				break;
			case 2:
				computer = "바위";
				break;
			case 3:
				computer = "보";
				break;
			}	
			
			if(user.equals("그만"))
				{System.out.println("게임을 종료합니다...");
				break;
				}
			
			if (user.equals(computer))
				System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 비겼습니다.");
			else
			{
				if(user.equals("가위"))
				{
					if(computer.equals("바위"))
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 컴퓨터가 이겼습니다.");
					else
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 사용자가 이겼습니다.");
				}
				else if(user.equals("바위"))
				{
					if(computer.equals("가위"))
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 사용자가 이겼습니다.");
					else
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 컴퓨터가 이겼습니다.");
				}
				else if(user.equals("보"))
				{
					if(computer.equals("가위"))
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 컴퓨터가 이겼습니다.");
					else
						System.out.println("사용자  = "+ user + ", 컴퓨터 = "+computer+", 사용자가 이겼습니다.");
							
				}
			}
		}
	}
}
