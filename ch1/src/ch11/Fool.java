package ch11;

public class Fool extends Character implements Human {
	public void attack (Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	//Humanからの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {} 

}
