package Main;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int A1 = A + (B + C) / 60;
		int B1 = 0;
		if (0 <= A && A <= 23 && 0 <= B && B <= 59 && 0 <= C && C <= 1000) {
			if ((B + C) / 60 > 0) {
				if (A1 <= 23) {
					A = A1;
					if (A1 == 24) {
						A1 = 0;
					} 
				} else if (A1 > 23) {
					A = A1 - 24;
				}
			} else if ((B + C) / 60 == 0) {
				B1 = B + C;
			}
		}
		System.out.println(A1 + " " + B1);

		sc.close();
	}
}