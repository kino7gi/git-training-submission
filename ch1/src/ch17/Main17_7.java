package ch17;
//tryブロック内でnewすると・・・(エラー)
import java.io.*;
public class Main17_7 {

	public static void main(String[] args) {
		FileWriter fw =null;//nullを挿入
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		}catch (Exception e);
		System.out.println("何らかの例外が発生しました。");
	}finally {
		fw.close();
	}

}
