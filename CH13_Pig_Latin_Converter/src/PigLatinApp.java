
public class PigLatinApp {

	public static void main(String[] args) {
		System.out.println("Welcoime to the PigLatin coder!");
		String english = "";
		
		
		english = Console.getString("Enter a word or phrase: ");
		
		System.out.println(convertToLatin(english));
		
	}

	
	private static String convertToLatin(String english) {
		String end ="";
		String spaces ="\\s+";
		String[] words = english.split(spaces);
		for (int i=0; i <words.length;i++) {
			if (isVowel(words[i].toLowerCase().charAt(0))) {
				end+= words[i] + "ay ";
			}else {
				end += words[i].substring(1)+ words[i].substring(0,1)+ "ay ";
			}
		}
		return end;
		
	}


	private static boolean isVowel(char c) {
		if (c =='a')
		return true;
		if (c =='e')
			return true;
		if (c =='i')
			return true;
		if (c =='o')
			return true;
		if (c =='u')
			return true;
		return false;
		
	}
}
