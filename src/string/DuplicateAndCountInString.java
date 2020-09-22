package string;

public class DuplicateAndCountInString {

	public static void main(String[] args) {
		String word="oodles Technologies";
        char[] str=word.toCharArray();
		for(int i=0; i<str.length;i++) {
			int count=1;
			for(int j=i+1; j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=' ') {
					count=count+1;
					str[j]='0';
				}	
			}if(str[i]!='0' && str[i]!=' ' ) {
				System.out.println(str[i]+" = "+count);
			}
			
		}
	}

}
