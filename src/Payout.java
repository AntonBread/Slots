package casino.slots;

public class Payout {

	public static int payout(ReelType[] reels, int sum) {
		int pay = 0;
		if (reels[0] == reels[1] && reels[0] == reels[2]) {
			ReelType reel = reels[0];
			switch (reel) {
				case SEVEN:
					pay = sum * 100;
					System.out.printf("JACKPOT!!!\n YOU WON %d CREDITS", pay);
					return pay;
				case BAR3:
					pay = sum * 50;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case BAR2:
					pay = sum * 25;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case BAR:
					pay = sum * 15;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case MELON:
					pay = sum * 15;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case PLUM:
					pay = sum * 10;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case LEMON:
					pay = sum * 5;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
				case CHERRY:
					pay = sum * 3;
					System.out.printf("YOU WON %d CREDITS!\n", pay);
					return pay;
			}
		}
		else if (reels[0] == reels[1] || reels[0] == reels[2] || reels[1] == reels[2]) {
			pay = sum * 2;
			System.out.printf("YOU WON %d CREDITS!\n", pay);;
			return pay;
		}
		
		System.out.println("YOU LOST");
		return pay;
	}

	public static void displayPayTable() {
		System.out.println("\tPAYOUT TABLE:");
		System.out.printf("777 — 100x");
		System.out.printf("\tBAR3x3 — 50x\n");
		System.out.printf("BAR2x3 — 25x");
		System.out.printf("\tBARx3 — 15x\n");
		System.out.printf("MELONx3 — 15x");
		System.out.printf("\tPLUMx3 — 10x\n");
		System.out.printf("LEMONx3 — 5x");
		System.out.printf("\tCHERRYx3 — 3x\n");
		System.out.printf("TWO OF A KIND — 2x\n");
	}
}
