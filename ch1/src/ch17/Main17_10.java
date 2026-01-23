package ch17;
//try_with_resources文の利用
import java.io.*;
public class Main17_10 {

	public static void main(String[] args) {
		tyr (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		}catch(Exception e) {
			System.out.println("何かしらの例外が発生しました");
		}

	}

}
