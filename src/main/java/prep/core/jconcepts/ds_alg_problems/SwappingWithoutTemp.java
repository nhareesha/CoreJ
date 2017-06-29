/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * Jun 28, 2017 2017
 */
public class SwappingWithoutTemp {

	/**
	 * Swap wihtout using temporary variable
	 */
	public static void main(String[] args) {
		  //swap without temp
		   int i  =10;
		   int j =30;
		   System.out.println("Before swapping  : "+"i : "+i);
		   System.out.println("Before swapping  : "+"j : "+j);
		   i = i+ j ;
		   j = i- j;
		   i = i - j;
		   System.out.println("After swapping  : "+"i : "+i);
		   System.out.println("After swapping  : "+"j : "+j);
		   
		   //swapping two srting without use of temp
		   
		   String a1 = "hello";
		   String a2 = "hey";
		   System.out.println("Before swapping  : "+"a1 : "+a1);
		   System.out.println("Before swapping  : "+"a2 : "+a2);
		   a1 = a1+a2;
		   a2 = a1.substring(0,a1.length()-a2.length());
		   a1 = a1.substring(a2.length());
		   System.out.println("After swapping  : "+"a1 : "+a1);
		   System.out.println("After swapping  : "+"a2 : "+a2);
	}

}
