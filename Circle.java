import java.util.Scanner;
	

	public class Circle {
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
			
			int p1x = scanner.nextInt();
			int p1y = scanner.nextInt();
			int r1 = scanner.nextInt();
			
			System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
			
			int p2x = scanner.nextInt();
			int p2y = scanner.nextInt();
			int r2 = scanner.nextInt();
			double distance=Math.sqrt((p1x - p2x)*(p1x - p2x)+(p1y-p2y)*(p1y-p2y));
			
			if(distance <= r1+r2)
			System.out.println("�� ���� ���� ��ģ��.");
			else
				System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
			
		}
	}

