package kadai1;
public class Main{
//メインメソッド
	public static void main(String[] args)throws Exception {
		Point point = new Point();
		Line line = new Line(0,100,0,100);
		Circle circle = new Circle(100,100,20);
		Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200);
		Rectangle rectangle = new Rectangle(0, 0, 100, 50);
		Square square = new Square(0, 0, 200);
		/**
		 * 番号を入力し図形の情報が出るように作成。
		 * 図形を表示したらプログラムは終了。
		 */
		System.out.println("番号を入力してください");
		System.out.println("0:円 2:線 3:三角形 4:長角形 44:正方形　＞");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input) {
		
		//円
		case 0 ->{
			circle.draw();
			System.out.println("周囲の長さは、" + circle.getPerimeter());
		}
		//線
		case 2 ->{
			line.draw();
			System.out.println("周囲の長さは、" + line.getPerimeter());
		}
		//三角形
		case 3 ->{
			triangle.draw();
			System.out.println("周囲の長さは、" + triangle.getPerimeter() + "内角の和は、180");
			
		}
		//長方形
		case 4 ->{
			rectangle.draw();
			System.out.println("周囲の長さは、" + rectangle.getPerimeter() + "内角の和は、360");
		}
		//正方形
		case 44 ->{
			square.draw();
			System.out.println("周囲の長さは、" + square.width * 4 + "内角の和は、360");

		}
		}
		System.out.println("終了します。");
 
	}

}
