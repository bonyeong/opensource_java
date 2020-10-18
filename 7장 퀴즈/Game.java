import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


class Nation {
	private String country, capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String recountry() {
		return country;
	}
	public String recapital() {
		return capital;
	}
}

public class Game {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Vector<Nation> v= new Vector<Nation>();
		v.add(new Nation("����", "������ "));
		v.add(new Nation("�׸���", "���׳�"));
		v.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		v.add(new Nation("����", "����"));
		v.add(new Nation("�߱�", "����¡"));


		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");


		while(true) {
			System.out.print("�Է� : 1 , ����:2 , ����: 3>>");
			int num = s.nextInt();
			if(num ==1)
			{
				if(v.isEmpty())
				{
					System.out.println("��� �ֽ��ϴ�.");
					break;
				}
				System.out.println("���� "+v.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) 
				{

					System.out.print("����� ���� �Է�"+(v.size()+1 )+">> ");
					String country = s.next();

					if(country.equals("�׸�"))
						break;
					
					String capital = s.next();
					
					int i = 0;
					while(i != v.size())
					{	
					if(v.get(i).recountry().equals(country))
					{	
						System.out.println(country +"�� �̹� �ֽ��ϴ�!");
					    break;
					}
					i++;
					}
					
					if(i >= v.size())
					v.add(new Nation(country, capital));
				}
			}
			else if(num ==2)
			{
				while(true) {
					Random r = new Random();
					int rand = r.nextInt(v.size());

					Nation nation = v.get(rand);
					String country = nation.recountry();
					String capital = nation.recapital();

					System.out.println(country + "�� ������?" );

					String answer = s.next();
					if(answer.equals(capital))
						System.out.println("����!!");
					else if(answer.equals("�׸�"))
						break;
					else
						System.out.println("�ƴմϴ�!!");
				}
			}
			else if(num ==3)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}


}


