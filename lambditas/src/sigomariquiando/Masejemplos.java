package sigomariquiando;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Masejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger init = new BigInteger("256");

		System.out.println(

				Stream.iterate(init, x -> x.add(new BigInteger("1"))).limit(1024).filter(
						x -> x.compareTo(new BigInteger("1024")) <= -1 && x.compareTo(new BigInteger("256")) >= 0)
						.filter(x -> x.testBit(0)).reduce((x, y) -> 
							x.multiply(y)

					).orElse(BigInteger.ZERO)

		);

	}

}
