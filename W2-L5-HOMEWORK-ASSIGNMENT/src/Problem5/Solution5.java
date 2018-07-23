package Problem5;

public class Solution5 {
	public static void main(String[] args) {
		Computer AsusamdX = new Computer("Asus", "x348", 1024, 3200);
		Computer LenovoamdY = new Computer("Lenovo", "x348", 1024, 3200);

		System.out.printf("The computer AsusamdX  and LenovoamdY are %s \n",
				(AsusamdX.equals(LenovoamdY) ? "Yes" : "NO"));

		Computer AsusamdZ = new Computer("Asus", "x348", 2024, 3200);

		System.out.printf("The computer AsusamdZ  and AsusamdX are %s \n ", (AsusamdX.equals(AsusamdZ) ? "Yes" : "NO"));

	}
}
