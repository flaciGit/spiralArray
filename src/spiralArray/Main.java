package spiralArray;

public class Main {

	private static int[][] intArray = new int[][] {
		
		{1,2,3},
		{4,5,6},
		{7,8,9}
		
		
		/*
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16},
		*/
		
		/*
		{1,2,3,4,5},
		{6,7,8,9,10},
		{11,12,13,14,15},
		{16,17,18,19,20},
		{21,22,23,24,25},
		*/
		
	};
	
	public static void main(String[] args) {
		
		System.out.println("Traverse a 2d array in a spiral form:");
		
		int startRow = 0;
		int endRow = intArray.length-1;
		
		int startCol = 0;
		int endCol = intArray.length-1;
		
		int i = 0;
		
		while( startRow <= endRow && startCol <= endCol ) {
			
			i = startCol;
			while(i < endCol) {
				
				System.out.print(intArray[startRow][i]+" ");
				i++;
			}
			i = startRow;
			startRow++;
			
			
			while(i <= endRow) {
				
				System.out.print(intArray[i][endCol]+" ");
				i++;
			}
			i = endCol-1;
			endCol--;
			
			while(i >= startCol) {
				
				System.out.print(intArray[endRow][i]+" ");
				i--;
			}
			i = endRow-1;
			endRow--;
			
			while(i >= startRow) {
				
				System.out.print(intArray[i][startCol]+" ");
				i--;
			}
			i = startCol;
			startCol++;
			
		}
	}
}
