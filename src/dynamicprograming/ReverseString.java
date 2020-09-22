package dynamicprograming;

public class ReverseString {
	String returnStr = "";
	public static void main(String[] args) {
		String str = "Hello! ARA";
		ReverseString obj=new ReverseString();
		String revered = obj.reverseStr(str);
		System.out.println(revered);
	}

	private String reverseStr(String str) {
		
		if (str.length() == 1) {
			returnStr=str+returnStr;
		} else {
			returnStr = reverseStr(str.substring(1, (str.length()))) + str.substring(0, 1);
		}
		return returnStr;
	}

}
