package april2017.startupCode.prob2;

import java.util.Optional;

public class Admin {
	// implement
	private Department[] depts;

	public Admin(Department[] depts) {
		if (depts.length != 3) {
			throw new IllegalArgumentException("The size of deparments  is at less 3 , check your values");
		}
		this.depts = depts;

	}

	public String format(String name, String msg) {
		return String.format("%s: %s\n", name, msg);

	}

	public String hourlyCompanyMessage() {
		StringBuilder builder = new StringBuilder();
		for (Department deparmamentvalue : this.depts) {

			String messagevalue = deparmamentvalue.nextMessage();
			builder.append(this.format(deparmamentvalue.getName(), messagevalue));
			
			/*
			while (messagevalue != null) 
			{
				
				if (messagevalue != null)
				{
					builder.append(this.format(deparmamentvalue.getName(), messagevalue));
				}
				messagevalue = deparmamentvalue.nextMessage();
				
			}
			*/

		}
		return builder.toString();

	}

}
