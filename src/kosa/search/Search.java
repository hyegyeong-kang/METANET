package kosa.search;

public class Search {
	// 입력받은 문자열, 찾을 문자열
	private String inputString;
	private char searchChar;
	private int total;
	
	public Search() {}
	
	public Search(String inputString, char searchChar) {
		super();
		this.inputString = inputString;
		this.searchChar = searchChar;
	}
	
	public Search(String inputString) {
		super();
		this.inputString = inputString;
	}
	
	public void searchCharNum() {
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == searchChar) {
				total++;
			}
		}
		
	}
	
	public void searchLongWord() {
		String[] word = inputString.split(" ");
		int length = 0;
		int index = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > length) {
				length = word[i].length();
				index = i;
			}
		}
		System.out.print("가장 긴 단어:" + word[index]);
	}
	
	public void print() {
		System.out.println(total);
	}

}
