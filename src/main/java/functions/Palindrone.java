package functions;

public class Palindrone {

	/**
	 * 
	 * @param String original
	 * @return true or false depending if the passed string is a palindrome 
	 */
	public static boolean isPalindromic(String original){
		
		String reverse="";
		for(int i=original.length()-1; i>=0; i--){
			reverse=reverse+=original.charAt(i);
		}	
		if(original.equals(reverse)){
			return true;
		}else{
			return false;
		}
	}


}
