package ch18;
//ファイルから1文字ずつ読み込む
import java.io.FileReader;
public class Main18_1 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("data.txt");//テキストファイルを開く
		int input = fr.read();
		while(input != -1) {//もう読めるものがないと知らせるためのもの
			System.out.println((char)input);
			input = fr.read();
		}
		fr.close();
		

	}

}
