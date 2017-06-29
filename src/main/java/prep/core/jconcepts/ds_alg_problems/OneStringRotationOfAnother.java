/**
 * 
 */
package prep.core.jconcepts.ds_alg_problems;

/**
 * @author Hareesha
 * Jun 28, 2017 2017
 */
public class OneStringRotationOfAnother {

	/**
	 * If one string is rotation of another string or not
	 * 
	 * s1 = "JavaJ2eeStrutsHibernate";
 
       s2 = "StrutsHibernateJavaJ2ee";
       
       true
	 */
	public static void main(String[] args) {
		//String s1 = "JavaJ2ssStrutsHibernate";
		// String s2 = "StrutsHibernateJavaJ2ss";
		
		String s1 = "hello";
		String s2=  "ohell";
	    
	   System.out.println(isARotation(s1,s2));

	}
	public static boolean isARotation(String s1 , String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		String s3 = s1+s1;
		if(s3.contains(s2)){
			return true;
		}
		
		
		
		return false;
	}

}
