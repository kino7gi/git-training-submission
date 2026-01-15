package ch13.java;

import ch9.Sword;

//アクセス制限されていないHeroクラス↓
//hpフィールドをprivateにしたHeroクラス
public class Hero {
	private int hp;//←ここだけ制限
	private String name;//←王様クラスから呼び出せない
	Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {//メソッド全体を制限
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	public void attack(Matango m) {//attackメソッドはpublicにする
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃をうけた");
		this.hp -= 2;
		if(this.hp <=0) {
			this.die();
		}
	}
	public String getName() {
		return this.name;
	}
	//Heroクラスにsetterメソッドを追加
	public void setName(String name) {
		this.name = name;
	}

}
