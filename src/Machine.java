package casino.slots;

import java.util.*;

public class Machine {
	private static final int REEL_COUNT = 3;
	private static ReelType[] reels = new ReelType[REEL_COUNT];
	private static ReelType[] types = ReelType.values();
	private static Random rnd = new Random();
	
	public static ReelType[] spin() {
		try {
			System.out.println("Spinning...");
			Thread.sleep(2500);
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		for (int i = 0; i < REEL_COUNT; i++) {
			reels[i] = types[rnd.nextInt(types.length)];
		}
		
		System.out.println(Arrays.toString(reels));
		return reels;
	}
	
	public ReelType[] getReels() {
		return reels;
	}
}