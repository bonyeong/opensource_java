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
		v.add(new Nation("독일", "베를린 "));
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("멕시코", "멕시코시티"));
		v.add(new Nation("영국", "런던"));
		v.add(new Nation("중국", "베이징"));


		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");


		while(true) {
			System.out.print("입력 : 1 , 퀴즈:2 , 종료: 3>>");
			int num = s.nextInt();
			if(num ==1)
			{
				if(v.isEmpty())
				{
					System.out.println("비어 있습니다.");
					break;
				}
				System.out.println("현재 "+v.size()+"개 나라와 수도가 입력되어 있습니다.");
				while(true) 
				{

					System.out.print("나라와 수도 입력"+(v.size()+1 )+">> ");
					String country = s.next();

					if(country.equals("그만"))
						break;
					
					String capital = s.next();
					
					int i = 0;
					while(i != v.size())
					{	
					if(v.get(i).recountry().equals(country))
					{	
						System.out.println(country +"는 이미 있습니다!");
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

					System.out.println(country + "의 수도는?" );

					String answer = s.next();
					if(answer.equals(capital))
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


