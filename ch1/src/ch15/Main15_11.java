package ch15;
//現在日時を表示する
import java.util.Date;
public class Main15_11 {

	public static void main(String[] args) {
		Date now = new Date();//現在の時刻を表示
		System.out.println(now);
		System.out.println(now.getTime());
		Date past=new Date(1694984000000L);//時間を指定
		System.out.println(past);

	}

}
