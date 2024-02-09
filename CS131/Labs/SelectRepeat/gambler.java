public class gambler {
	private static boolean Win(int s, int g){
		while (s > 0 && s < g){
			if (Math.random() < 0.5) s++;
			else s--;
		}
		return s == g;
	}
	public static void main(String[] args) {
		int stake  = Integer.parseInt(args[0]);
		int goal   = Integer.parseInt(args[1]);
		int trials = Integer.parseInt(args[2]);
		int wins   = 0;   
		for (int i = 0; i < trials; i++) {
			if (Win(stake,goal)) wins++;
		} 
		System.out.println(wins + " wins of " + trials);
	}
}
