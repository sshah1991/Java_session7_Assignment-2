public class Assignment7_2 {
	public static void main(String[] args) {
		// Define value to a string variable var1
		String var1 = "my first line ";
		String var2 = "Hello! This is my first line of the story.";

		if (subString(var1, var2))
			System.out.println("String found");
		else
			System.out.println("String not found");

	}

	public static boolean subString(String str1, String str2) {
		//Find the lengths of the string and check if str2 is not blank
		int str1Len = str2 == null ? 0 : str1.length();
		int str2Len = str2 == null ? 0 : str2.length();

		for (int i = 0; i < str2Len; i++) {
			// find the first occurance of first character of str1 in str2
			if (str1.charAt(0) == str2.charAt(i)) {
				// if first character found in str2 then proceed
				int count = 0;
				// check if the remaining characters of str1 are matching with
				// the furthere characters of str2
				for (int j = 0; j < str1Len; j++) {
					if (str1.charAt(j) == str2.charAt(i)) {
						i++;
						// keep counting the no of matches in str2
						count++;
					}
				}
				// If count of matches is same as length of the str1 means the
				// entire str1 is present in str2
				if (count == str1Len) {
					return true;
				}
			}
		}
		return false;
	}
}