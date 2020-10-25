import java.io.*;
import java.util.*;

public class SearchFile {
	public SearchFile() {}

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		Scanner s = new Scanner(System.in);

		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");

		String filename = s.next();
		int c;
		File getFile = new File(filename);

		try {
			FileReader fin = new FileReader(getFile);
			BufferedReader bufReader = new BufferedReader(fin);
			String line = " ";
			while((line = bufReader.readLine()) != null) {
				v.add(line);
			}
			bufReader.close();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		while(true) {
			System.out.print("검색할 단어나 문장>>");
			String words = s.next();

		if(words.equals("그만")){
			break;
		}
			Vector<Integer> nv = new Vector<Integer>();
	
			for(int i = 0; i<v.size();i++) {
				String line = v.get(i);
				if(line.indexOf(words) != -1)
					nv.add(i);
			}

			for(int j = 0; j<nv.size();j++) {
				int linenum = nv.get(j);
				String line2 = v.get(linenum);
				System.out.println(linenum +":" + line2);
			}
		}
		s.close();
		System.out.println("프로그램을 종료합니다.");
	}

}

