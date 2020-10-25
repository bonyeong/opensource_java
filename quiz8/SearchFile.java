import java.io.*;
import java.util.*;

public class SearchFile {
	public SearchFile() {}

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		Scanner s = new Scanner(System.in);

		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");

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
			System.out.print("�˻��� �ܾ ����>>");
			String words = s.next();

		if(words.equals("�׸�")){
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
		System.out.println("���α׷��� �����մϴ�.");
	}

}

