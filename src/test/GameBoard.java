package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GameBoard {
	public LetterBlock[][] gameBoard = new LetterBlock[15][15];
	
	public LetterBlock[][] initGameBoard() {
		
		for (int c = 0; c < 15; c++){
			for (int r = 0; r < 15; r++){
				gameBoard[c][r] = new LetterBlock();
			}
		}
		
		return gameBoard;
	}
	
	public void importGameBoard(){
		String line = null;
		BufferedReader reader = null;
		int lineNumber = 0;
		
		try {
			reader = new BufferedReader(new FileReader("currentMatrix.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				for (int i = 0; i < 15; i++){
					char curr = parts[i].charAt(0);
					
					System.out.println("row: " + lineNumber + " column: " + i + " character: " + curr);
					
					gameBoard[lineNumber][i].setLetter(curr);
				}
				lineNumber++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exportGameBoard(){
		
	}
}
