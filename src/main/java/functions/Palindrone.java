package functions;

public class Palindrone {

	/**
	 * Returns true or false depending if string passed in is the same when reveresed
	 * @param value the string to be checked
	 * @return boolean true or false
	 */
	public static boolean isPalindromic(String value){
		return value.equals(reverseString(value));
	}


	public static String reverseString(String value){
		return new StringBuilder(value).reverse().toString();
	}

}
