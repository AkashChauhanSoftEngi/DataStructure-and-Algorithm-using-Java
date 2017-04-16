class Binarian2 {

	public static void main(String[] args) {
		Binarian2 a2 = new Binarian2();
		int a=37;
		System.out.println(a2.solution(a));
	}

public int solution(int N) {
        int max = 0;
        int gap = 0;

        while ((N % 2) == 0) {
            N /= 2;
        }
        while (N > 0) {
            if ((N % 2) == 0) {
                gap++;
            } else {
                if (gap > max) {
                    max = gap;
                }
                gap = 0;
            }
            N /= 2;
        }

        return max;
    }
}