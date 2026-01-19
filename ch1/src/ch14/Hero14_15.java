package ch14;
//静的メソッドから悲静的メンバを利用（エラー）
public class Hero14_15 {
	String name;
	int hp;
	static int money;
	
	public static void setRandomMoney() {
		Hero14_13.money = (int)(Math.random() * 1000);
		System.out.println(this.name + "たちの所持金を初期化しました");
			
		
	}

}
