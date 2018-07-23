package autoestudio;

import java.util.Comparator;

public class sortShopping implements Comparator<Shopping>
{
    /**
	 * 
	 */
	private final Shopping sortShopping;

	/**
	 * @param shopping
	 */
	sortShopping(Shopping shopping) {
		sortShopping = shopping;
	}

	// Used for sorting in ascending order of
    // roll number
    public int compare(Shopping a, Shopping b)
    {
        return (int) (a.getPrice() - b.getPrice());
    }
}