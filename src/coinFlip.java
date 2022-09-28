import java.util.Scanner;


public class coinFlip {

	public static void main(String[] args) {
		String HeadsorTailsGuess;
		int numberOfFlips;
		int correctCount = 0;
		Scanner side = new Scanner(System.in);
		Scanner flips = new Scanner (System.in);
		System.out.print("Guess which will have more: heads or tails?");
		HeadsorTailsGuess = side.nextLine();
		System.out.print("How many times shall we flip the coin?");
		numberOfFlips = flips.nextInt();
		
		
		for (int i = 0; i < numberOfFlips; i++) {	
			
			if (Math.random() < 0.5) {
				System.out.println("Tails");
				if (HeadsorTailsGuess.equals("tails")){
					correctCount++;
				}
			}else {
				System.out.println("Heads");
				if (HeadsorTailsGuess.equals("heads")) {
					correctCount++;
				}
				
			}
			
		}
		int percentage = Math.round(100/numberOfFlips*correctCount);
		System.out.print("Your guess, "+HeadsorTailsGuess+", came up "+correctCount+" time(s)");
		System.out.print("That's "+percentage+"%.");
		side.close();
		flips.close();
	}

}
