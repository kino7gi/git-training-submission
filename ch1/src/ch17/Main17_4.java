package ch17;

import java.io.FileWriter;
import java.io.IOException;

//try_catchの後でcloseすると・・・(エラー)
public class Main17_4 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");//本来の処理
			fw.write("hello");
		}catch(IOException e) {
		 System.out.println("エラーです");//エラーが発生した時の処理
		}
		fw.close();

	}

}
