package kadai1;
public class Main {

	public static void main(String[] args) {
		Figure f0 = new Circle();
		Figure f2 = new Line();
		Figure f3 = new Triangle(0, 0, 0, 0, 0, 0);
		Figure f4 = new Rectangle(0, 0, 0, 0);
		Figure f44 = new Square(0, 0, 0);
		
		System.out.println("番号を入力してください");
		System.out.println("0:円 2:線 3:三角形 4:長角形 44:正方形　＞");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input) {
		case 0 ->{
			System.out.println("[円を描画]");
			System.out.println("中心点()から半径周囲の長さは、");
			}
		case 2 ->{
			System.out.println("[線を描画]");
			System.out.println("始点から終点まで周囲の長さは、");
		}
		case 3 ->{
			System.out.println("[三角形を描画]");
			System.out.println("点1()から点2()、点3()の三角形周囲の長さは、内角の和は、");
		}
		case 4 ->{
			System.out.println("[長方形(短形)を描画]点()を基準として幅,高さの長方形周囲の長さは、内閣の和は、");
		}
		case 44 ->{
			System.out.println("[正方形を描画]点()を基準として幅・高さの正方形周囲の長さは、内角の和は、");
		}
		}
		System.out.println("終了します。");

	}

}
