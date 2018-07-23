package Problem3;

public class Solution3 {

	public static void main(String[] args) {
		Figure[] database = { new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical(),

		};

		for (Figure figure : database) {
			figure.getFigure();
		}
	}

}
