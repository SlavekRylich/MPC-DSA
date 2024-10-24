package helloworld;

import java.io.FileReader;
import java.io.IOException;

public class Text {
	public String text = "Sem vloz text.";
	private int pocetSlov = 0;
	private int pocetVet = 0;
	private int pocetPismen = 0;
	private int pocetMezer = 0;
	
	
	public String ReadFileFromWD() throws IOException {
		String text = null;
		

		
		// Passing the path to the file as a parameter
        FileReader fr = new FileReader("text.txt");
 
        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1) {
        	
            // Print all the content of a file
            System.out.print((char)i);
        	
        	// type to char 
        	char c = (char)i;
        	
        	// copy text
        	text = text + (char)i;
        	
        	// count of spaces
        	if (c == ' ')
        		pocetMezer++;
        	
        	// count of sentences
        	if (c == '.')
        		pocetVet++;
        	
        	// count of letters
        	if ((c >= 'a' && c <= 'z') || ( c >= 'A' && c <= 'Z'))
        		pocetPismen++;
        
        pocetSlov = pocetMezer + 1;
        }
        
		return text;
		
	}
	
	
	@Override
	public String toString() {
		System.out.println("Pocet slov: " + pocetSlov);
		System.out.println("Pocet pismen: " + pocetPismen);
		System.out.println("Pocet vet: " + pocetVet);
		System.out.println("Pocet mezer: " + pocetMezer);
		return super.toString();
	}
	
}