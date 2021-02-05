package casino.slots;

public class Game {

	public static void main(String[] args) {
		Player player = start();
		long startingbalance = player.getBalance();
		
		while (!Thread.currentThread().isInterrupted()) {
			player.play();
			
			System.out.print("WOULD YOU LIKE TO PLAY AGAIN? (Y/N): ");
			if (!Input.inputYesNo()) {
				Thread.currentThread().interrupt();
				long change = startingbalance - player.getBalance();
				if (change < 0)
					System.out.printf("YOU LOST A TOTAL OF %d CREDITS\n", Math.abs(change));
				else if (change >= 0)
					System.out.printf("YOU WON A TOTAL OF %d CREDITS\n", change);
				else
					System.out.println("YOU WON OR LOST NOTHING");
			}
			else if (player.getBalance() < 10) {
				Thread.currentThread().interrupt();
				System.out.println("YOU DON'T HAVE ENOUGH MONEY TO PLAY AGAIN");
			}
			
			System.out.println();
		}
	}
	
	public static Player start() {
		System.out.println("WELCOME TO THE SLOT MACHINE!");
		System.out.print("INPUT YOUR STARTING BALANCE: ");
		long balance = Input.inputBalance();
		System.out.print("WOULD YOU LIKE TO SEE THE PAYOUT TABLE? (Y/N): ");
		if (Input.inputYesNo())
			Payout.displayPayTable();
		System.out.println();
		
		return new Player(balance);
	}

}
