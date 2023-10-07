package regulerExpressionsInJava;

import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		
	
	boolean matchesStatus = Pattern.matches(".+jav","java");
	
	if(matchesStatus) {
		System.out.println("Matched");
	}
	else {
		System.out.println("not matched");
	}
	
	
		
}

}
