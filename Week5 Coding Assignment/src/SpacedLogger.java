
public class SpacedLogger implements Logger {

	@Override
	public void Log(String info) {
		// This method when called adds spaces between the characters 
		// of the string parameter
		StringBuilder withSpaces = new StringBuilder();
		
		// I recall a lab exercise asking to add a '-' between a list of integers
		// I thought this was effective by replacing the '-' with a " "
		for (int a = 0; a < info.length(); a++) {
			withSpaces.append(info.charAt(a));
			if (a != info.length()-1) {
				withSpaces.append(" ");
			}
		}
		// Adding "\n\n" helps delineate between the two outputs for readibility
		System.out.println(withSpaces.toString()+ "\n\n");
	}

	@Override
	public void Error(String error) {
		// This method would precede the spaced out input with "ERROR" 
		// Example: "ERROR: H e l l o
		StringBuilder withSpaces = new StringBuilder();
		
		for (int a = 0; a < error.length(); a++) {
			withSpaces.append(error.charAt(a));
			if (a != error.length()-1) {
				withSpaces.append(" ");
			}
		}
		System.out.println("ERROR: " + withSpaces.toString());
		
		
	}

}
