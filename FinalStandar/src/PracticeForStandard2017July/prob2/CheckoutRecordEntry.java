package PracticeForStandard2017July.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	

	@Override
	public String toString() {
		return "CheckoutRecordEntry [lendingitem=" + lendingitem + ", checkoutDate=" + checkoutDate + ", dueDate="
				+ dueDate + ", itemType=" + itemType + "]";
	}





	public LendingItem getLendingItem() {
		return lendingitem;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkoutDate == null) ? 0 : checkoutDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		result = prime * result + ((lendingitem == null) ? 0 : lendingitem.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckoutRecordEntry other = (CheckoutRecordEntry) obj;
		if (checkoutDate == null) {
			if (other.checkoutDate != null)
				return false;
		} else if (!checkoutDate.equals(other.checkoutDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (itemType != other.itemType)
			return false;
		if (lendingitem == null) {
			if (other.lendingitem != null)
				return false;
		} else if (!lendingitem.equals(other.lendingitem))
			return false;
		return true;
	}





	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}





	public LocalDate getDueDate() {
		return dueDate;
	}





	//cds[3], LocalDate.of(2015, 6, 1),LocalDate.of(2015, 8, 1), ItemType.CD
	private LendingItem lendingitem;
	private  LocalDate checkoutDate;
	private  LocalDate dueDate;
	private ItemType itemType;
	
	



	public ItemType getLendingItemType() {
		return itemType;
	}





	public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		super();
		this.lendingitem = item;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.itemType = itemType;
	}





	

	
}
