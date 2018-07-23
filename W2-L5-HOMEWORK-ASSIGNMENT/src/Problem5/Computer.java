package Problem5;

import java.util.Objects;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	@Override
	public int hashCode() {

		int hash = 547;
		hash += Double.doubleToLongBits(this.processorSpeed);
		hash += Double.doubleToLongBits(this.ramSize);

		return hash;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Computer other = (Computer) obj;

		if (processor == null) {
			if (other.processor != null)

			{
				return false;

			}

		}

		return processor.equals(other.processor) && this.processorSpeed == other.processorSpeed
				&& ramSize == other.ramSize;

	}

	@Override
	public String toString() {
		return "Current Status of Computer <<<manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize="
				+ ramSize + ", processorSpeed=" + processorSpeed + ">>";
	}

	public double computePower() {
		// return ramSize multiplied by processorSpeed
		return this.ramSize * this.processorSpeed;

	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

}
