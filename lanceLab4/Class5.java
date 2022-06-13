package lanceLab4;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
Test cases
stringTimes("Hi", 2)  "HiHi"
stringTimes("Hi", 3)  "HiHiHi"
stringTimes("Hi", 1)  "Hi"
*/


public class Class5{

	private String phrase;
	private int num;
	
	Class5(){
	}
	
	Class5(String phrase, int num){
		this.phrase = phrase;
		this.num = num;
	}
	
	public String getPhrase() {
		return phrase;
	}
	
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String copy(String phrase, int num) {
		char[] arr = phrase.toCharArray();
		String count = "";
		for(int i = 1; i <= num; i++) {
			for(char a : arr) {
				count += a;
			}
		}
		return count;
	}
	
	
}