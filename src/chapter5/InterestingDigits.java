package chapter5;

import java.util.*;

public class InterestingDigits {
	public int[] digits(int base) {
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for(int n = 2; n< base; n++) {
//			boolean ok = true;
//			
//			for(int k1 = 0 ; k1<base; k1++) {
//				for(int k2 =  0; k2<base ; k2++) {
//					for(int k3 = 0 ; k3<base ; k3++) {
//						if((k1+k2*base+k3*base*base)%n ==0 && (k1+k2+k3)%n!=0) {
//							ok = false;
//							break;
//						}
//						
//					}
//					if(!ok) break;
//				}
//				if(!ok) break;
//				
//			}
//			if(ok) arr.add(n);
//		}
//		
//		int [] ans = new int[arr.size()];
//		for(int i =0 ; i<arr.size(); i++) ans[i] = arr.get(i);
//		
//		return ans;
		Vector<Integer> arr = new Vector<Integer>();
		for(int i = 2; i<base; i++) {
			if((base-1)%i==0) arr.add(i);
		}
		
		int [] ans = new int[arr.size()];
		for(int i =0 ; i< arr.size(); i++) ans[i] = arr.get(i);
		return ans;
	}
	
}
