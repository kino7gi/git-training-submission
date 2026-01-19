package ch14;
//静的フィールドmoneyへのアクセス
//インスタンスから静的フィールドを利用する
//newしなくても静的フィールドは利用できる
public class Main14_10 {

	public static void main(String[] args) {
		Hero14_8 h1 = new Hero14_8();
		Hero14_8 h2 = new Hero14_8();
		Hero14_8.money = 100;
		System.out.println(h1.money);
		System.out.println(Hero14_8.money);//ここから下だけでも静的フィールドは利用できる
		h1.money = 300;
		System.out.println(h2.money);

	}

}
