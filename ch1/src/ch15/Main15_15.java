package ch15;
//LocalDateTimeを利用する
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main15_15 {

	public static void main(String[] args) {
		//LocalDateTimeの利用
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2024,1,1,9,5,0,0);
		
		//LocalDateTimeとZonerDateTimeとの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europ/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		

	}

}
