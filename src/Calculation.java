
public class Calculation {
	public int calculate(String input) {
		int result = 0;
		String[] inputArray = input.split(" ");
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equals("+")) {
				result = add(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i - 1] = null;
				inputArray[i] = null;
				inputArray[i + 1] = Integer.toString(result);

			} else if (inputArray[i].equals("*")) {
				result = mul(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i - 1] = null;
				inputArray[i] = null;
				inputArray[i + 1] = Integer.toString(result);

			} else if (inputArray[i].equals("/")) {
				result = div(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i - 1] = null;
				inputArray[i] = null;
				inputArray[i + 1] = Integer.toString(result);
			}
		}
		return result;
	}



	private int add(String s1, String s2) {
		int s = Integer.parseInt(s1) + Integer.parseInt(s2);
		return s;
	}

	private int mul(String s1, String s2) {
		int s = Integer.parseInt(s1) * Integer.parseInt(s2);
		return s;
	}

	private int div(String s1, String s2) {
		int s = Integer.parseInt(s1) / Integer.parseInt(s2);
		return s;
	}
}
