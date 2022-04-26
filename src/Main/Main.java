package Main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 0;
		int M = 0;
		int r = 0;
		H = sc.nextInt();
		M = sc.nextInt();
		if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
			r = M - 45;
			if (r >= 0) {
				System.out.println(H + " " + r);
			} else if (r < 0 && H != 0) {
				M = 60 - (-r);
				H -= 1;
				System.out.println(H + " " + M);
			} else if (r < 0 && H == 0) {
				M = 60 - (-r);
				H = 23;
				System.out.println(H + " " + M);
			}
		}

		sc.close();
	}
}