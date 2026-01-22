package rennsyuu15;

public class Main15_2 {
	public String concatPath(String folder, String file) {
		if(!folder.endsWith ("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}

}
