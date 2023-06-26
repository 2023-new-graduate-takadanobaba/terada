package test002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String str;
		boolean isNum;

		do {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("数字を入力してください");
			str = reader.readLine();
			//数値がどうか判断して、結果をisNumにいれる
			try {
				Integer.parseInt(str);
				isNum = true;
			} catch (NumberFormatException e) {
				isNum = false;
			}
		} while (!isNum);
		System.out.println("数値が入力されました");
		int num = Integer.parseInt(str);
		if (num % 3 == 0) {
			System.out.println(num + "は3の倍数です");
		} else {
			System.out.println(num + "は3の倍数ではありません");
		}
	}
}

