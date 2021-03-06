class Binarian2 {

	public static void main(String[] args) {
		Binarian2 a2 = new Binarian2();
		int a[] = new int[] { 1, 0, 2, 0, 0, 2, 0, 3 };
		System.out.println(a2.solution(a));
	}

	short bin[] = new short[1000000];

	public int solution(int a[]) {

		short carry = 0;
		int j;
		int len = 0;
		int solution = 0;
		for (int i = 0; i < a.length; i++) {

			carry = (short) (bin[a[i]] & 1);
			bin[a[i]] = (short) (bin[a[i]] ^ 1);
			j = a[i] + 1;

			while (carry != 0) {
				carry = (short) (bin[j] & 1);
				bin[j] = (short) (bin[j] ^ 1);

				j++;
			}
			if (j > len) {
				len = j;
			}
		}

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(bin[i]);
			if (bin[i] == 1) {
				solution++;
			}
		}
		System.out.println("");
		return solution;

	}

}
