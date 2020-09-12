import java.util.Scanner;
	

	public class calculate1 {
	

		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("연산>>");
			double num1 =scanner.nextDouble();
			String operator = scanner.next();
			double num2 = scanner.nextDouble();
			
			double sum = 0;
			
			if(operator.equals("+"))
				{sum = num1 + num2;
				System.out.println(num1 + operator+ num2 +"의 결과는 " + sum);
				}
			else if(operator.equals("-"))
			{			sum = num1 - num2;
			System.out.println(num1 + operator+ num2 +"의 결과는 " + sum);
			}else if(operator.equals("*")) {
				sum = num1 * num2;
				System.out.println(num1 + operator+ num2 +"의 결과는 " + sum);}
			else if(operator.equals("/"))
				if(num2 == 0)
					System.out.println("0으로 나눌  수 없습니다.");
				else {
				sum = num1 / num2;
				System.out.println(num1 + operator+ num2 +"의 결과는 " + sum);
				}
			scanner.close();
		}
	}
