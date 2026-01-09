package calcapp.main;
//6章の見本全て記入
public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = calcapp.logic.CalcLogic.tasu(a,b);
		int delta = calcapp.logic.CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "引くと" + delta);

	}

}
