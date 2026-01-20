package ch15;
//6つのint値とDate型の相互変換
import java.util.Calendar;
import java.util.Date;
public class Main15_12 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//6つのインスタンスから生成
		c.set(2026,12,20,10,18,23);
		c.set(Calendar.MONTH,9);
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
