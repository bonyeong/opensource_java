import java.util.Scanner;
	

	public class calculate1 {
	

		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("����>>");
			double num1 =scanner.nextDouble();
			String operator = scanner.next();
			double num2 = scanner.nextDouble();
			
			double sum = 0;
			
			if(operator.equals("+"))
				{sum = num1 + num2;
				System.out.println(num1 + operator+ num2 +"�� ����� " + sum);
				}
			else if(operator.equals("-"))
			{			sum = num1 - num2;
			System.out.println(num1 + operator+ num2 +"�� ����� " + sum);
			}else if(operator.equals("*")) {
				sum = num1 * num2;
				System.out.println(num1 + operator+ num2 +"�� ����� " + sum);}
			else if(operator.equals("/"))
				if(num2 == 0)
					System.out.println("0���� ����  �� �����ϴ�.");
				else {
				sum = num1 / num2;
				System.out.println(num1 + operator+ num2 +"�� ����� " + sum);
				}
			scanner.close();
		}
	}
