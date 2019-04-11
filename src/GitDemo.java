
public class GitDemo {

	/**
	 * This function will return a binary bit. If the sum of two numbers are
	 * divisble by 5, this function will return 1, else, return 0.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int equal(int i, int j) {
		if ((i + j) % 10 == 0) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		GitDemo gd = new GitDemo();
		System.out.println(gd.equal(100, 110));
	}
}
