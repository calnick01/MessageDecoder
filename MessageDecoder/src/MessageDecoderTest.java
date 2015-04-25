import java.util.Scanner;

public class MessageDecoderTest {

	public static void main(String[] args) {

		SubstitutionCipher aSub = new SubstitutionCipher(3);
		ShuffleCipher aShuffle = new ShuffleCipher (1);
		System.out.println("Please enter the message to decode: ");
		Scanner keyboard= new Scanner(System.in);
		String inputString = keyboard.next();
		
		//String testString = "abcdefghijklmnopqrstuvwxyz0123456789";
	
		System.out.println("The input you entered was: \t" + inputString);
		System.out.println("Decoded by Shifting: \t\t" + aSub.decode(inputString));
		System.out.println("Decoded by Shuffling: \t\t" + aShuffle.decode(inputString));
		
	}
}