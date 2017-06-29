/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

/**
 * @author Hareesha
 * Jun 29, 2017 2017
 */
public class StringCompression {

	/**
	 * see and say prob
	 * aacbbddf
	 * a2c1b2d2f1
	 */
	public static void main(String[] args) {
		String s1 = "aaabbceerrf";
		System.out.println(seeAndSay(s1));

	}
	public static String seeAndSay(String s){
		
		int i = 0;
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while(i<s.length()){
			if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
				count++;
			}else{
				sb.append(s.charAt(i));
				sb.append(count);
				count=1;
				
			}
			i++;
		}
		return sb.toString();
		
	}

}
