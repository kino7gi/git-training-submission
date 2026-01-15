package ch13.java;
//宿屋クラスの不具合
public class Inn {
	public void checkIn(Hero h) {
		h.hp = -100;//ここが不具合の原因
	}

}