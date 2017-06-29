/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * Jun 29, 2017 2017
 */
public class OneChangeAwayStrings {

	/**
	 * String that are one change away 
	 * pale pal
	 * pale gale
	 * pale paale
	 */
	public static void main(String[] args) {
		
		String s1 = "pale";
		String s2 = "palf";
		
		if(s1.length()==s2.length()){
			System.out.println(oneEditReplace(s1,s2));
		}
		
		String g1 = "pale";
		String g2 = "phe";
		
		if(g1.length()==g2.length()+1){
			System.out.println(oneEditInsert(g2,g1));
		}
		if(g1.length()+1==g2.length()){
		//	System.out.println(oneEditDelete(g1,g2));
		}
	}
	
	public static boolean oneEditReplace(String s1 , String s2){
		boolean found = false;
		for(int i = 0 ;i < s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(found){//again if diff is found it becomes true 
					return false;
				}
				found=true;//for first time it is set true
			}
			
		}

		return true;
	}
	
	public static boolean oneEditInsert(String x , String y){
		int indx1=0;
		int indx2=0;
		
		while(indx2<y.length() && indx1<x.length()){
			if(x.charAt(indx1)!=y.charAt(indx2)){
				if(indx1!=indx2){
					return false;
				}
				indx2++;
				
			}else{
				indx1++;
				indx2++;
			}
		}

		return true;
	}

}
