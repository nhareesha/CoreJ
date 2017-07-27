/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems.strings;

/**
 * @author Hareesha
 * Jul 27, 2017 2017
 */
public class MinimumRotationsRequired {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aaa";
		String n="aaa";
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--){
			String res = n.substring(i)+n.substring(0,i);
			count++;
			if(res.equals(str)){
				System.out.println(count);
				break;
			}
			else{
				res=null;
			}
		
			
		}
	}

}
