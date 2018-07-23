package example3;

public class Probador implements iface1,iface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Probador probador = new Probador();
		probador.myMethod(8);
		

	}

	@Override
	public int myMethod(int x) {
		// TODO Auto-generated method stub
		return iface1.super.myMethod(x);
	}


}
