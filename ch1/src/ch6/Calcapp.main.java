package Calcapp.main;
//Calcをcalcapp.mainに所属させる
public class Calc{
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = calcapp.logics.CaliLogic.tasu(a,b);
		int delta = calcapp.logics.CaliLogic.tasu(a,b);
		System.out.println("足すと" + total + "引くと" + delta);
		
		
	}

}
