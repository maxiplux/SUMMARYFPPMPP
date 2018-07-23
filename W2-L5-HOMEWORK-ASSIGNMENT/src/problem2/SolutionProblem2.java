package problem2;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class SolutionProblem2 {
	public static void main(String[] args) {
		// three instances of Professor
		Professor manuel = new Professor("Manuel", 2011, 1, 23, 21000, 1);
		Professor roberto = new Professor("Roberto", 2012, 12, 23, 12000, 2);
		Professor edson = new Professor("Edson", 2018, 11, 23, 13000, 3);

		// two instances of Secretary

		Secretary sarita = new Secretary("Sarita", 1988, 3, 1, 2200);
		sarita.setOvertimeHours(23);

		Secretary rosita = new Secretary("Rosita", 2021, 5, 1, 3200);
		rosita.setOvertimeHours(12);

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = manuel;
		department[1] = roberto;
		department[2] = edson;

		department[3] = sarita;
		department[4] = rosita;

		double profesors = Arrays.stream(department).filter(o -> o.getClass().getSimpleName().equals("Professor"))
				.mapToDouble(o -> o.computeSalary()).sum();
		double secretaries = Arrays.stream(department).filter(o -> o.getClass().getSimpleName().equals("Secretary"))
				.mapToDouble(o -> o.computeSalary()).sum();
		double all = Arrays.stream(department).mapToDouble(o -> o.computeSalary()).sum();

		String option = JOptionPane
				.showInputDialog("What do  you want to do ?  \nWrite 1 if you like know the sum of database profesor\n"
						+ "Write 2 if you like know the sum of database Secretary \n"
						+ "Write 3 if you like know the sum of database All\nTo exits other wise");

		if (option != null) {
			switch (option) {
			case "1":
				JOptionPane.showMessageDialog(null, "The result to all profesors  " + String.valueOf(profesors), "", 1);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "The result to all secreataries  " + String.valueOf(secretaries),
						"", 1);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "The result to all   " + String.valueOf(all), "", 1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Exits without options ", "", 1);
				break;
			}

		} else {
			JOptionPane.showMessageDialog(null, "Exits without options ", "", 1);
		}

	}
}
