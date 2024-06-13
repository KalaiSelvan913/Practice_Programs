package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternProgram {
	
	public static void main(String[] args) {
		String str = "a2b4";
		
		System.out.println("Print Pattern "+str);
		System.out.println("Output : "+printSequencePattern(str));
		
	}
	
	private static String printSequencePattern(String str) {
		StringBuilder result = new StringBuilder();
		Pattern regex = Pattern.compile("([a-zA-Z])(\\d+)");
		Matcher matcher = regex.matcher(str);
		while(matcher.find()) {
			char letter = matcher.group(1).charAt(0);
			int count = Integer.parseInt(matcher.group(2));
			for(int i=0; i<count; i++) {
				result.append(letter);
			}
		}
		return result.toString();
	}

}
