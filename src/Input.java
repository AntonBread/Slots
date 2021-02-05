package casino.slots;

import java.util.*;

public class Input {
	
	static Scanner in = new Scanner(System.in);
	
	public static int inputBet() {
		String input = in.nextLine();
		try {
			int n = Integer.parseInt(input);
			while (n < 1 || n > 8) {
				System.out.print("INVALID INPUT, TRY AGAIN: ");
				input = in.nextLine();
				n = Integer.parseInt(input);
			}
			
			switch (n) {
				case 1:
					return 10;
				case 2:
					return 25;
				case 3:
					return 50;
				case 4:
					return 100;
				case 5:
					return 250;
				case 6:
					return 500;
				case 7:
					return 1000;
				case 8:
					return 5000;
			}
		}
		catch (NumberFormatException ex) {
			System.out.print("YOU HAVE TO INPUT A NUMBER, TRY AGAIN: ");
			inputBet();
		}
		return 0;
	}
	
	public static long inputBalance() {
		String s = in.nextLine();
		try {
			int balance = Integer.parseInt(s);
			while (balance < 10) {
				System.out.print("YOU NEED TO HAVE A MINIMUM OF 10 CREDITS TO START PLAYING!\nINPUT AGAIN: ");
				s = in.nextLine();
				balance = Integer.parseInt(s);
			}
			return balance;
		}
		catch (NumberFormatException ex) {
			System.out.print("YOU HAVE TO INPUT A NUMBER, TRY AGAIN: ");
			inputBalance();
		}
		
		return 10;
	}
	
	public static boolean inputYesNo() {
		String yn = in.nextLine();
		yn = yn.toLowerCase();
		while (!yn.equals("y") && !yn.equals("n")) {
			System.out.print("INVALID INPUT, TRY AGAIN: ");
			yn = in.nextLine();
			yn = yn.toLowerCase();
		}
		
		return (yn.equals("y"));
	}
}
