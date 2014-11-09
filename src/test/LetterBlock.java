package test;

public class LetterBlock {
	private char letter;
	public Modifiers modifier;
	
	public LetterBlock(){
		letter = ' ';
		modifier = null;
	}
	
	public void setLetter (char letter){
		this.letter = letter;
	}
}
