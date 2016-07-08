//import java.util.*;

import javax.swing.JOptionPane;

//import java.lang.*;

public class KnightDriver 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("What is the Knights Name: ");
		String health = JOptionPane.showInputDialog("What is the Knights Health: ");
		String battle = JOptionPane.showInputDialog("Number of Battles: ");
		String age = JOptionPane.showInputDialog("What is the Knights age: ");
		String gold = JOptionPane.showInputDialog("How much gold procured: ");
		String row = JOptionPane.showInputDialog("Enter the number of rows: ");
		String col = JOptionPane.showInputDialog("Enter the number of rows: ");
		
		int rowNum = Integer.parseInt(row);
		int colNum = Integer.parseInt(col);
		
		Knight knightData = new Knight(name, health, battle, age, gold);
		Stars starData = new Stars(rowNum, colNum);
		
		knightData.setKnight(name, age, health, battle, gold);
		starData.setStars(rowNum, colNum);
		
		knightData.displayKnight();
		starData.displayStars();
		
	}

}
