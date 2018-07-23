package Problem6;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Computer other = (Computer) obj;

		if (processor == null) {
			if (other.processor != null)

			{
				return false;

			}

		} else if (!processor.equals(other.processor)) {
			return false;
		}
		if (Double.doubleToLongBits(processorSpeed) != Double.doubleToLongBits(other.processorSpeed)) {
			return false;
		}
		if (ramSize != other.ramSize) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Current Status of Computer [manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize="
				+ ramSize + ", processorSpeed=" + processorSpeed + "]";
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
