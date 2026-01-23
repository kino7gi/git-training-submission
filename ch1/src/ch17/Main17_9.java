package ch17;
//ファイルをひらいた時だけ後片付けをする
import java.io.*;
public class Main17_9 {

	public static void main(String[] args) {
		FileWriter  fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}finally{
			if(fw != null) {
				try {
					fw.close();
				}catch (IOException e) {
			}
		}

	}

}
