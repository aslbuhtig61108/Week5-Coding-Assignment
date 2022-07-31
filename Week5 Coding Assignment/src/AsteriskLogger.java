
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String info) {
		// This method prints out the String info parameter between 3 asterisks
		// on each side
		System.out.println("***" + info + "***");
	}

	@Override
	public void Error(String error) {
		// This method surrounds the String parameter around an asterisk cube
		// with the string preceded by "ERROR:".
		StringBuilder asteriskLine1 = new StringBuilder();
		for (int i = 0; i < (13 + error.length()); i++) {
			asteriskLine1.append('*');
		}
		System.out.println(asteriskLine1.toString());
		
		//
		String middlePart = ("***Error: " + error + "***");
		System.out.println(middlePart.toString());

		// 
		StringBuilder asteriskLine2 = new StringBuilder();
		for (int i = 0; i < (13 + error.length()); i++) {
			asteriskLine2.append('*');
		}
		System.out.println(asteriskLine2.toString());

		
	}

	
	
}
