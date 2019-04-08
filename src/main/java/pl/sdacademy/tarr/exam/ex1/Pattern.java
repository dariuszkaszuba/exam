package pl.sdacademy.tarr.exam.ex1;

public class Pattern {

	public String prepareSquareWithDiagonals(char sign, int size) {
		String pattern = "";

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (j == size - 1) {
					pattern += sign;
				} else if (i == 0 || i == (size - 1)) {
					pattern += sign + " ";

				} else if (j == 0 || j == (size - 1) || i == j || i == (size - 1) - j) {
					pattern += sign + " ";

				} else {
					pattern += " " + " ";
				}
			}
			pattern += "\n";
		}

//		System.out.print(pattern); // for debug only
		return pattern;
	}
}