package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachinTest {

	@Test
	void test() {
		fail("まだ実装されていません");
	}

	@Test
	public void ボタンを押すとコーラが返る(){
		//Arrange　
		//Act 2番目に書く
		VendingMachine sut = new VendingMachine();
		String item = sut.pushButton(); //sutとは、テスト対象のこととしてよく使われる。
		//Assert 　1番目に書く　
		assertEquals("コーラ",item); //返ってきたitemがコーラかどうかを判断する
		}
	
}
