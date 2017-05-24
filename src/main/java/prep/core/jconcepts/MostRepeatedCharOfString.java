/**
 * 
 */
package prep.core.jconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Hareesha May 24, 2017
 */
public class MostRepeatedCharOfString {

	/**
	 * Most repeated character of a given String Eg : aaaaaaaaaabcccccddeeef
	 */
	public static void main(String[] args) {
		Map<Character,Integer> res = getRepeatedChar("a000000000000000000nnnnnnnnnnssdefaaa");
		System.out.println(res.entrySet());
	}

	public static Map<Character,Integer> getRepeatedChar(String str) {
		
		Map<Character, Integer> cm = new HashMap<>();
		int max = 0;
		
		Map<Character,Integer> maxOccur = new HashMap<>();
		
		if (str == null) {
			System.out.println("String is Empty");
			return null;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' '){
				continue;
			}
			if (cm.containsKey(ch)) {
				int count = cm.get(ch);
				cm.put(ch, count + 1);
			} else {
				cm.put(ch, 1);
			}
			
			if(cm.get(ch) > max){
				max = cm.get(ch);
				maxOccur.clear();
				maxOccur.put(ch, max);
				
			}

		}
		System.out.println(cm.entrySet());
		
		//sorting HashMap based on value
		Map<Integer,Character> revmap = new TreeMap<>();
		
		for(Character ch : cm.keySet()){
			int val = cm.get(ch);
			revmap.put(val, ch);
		}
		System.out.println(revmap);
		return maxOccur;
	}

}
