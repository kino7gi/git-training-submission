package ch18;
import java.io.InputStream;//データをバイト単位で読み込むためのもの
import java.net.URL;//WEBページの場所を表す
public class Main18_3 {

	public static void main(String[] args) throws Exception{//通信エラーが起きたらとりあえず実行を止める
		URL u = new URL("https://book.impress.co.jp/"); 
		InputStream is = u.openStream();
		int i = is.read();
		while(i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}
		

	}

}
