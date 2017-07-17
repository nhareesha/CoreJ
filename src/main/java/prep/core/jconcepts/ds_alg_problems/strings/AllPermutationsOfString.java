/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

import java.util.LinkedHashSet;

/**
 * @author Hareesha
 * Jul 16, 2017 2017
 */
public class AllPermutationsOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abc";
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		permutations("",s,list);
		System.out.println(list);
	}
	
	/**
	 * We go over all the characters  of suffix and add one by one to prefix
	 * @param prefix
	 * @param suffix
	 * @param results
	 */
	public static void permutations(String prefix , String suffix , LinkedHashSet<String> results ){
		if(suffix.length() == 0){
			results.add(prefix);
		}
		for(int i = 0;i<suffix.length();i++){
			
			permutations(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),results);
		}
	}

}
