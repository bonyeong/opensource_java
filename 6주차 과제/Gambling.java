import java.util.Scanner;
import java.util.Random;

class Person3{
	Random r = new Random();
	int num1, num2, num3;
	String name;

	public boolean rand() {
		num1 = r.nextInt(3)+1;
		num2 = r.nextInt(3)+1;
		num3 = r.nextInt(3)+1;
		System.out.print(" "+num1+" "+num2+" "+num3+" ");

		if (num1 == num2&&num2==num3)
			return true;
		else
			return false;
	}
}


public class Gambling {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		String buffer;
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();

		System.out.print("1번째 선수 이름>>");
		p1.name = s.next();
		System.out.print("2번째 선수 이름>>");
		p2.name = s.next();

		while(true) {

			System.out.println("[" + p1.name + "]:<Enter>");
			buffer = s.nextLine();

			if(p1.rand()== true)
			{
				System.out.println(p1.name+"님이 이겼습니다!");
				break;
			}
			else
			{
				System.out.println("아쉽군요!");
				System.out.println();
			}
			System.out.println("["+p2.name+"]:<Enter>");
			buffer = s.nextLine();

			if(p1.rand()== true)
			{
				System.out.println(p1.name+"님이 이겼습니다!");
				break;
			}
			else
			{
				System.out.println("아쉽군요!");
				System.out.println();
			}

		}
		s.close();
	}
}
