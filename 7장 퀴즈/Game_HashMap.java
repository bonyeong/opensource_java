import java.util.*;
import java.util.Scanner;

public class Game_HashMap {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("독일", "베를린");
		h.put("그리스", "아테네");
		h.put("멕시코", "멕시코시티");
		h.put("영국", "런던");
		h.put("중국", "베이징");

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

		while(true) {
			System.out.print("입력 : 1 , 퀴즈:2 , 종료: 3>>");
			int num = s.nextInt();
			if(num ==1)
			{
				if(h.isEmpty())
				{
					System.out.println("비어 있습니다.");
					break;
				}
				System.out.println("현재 "+h.size()+"개 나라와 수도가 입력되어 있습니다.");
				while(true) 
				{

					System.out.print("나라와 수도 입력"+(h.size()+1)+">> ");
					String country = s.next();

					if(country.equals("그만"))
						break;
					
					String capital = s.next();

					if(h.containsKey(country))
						System.out.println(country +"는 이미 있습니다!");
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
					
					
					System.out.print(country[rand] + "의 수도는?" );
					String answer = s.next();
					if(answer.equals(capital[rand]))
						System.out.println("정답!!");
					else if(answer.equals("그만"))
						break;
					else
						System.out.println("아닙니다!!");

				}
			}
			else if(num ==3)
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
