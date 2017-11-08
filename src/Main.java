import chapter5.Cryptography;
import chapter5.FriendScore;
import chapter5.InterestingParty;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No5_1();
		No5_2();
		No5_5();
		
	}
	public static void No5_1() {
		InterestingParty no2 = new InterestingParty();
		
		String f[] = {"computer", "music","math"};
		String s[] = {"computer", "drama","computer"};
		
		int result = no2.bestInvitation(f, s);
		
		System.out.println("5_1������:"+result);
	}
	
	public static void No5_2() {
		Cryptography no3 = new Cryptography();
		int s [] = {1,1,3};
		long result = no3.encrypth(s);
		
		System.out.println("5_2������:"+result);
	}
	public static void No5_5() {
		FriendScore no5 = new FriendScore();
		String s [] = {"NYNNN" , "YNYNN" , "NYNYN","NNYNY","NNNYN"};
		
		int result = no5.highestScore(s);
		
		System.out.println("No5: "+ result);
	}

}
