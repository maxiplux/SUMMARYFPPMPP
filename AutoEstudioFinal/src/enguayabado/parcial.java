package enguayabado;

public class parcial {
private int algo;

private parcial() {super() ;}

public static  parcial Factory(int a) {
	parcial shi= new parcial();
	shi.algo=a;
	
	return shi;
}


@Override
public String toString() {
	return "parcial [algo=" + algo + "]";
}

public static void main(String[] args) {
	parcial a = parcial.Factory(7);
	System.out.println(a);
	
}



}
