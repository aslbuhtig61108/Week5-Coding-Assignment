
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String info) {
		// This method prints out the String info parameter between 3 asterisks
		// on each side
		System.out.println("***" + info + "***\n\n");
	}

	@Override
	public void Error(String error) {
		/*
		 * This method surrounds the String parameter around an asterisk cube with the
		 * string preceded by "ERROR:".
		 */
		
		// Analyzing this program problem, I recall the string builder lab exercise
		// the challenge was getting the top and bottom of the box proportioned to the
		// middle section. I added the number of stationary spaces (13) to 
		// the error.length() amount to get the total number of asterisk top and bottom 
		// of the box. Following the drawing in the exercise I included a '\n' where appropriate
		
		StringBuilder asteriskLine = new StringBuilder();
		for (int i = 0; i < (13 + error.length()); i++) {
			asteriskLine.append('*');
		}
		System.out.println(asteriskLine.toString() + "\n");
		
		// This is the middle section of the box
		String middlePart = ("***Error: " + error + "***\n");
		System.out.println(middlePart.toString());

		// This is the bottom section of the box
		// I copied the prntln result from LINE28 to save time and less lines of code
		System.out.println(asteriskLine.toString());

		
	}

	
	
}
