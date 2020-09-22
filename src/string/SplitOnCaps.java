package string;
import java.util.Arrays;

public class SplitOnCaps {
	public static void main(String[] args) {

		String str = "ThisIsMyString";
		String[] SplitArr = str.split("(?=\\p{Upper})");
		System.out.println(Arrays.toString(SplitArr));

	}
}
