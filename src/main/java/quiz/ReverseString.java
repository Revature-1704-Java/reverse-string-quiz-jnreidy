package quiz;

import java.lang.StringBuilder;

public class ReverseString {
	//using recursion base case string length <= 1 build up end as recurse down then build up beginning
    public String reverse(String input) {
       // return new StringBuffer(input).reverse().toString();
    		String str = "";
    		if(input.length() <= 1) {
    			return input;
    		} else {
    			str = input.charAt(input.length() - 1) + reverse(input.substring(1, (input.length() - 1))) + input.charAt(0);
    			return str;
    		}
    }
}
