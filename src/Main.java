import chapter5.Cryptography;
import chapter5.InterestingParty;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No5_1();
		No5_2();
		
	}
	public static void No5_1() {
		InterestingParty no2 = new InterestingParty();
		
		String f[] = {"computer", "music","math"};
		String s[] = {"computer", "drama","computer"};
		
		int result = no2.bestInvitation(f, s);
		
		System.out.println("5_1번문제:"+result);
	}
	
	public static void No5_2() {
		Cryptography no3 = new Cryptography();
		int s [] = {1,1,3};
		long result = no3.encrypth(s);
		
		System.out.println("5_2번문제:"+result);
	}

}
