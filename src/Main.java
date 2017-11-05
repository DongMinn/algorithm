
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2();
		No3();
		
	}
	public static void No2() {
		InterestingParty no2 = new InterestingParty();
		
		String f[] = {"computer", "music","math"};
		String s[] = {"computer", "drama","computer"};
		
		int result = no2.bestInvitation(f, s);
		
		System.out.println("2결과:"+result);
	}
	
	public static void No3() {
		Cryptography no3 = new Cryptography();
		int s [] = {1,1,3};
		long result = no3.encrypth(s);
		
		System.out.println("3결과:"+result);
	}

}
