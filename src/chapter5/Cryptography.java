package chapter5;
import java.util.*;
public class Cryptography {
	
	public long encrypth(int[] numbers) {
		long ans=0;
		
//		int i , j;
//		HashMap<Integer, Long> dic = new HashMap<Integer, Long>();
//		
//		long value= 1;
//		
//		for(i = 0 ; i<numbers.length; i++) {
//			dic.put(i, 0L);
//			for(j =  0; j<numbers.length; j++) {
//				if(i==j) value*= (numbers[j]+1);
//				else {
//					value*=numbers[j];
//				}
//			}
//			dic.put(i, value);
//		}
//		
//		for(Integer key :dic.keySet()) {
//			ans = Math.max(ans, dic.get(key));
//		}
//		return ans;
		
		long ret = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		
		for(int i =0 ; i<numbers.length; i++) {
			ret*=numbers[i];
		}
		
		return ret;
	}
}
