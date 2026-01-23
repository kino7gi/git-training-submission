package ch17;
//例外処理を用意していないと・・・(エラー)
//try_catch文でException系例外の発生に備える
import java.io.FileWriter;
import java.io.IOException;
public class Main17_1_2 {
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("deta.txt");
		}catch (IOException e) {
		System.out.println("エラーが発生しました。");
		}
	}

}
