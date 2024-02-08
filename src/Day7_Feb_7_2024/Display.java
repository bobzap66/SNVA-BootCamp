package Day7_Feb_7_2024;

public class Display {
	
	int width = 40;
	
	public void printLine() {
		for(int i = 0; i < width; i++) {
			System.out.printf("=");
		}
		System.out.printf("\n");
	}
	
	public String centerText(String text) {
		int padding = ((width - text.length())/2)-1;
		StringBuilder centeredText = new StringBuilder();
		centeredText.append("|");
		for (int i= 0; i < padding; i++)
				centeredText.append(" ");
		centeredText.append(text);
		for (int i= 0; i < padding; i++)
			centeredText.append(" ");
		centeredText.append("|");
		String centeredTextString = centeredText.toString();
		return (centeredTextString);
	}
	
	public String alignLeft(String text) {
		int padding = width - text.length();
		StringBuilder alignedText = new StringBuilder();
		alignedText.append(text);
		for(int i = 0; i < padding; i++) {
			alignedText.append(" ");
		}
		String alignedTextString = alignedText.toString();
		return alignedTextString;
	
	}
	//turns two strings into one line of text as two columns using width for padding
	public String makeTwoColumns(String s1, String s2) {
		int padding = width/2;
		int padding1 = padding - s1.length()-1;
		int padding2 = padding - s2.length()-2;
		StringBuilder twoColumns = new StringBuilder();
		twoColumns.append("|");
		twoColumns.append(s1);
		for(int i = 0; i < padding1; i++) {
			twoColumns.append(" ");
		}
		twoColumns.append("|");
		twoColumns.append(s2);
		for(int i = 0; i < padding2; i++) {
			twoColumns.append(" ");
		}
		twoColumns.append("|");
		String twoColumnString = twoColumns.toString();
		return twoColumnString;
	}


}
