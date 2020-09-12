import java.util.Scanner;
	

	public class Circle {
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("첫번째 원의 중심과 반지름 입력>>");
			
			int p1x = scanner.nextInt();
			int p1y = scanner.nextInt();
			int r1 = scanner.nextInt();
			
			System.out.print("두번째 원의 중심과 반지름 입력>>");
			
			int p2x = scanner.nextInt();
			int p2y = scanner.nextInt();
			int r2 = scanner.nextInt();
			double distance=Math.sqrt((p1x - p2x)*(p1x - p2x)+(p1y-p2y)*(p1y-p2y));
			
			if(distance <= r1+r2)
			System.out.println("두 원은 서로 겹친다.");
			else
				System.out.println("두 원은 서로 겹치지 않는다.");
			
		}
	}

