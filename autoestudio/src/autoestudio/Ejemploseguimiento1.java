package autoestudio;

class Ejemploseguimiento1 {
	static int s;

	public static void main(String[] args) {
		Ejemploseguimiento1 p = new Ejemploseguimiento1();
		p.start();
		System.out.println(s);
	}

	void start() {
		int x = 7;
		twice(x);
		System.out.print(x + " ");
	}

	void twice(int x) {
		x = x * 2;
		s = x;
	}
}
