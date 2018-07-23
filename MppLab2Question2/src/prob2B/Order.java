package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List<OrderLine> lineOrders;

	public Order(List<OrderLine> lineOrders) {

		this.lineOrders = lineOrders;
	}

	public void addOrder(OrderLine order) {

		if (this.lineOrders == null) {
			this.lineOrders = new ArrayList<OrderLine>();
		}
		this.lineOrders.add(order);
	}

	public Order() {

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(String.format("Begin Details of Order %s \n", this.hashCode()));
		int index = 0;
		for (OrderLine orderLine : lineOrders) {
			index++;
			builder.append(String.format("Line %s OrderLine(%s)\n", index, orderLine));
		}
		builder.append(String.format("End Detail Order %s \n", this.hashCode()));
		return builder.toString();
	}

}
