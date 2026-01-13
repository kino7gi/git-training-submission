package ch10;

public class SuperHero extends Hero {
	//飛ぶ
	boolean flying;//新規追加したフィールド
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	//着陸する
	public void land() {
		this.flying = false;
		System.out.println("着陸した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
		if(this.flying) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた！");
		}
		public SuperHero(){
			System.out.println（"SuperHeroのコンストラクタが作動");
		}
	}
	

}
