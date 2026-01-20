package ch15;
//String型とDate型の相互変換
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main15_13 {

	public static void main(String[] args)throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//文字列からDateインスタンスを生成
		Date d = f.parse("2026/01/20 11:20:56");
		System.out.println(d);
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
	}

}
