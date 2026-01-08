package ch6;
//正しく修正したCali.java
public class Calc6_4 {

	public static void main(String[] args) {
		int a =10; int b = 2;
		int total = CaliLogic6_2.tasu(a + b);
		int delta = CaliLogic6_2.hiku(a - b);
		System.out.println("足すと" + total + "引くと" + delta);

	}

}
