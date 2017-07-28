/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Hareesha
 * Jul 27, 2017 2017
 */
public class LongestPossibleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[]{20,21,202,4,5,90,9,70,7};
		String[] str = new String[arr.length];
		for(int i = 0 ; i < arr.length;i++){
			str[i] = Integer.toString(arr[i]);
		}
	//	Arrays.sort(str);
		Arrays.sort(str, new Comparator<String>(){
			public int compare(String o1,String o2){
				if((o1+o2).compareTo(o2+o1) > 0){
					return -1;
				}else if((o1+o2).compareTo(o2+o1)<0){
					return 1;
				}
				return 0;
			}
		});
		System.out.println(Arrays.toString(str));
		String res="";
		for(String s : str){
			res=res+s;
		}
		
		System.out.println(res);
	}

}
