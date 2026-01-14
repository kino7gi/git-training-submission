package ch10.SuperHero;

//Heroクラスを継承してSuperHeroを作り出す
//SuoerHeroの情報
public class SuperHero extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//10_5　run()を再定義
	//オーバーライド
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	//10_8attackをオーバーライド(上書き)したSuperHero
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
		if(this.flying) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
		}
	}
	//10_10の内容　コンストラクタの動作の確認をする
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタ");
	}

}
