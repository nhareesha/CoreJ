/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

/**
 * @author Hareesha
 * Jul 16, 2017 2017
 */
public class LongestPalindromeSequence {

	/**
	 * @param args
	 * 
	 * amadamaabc
	 * 
	 * amadama
	 * 
	 * 121334
	 * 121
	 */
	
	public static void main(String[] args) {
		String s = "121334";
		String res = longestPalindrom(s);
		System.out.println(res);
		
	}
	
	public static String longestPalindrom(String s){
		if(s==null){
			return null;
		}
		String pali ="";
		String longest = s.substring(0,1);
		for(int i = 0;i<s.length();i++){
			if(i%2==0){
				pali = getPalindromSeq(s, i, i+1);
				if(pali.length() > longest.length() ){
					longest = pali;
				}
			}else{
				pali = getPalindromSeq(s, i, i);
				if(pali.length() > longest.length() ){
					longest = pali;
				}
			}
			
		}
		
		return longest;
		
	}
	
	public static String getPalindromSeq(String s , int left , int right){
		if(left > right){
			return null;
		}
		
		while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1,right);
	}

}
