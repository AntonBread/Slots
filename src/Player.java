package casino.slots;

public class Player {
	private long balance;

	public Player(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}

	public void play() {
		System.out.printf("YOUR CURRENT BALANCE: %d\n", balance);
		System.out.println("PICK YOUR BET:");
		System.out.printf(
				"1) 10 CREDITS\t2) 25 CREDITS\n3) 50 CREDITS\t4) 100 CREDITS\n5) 250 CREDITS\t6) 500 CREDITS\n7) 1000 CREDITS\t8) 5000 CREDITS\n");
		int bet = Input.inputBet();
		while (bet > balance) {
			System.out.print("YOU DON'T HAVE ENOUGH CREDITS FOR THIS BET, INPUT AGAIN: ");
			bet = Input.inputBet();
		}
		balance -= bet;
		balance += Payout.payout(Machine.spin(), bet);
		System.out.printf("YOUR CURRENT BALANCE: %d\n", balance);
	}
}
