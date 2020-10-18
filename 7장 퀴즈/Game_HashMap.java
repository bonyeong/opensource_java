import java.util.*;
import java.util.Scanner;

public class Game_HashMap {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("����", "������");
		h.put("�׸���", "���׳�");
		h.put("�߽���", "�߽��ڽ�Ƽ");
		h.put("����", "����");
		h.put("�߱�", "����¡");

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");

		while(true) {
			System.out.print("�Է� : 1 , ����:2 , ����: 3>>");
			int num = s.nextInt();
			if(num ==1)
			{
				if(h.isEmpty())
				{
					System.out.println("��� �ֽ��ϴ�.");
					break;
				}
				System.out.println("���� "+h.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) 
				{

					System.out.print("����� ���� �Է�"+(h.size()+1)+">> ");
					String country = s.next();

					if(country.equals("�׸�"))
						break;
					
					String capital = s.next();

					if(h.containsKey(country))
						System.out.println(country +"�� �̹� �ֽ��ϴ�!");
					else
						h.put(country, capital);
				}
			}
			else if(num == 2)
			{
				Set<String> keys = h.keySet();
				Iterator<String> it= keys.iterator();

				String[] country =new String[h.size()];
				String[] capital =new String[h.size()];
				int i = 0;
				while(it.hasNext())
				{
					country[i] = it.next();
					capital[i] = h.get(country[i]);
					i++;
				}
				
				
				while(true) {
					Random r = new Random();
					int rand = r.nextInt(h.size());
					
					
					System.out.print(country[rand] + "�� ������?" );
					String answer = s.next();
					if(answer.equals(capital[rand]))
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
