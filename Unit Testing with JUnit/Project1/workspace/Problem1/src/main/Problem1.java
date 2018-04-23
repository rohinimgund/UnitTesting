package main;

public class Problem1 {

	public int returnInput(int x, boolean one, boolean two) {
		int y = x;

		if (one) {
			y++;
		}
		if (two) {
			y = y + 2;
		}
		return y;
	}
}
