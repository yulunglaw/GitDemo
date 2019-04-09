
public class GitDemo {
	
	
	/**
	 * This function will return a binary bit.
	 * If two numbers are the same, this function will return 1,
	 * otherwise, return 0.
	 * @param i
	 * @param j
	 * @return
	 */
	public int equal(int i, int j) {
		if ((i + j) % 5 == 0) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		GitDemo gd = new GitDemo();
		System.out.println(gd.equal(5, 11));
	}
}
