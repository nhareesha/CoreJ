/**
 * 
 */
package prep.core.jconcepts.ds.alg_arrays;

/**
 * @author Hareesha
 * Jul 28, 2017 2017
 */
public class PrimeNumbers {

	/**
	 * A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and 
	 * itself. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
	 */
	public static void main(String[] args) {
		int n= 50;
		int c = 0;
		for(int i = 1;i<=n;i++){
			c=0;
			for(int j = i;j>=1;j--){
				if(i%j == 0){
					c++;
				}
			}
			if(c==2){
				System.out.println(i);
			}
		}
	}

}
