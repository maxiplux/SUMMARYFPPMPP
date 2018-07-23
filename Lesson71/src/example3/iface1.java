package example3;

public interface iface1 {

	default int myMethod(int x) {
		return 2 * x;

	}
}
