/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

/**
 * @author Hareesha
 * Jun 26, 2017 2017
 */
public class PermutationsOfPalindrom {

	/**
	 * If string is permutations of palindrom
	 * Eg : madddam , daamm ---/ true 
	 * because the string can be arranges as a palindroma
	 * 
	 * In any palindrom , there can be utmost one chracter that is present odd number of times
	 * 
	 * eg : m -2 , a - 2 , d - 1
	 * 
	 * that means only one character can be odd, utmost
	 * 
	 * maddeddam , mmaad , madeam
	 * 
	 * madd , ddam , damd 
	 */
	public static void main(String[] args) {
		String str = "madededam";
		int oddNumCount = 0;
		boolean oddfound = false;
		int[] cf = new int[128];
		for(char a : str.toCharArray()){
			cf[a]++;
		}
		char c = 0;
		for(char a : str.toCharArray()){
			/*if(cf[a]%2 != 0 && c!=a){
				oddNumCount++;
				c = a;
			}*/
			if(cf[a]%2 ==1 ){
				if(oddfound && c!=a){
					oddfound=false;
				}
				oddfound = true;
				c =a;
			}
		}
		if(oddfound==false){
			
		}
		if(oddNumCount>1){
			System.out.println("Not permutation of palindrom"+oddNumCount);
		}else{
			System.out.println("Permutaion of palindrom");
		}
	}

}
