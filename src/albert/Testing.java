package albert;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Testing {
	static Scanner s;
	static final File file = new File("/home/albert/input.txt");

	public static void main(final String args[]) {
		try {
			s = new Scanner(file);
		} catch (final FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final Random r = new Random();
		final int x = r.nextInt(899) + 100;
		for (int i = 0; i < 10; i++) {
			final int temp = getNextInput();
			if (temp != 0) {
				System.out.println(temp);
			}

		}

	}

	private static int getNextInput() {
		int ret = 0;
		ret = s.nextInt();
		s.nextLine();
		if (numlength(ret) == 4) {
			return ret;
		}
		return 0;

	}

	private static int numlength(int n) {
		int l;
		n = Math.abs(n);
		for (l = 0; n > 0; ++l) {
			n /= 10;
		}
		return l;
	}

}
