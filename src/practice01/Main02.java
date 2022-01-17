package practice01;

public class Main02 {
	String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		
		return folder + file;
	}
}
