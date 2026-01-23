package ch17;

import java.io.FileWriter;

//変数fwのスコープを広げると・・・(エラー)
public class Main17_6 {

	public static void main(String[] args) {
		FileWriter fw =new FileWriter("data.txt");
		try {
			fw.write("hello");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}finally{
		fw.close();	
		}
		


	}

}
