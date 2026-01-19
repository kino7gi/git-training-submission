package rennsyuu14;

public class Account {
	String AccountNumber;
	int balance;
	
	public String toString() {
		return "¥¥" + this.balance +"(口座番号: "+ this.AccountNumber +")";
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (o instanceof Account a) {
			String an1 = this.AccountNumber.trim();
			String an2 = a.AccountNumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
			
		}
		return false;
	}

}
