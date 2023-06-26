package test011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demons {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean hasletter = true; 
		
		while(hasletter) {
			System.out.println("隊士,呼吸の名を入力してください");
			String str = reader.readLine();
			if(str.isEmpty()) {
				hasletter = true;
			}else {
				hasletter= false;
			}
		}
		//strが
		
	}

}


