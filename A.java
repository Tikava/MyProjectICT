import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			if (n % 2 != 0) {
				for (int i = 0; i < n; i++) {
					System.out.print(1 + " ");
				}
			} else {
				System.out.print(1 + " ");
				int m = n + 1;
				for (int i = 0; i < n - 1; i++) {
					System.out.print(m + " ");
				}
			}
		}
	}
}