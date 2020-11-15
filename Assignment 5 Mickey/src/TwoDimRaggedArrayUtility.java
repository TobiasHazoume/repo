import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Tobias Hazoume
 *utility class that manipulates a two-dimensional ragged array of doubles. 
 *This utility class will be used to create a Sales Report for Retail District #5. 
 *It will accommodate positive and negative numbers. 
 */

public class TwoDimRaggedArrayUtility {

	
	/** Constructor
	 *  
	 */
	public TwoDimRaggedArrayUtility()
	{
		
	}
	

	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * 
	 * @param data - the two dimensional array getting the average of
	 * @return the average of the elements in the two dimensional array 
	 * 		   (total of elements/num of elements)
	 */
	public static double getAverage(double[][] data) 
	{
		//ima just use the get total code and divide it by the number of of elements (col * row)
		
		double sum = 0;
		int numberOfElements = 0;
	    for (double[] innerArray : data) 
	    { 
	    	for (double i : innerArray) 
	    	{
	            sum += i;
	            numberOfElements++;
	    	}
	    	numberOfElements++;
	    }
	    return sum / numberOfElements;
		
	}
	

	/**
	 * Returns the total of the selected column in the two dimensional 
	 * array index 0 refers to the first column.
	 * 
	 * @param data - the two dimensional array
	 * @param col - the column index to take the total of (0 refers to the first column)
	 * @return the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col) 
	{
		double sumCol;
            sumCol = 0;  
            for(int j = 0; j < data.length; j++){  
              sumCol = sumCol + data[j][col];  
            }  
            System.out.println("Sum of colum " + col +" is: " + sumCol);  
            return sumCol;
        
	}
	
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data - the two dimensional array
	 * @return the largest element in the two dimensional array
	 */
	public static double getHighestInArray(double[][] data)
	{
		double highestInArray = data[0][0];
	        for (int j = 0; j < data.length; j++) {
	            for (int i = 0; i < data[j].length; i++) {
	                if (data[j][i] > highestInArray) {
	                	highestInArray = data[j][i];
	                }
	            }
	        }
	        return highestInArray;
	}
	
	/**
	 * Returns the largest element of the selected column in
	 * the two dimensional array index 0 refers to the first column.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the largest element of (0 refers to the first column)
	 * @return the largest element of the column
	 */
	public static double getHighestInColumn(double[][] data, int col) 
	{
		double highest = data[0][0];
        for(int j = 0; j < data.length; j++){  
        	 if (data[j][col] > highest) {
             	highest = data[j][col];
             }  
        }
        return highest;
	}
	

	/**
	 * Returns index of the largest element of the selected column in the two dimensional
	 * array index 0 refers to the first column.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the largest element of (0 refers to the first column)
	 * @return the largest element of the column
	 */
	public static int	getHighestInColumnIndex(double[][] data, int col) 
	{
		double highest = data[0][0];
        for(int j = 0; j < data.length; j++){  
        	 if (data[j][col] > highest) {
             	highest = data[j][col];
             }  
        }
        return (int) highest;
	}
	

	/**
	 * Returns the largest element of the selected row in 
	 * the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the largest element of (0 refers to the first row)
	 * @return 
	 */
	public static double	getHighestInRow(double[][] data, int row) 
	{ 
		
		//data[0]; is equal to the set of numbers in row 0 ex: [1,2,3]
		//data[0].length; it will retrieve the numbers of elements in the row n.0:
		
		 double highest = data[0][0];
	        for (int j = 0; j < data.length; j++) { // loop for as many collums they are
	                if (data[row][j] > highest) {
	                	highest = data[row][j];
	                }
	        }
	        return highest;
	}
	

	/**
	 * Returns the largest element of the selected row in the 
	 * two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the largest element of (0 refers to the first row)
	 * @return the largest element of the row
	 */
	public static int	getHighestInRowIndex(double[][] data, int row) {
		double highest = data[0][0];
        for (int j = 0; j < data.length; j++) { // loop for as many collums they are
                if (data[row][j] > highest) {
                	highest = data[row][j];
                }
        }
        return (int) highest;
		
		
	} 
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data - the two dimensional array
	 * @return he smallest element in the two dimensional array
	 */
	public static double getLowestInArray(double[][] data) 
	{
		double lowestInArray = data[0][0];
	        for (int j = 0; j < data.length; j++) {
	            for (int i = 0; i < data[j].length; i++) {
	                if (data[j][i] < lowestInArray ) {
	                	lowestInArray = data[j][i];
	                }
	            }
	        }
	        return lowestInArray;
	}
	

	/**
	 * Returns the index of the smallest element of the selected column in the 
	 * two dimensional array index 0 refers to the first column.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the smallest element of (0 refers to the first column)
	 * @return the index of the smallest element of the column
	 */
	public static int	getLowestInColumnIndex(double[][] data, int col) 
	{
		double lowest = data[0][0];
        for(int j = 0; j < data.length; j++){  
        	 if (data[j][col] < lowest) {
        		 lowest = data[j][col];
             }  
        }
        return (int) lowest;
	}
	
	/**
	 * Returns the index of the smallest element of the selected column in the 
	 * two dimensional array index 0 refers to the first column.
	 * @param data - the two dimensional array
	 * @param col - the column index to find the smallest element of (0 refers to the first column)
	 * @return the index of the smallest element of the column
	 */
	public static double getLowestInColumn(double[][] data, int col) 
	{
		double lowest = data[0][0];
        for(int j = 0; j < data.length; j++){  
        	 if (data[j][col] < lowest) {
        		 lowest = data[j][col];
             }  
        }
        return lowest;
	}
	

	/**
	 * Returns the smallest element of the selected row in 
	 * the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the smallest element of (0 refers to the first row)
	 * @return the smallest element of the row
	 */
	public static double getLowestInRow(double[][] data, int row) 
	{
		//data[0]; is equal to the set of numbers in row 0 ex: [1,2,3]
		//data[0].length; it will retrieve the numbers of elements in the row n.0:

		double lowest = data[0][0];
			for (int j = 0; j < data.length; j++) { // loop for as many collums they are
			     if (data[row][j] < lowest) {
			    	 lowest = data[row][j];
			         }
			 }
			 return lowest;
	}
	
	/**
	 * Returns the smallest element of the selected row in 
	 * the two dimensional array index 0 refers to the first row.
	 * @param data - the two dimensional array
	 * @param row - the row index to find the smallest element of (0 refers to the first row)
	 * @return the smallest element of the row
	 */
	public static int	getLowestInRowIndex(double[][] data, int row) 
	{
		double lowest = data[0][0];
        for (int j = 0; j < data.length; j++) { // loop for as many collums they are
                if (data[row][j] > lowest) {
                	lowest = data[row][j];
                }
        }
        return (int) lowest;
	}
	

	/**
	 * Returns the total of the selected row in 
	 * the two dimensional array index 0 refers to the first row
	 * @param data - the two dimensional array
	 * @param row - the row index to take the total of (0 refers to the first row)
	 * @return the total of the row
	 */
	public static double getRowTotal(double[][] data, int row) 
	{

		double sum = 0;
        for (int j = 0; j < data.length; j++) { // loop for as many collums they are
                	sum = sum + data[row][j];    
        }
        return  sum;

	}
	

	/**
	 * Returns the total of all the elements of the two dimensional array
	 * @param data - the two dimensional array getting total of
	 * @return the sum of all the elements in the two dimensional array
	 */
	public static double getTotal(double[][] data) 
	{
		 
		double sum = data[0][0];
		for (int j = 0; j < data.length; j++) {
			for (int i = 0; i < data[j].length; i++) {
				sum = sum + data[i][j];
			}
		}
		return sum;
		
	}
	

	
	/**
	 * Reads from a file and returns a ragged array of doubles 
	 * The maximum rows is 10 and the maximum columns for each 
	 * row is 10 Each row in the file is separated by a new 
	 * line Each element in the row is separated by a space Suggestion: 
	 * 
	 * You need to know how many rows and how many columns there are for 
	 * each row to create a ragged array. 
	 * 
	 * 1. Read the doubles from the file into an a temporary array [10][10] of Strings 
	 * which was initialized to nulls.  
	 * 
	 * 2. Find out how many rows there are 
	 * (any row that has the first element != null is a valid row) 
	 * 3. Create the array based on the num of rows, 
	 * i.e. double[][]array = new double[#rows][] 
	 *  
	 * 4. Determine the number of columns for the first row 
	 * (any element != null is a valid element)  
	 * 
	 * 5. create the first row, i.e. array[0] = new double[#columns] 
	 * 
	 * 6. Put the values from the temporary array into in the row 
	 * (don't forget to convert from strings to doubles) 
	 * 
	 * 7. Repeat for all rows
	 * 
	 * @param file - the file to read from
	 * @return a two dimensional ragged (depending on data) 
	 * array of doubles if the file is not empty, 
	 * returns a null if file is empty
	 * @throws java.io.FileNotFoundException
	 */
	public static double [][] readFile(File file)  throws java.io.FileNotFoundException
	{
		//directory
		file = new File("C:/Users/Vignon/eclipse-workspace/Assignment 5 Mickey/src/district5.txt");
		//get file
		Scanner sc = new Scanner(file);

		// Read the doubles from the file into an a temporary array [10][10] of Strings 
		// which was initialized to nulls.
		String [][] tempArray = new String [10][10]; //all elements are null rn
		
		 while(sc.hasNextLine()) {
	         for (int i=0; i<tempArray.length; i++) {
	            String[] line = sc.nextLine().trim().split(" ");
	            
	            for (int j=0; j<line.length; j++) {
	            	tempArray[i][j] = line[j];
	            }
	         }
		 }
		
		 // 2. Find out how many rows there are 
		 // (any row that has the first element != null is a valid row) 
		 
		//data[0].length; it will retrieve the numbers of elements in the row n.0:
		 
		 //i want to loop through this tempArray[i][0]
		 int validRow =0;
		 while(tempArray[validRow][0] !=null)
		 {
			 validRow++; //number of valid rows
		 }
		 
		 // 3. Create the array based on the num of rows, 
		 // i.e. double[][]array = new double[#rows][] 
		 double[][]array = new double[validRow][];
		 
		 // 4. Determine the number of columns for the first row 
		 // (any element != null is a valid element)
		 int validCol =0;
		 while(tempArray[0][validCol] !=null)
		 {
			 validCol++; //number of valid rows
		 }
		 
		 // 5. create the first row, i.e. array[0] = new double[#columns]
			 array[0] = new double[validCol];
	
		 
		 // 6. Put the values from the temporary array into in the row 
		 // (don't forget to convert from strings to doubles) 
	     // 7. Repeat for all rows
			 for (int i=0; i<tempArray.length; i++) {    //colums    
		            for (int j=0; j<tempArray[i].length; j++) {
		            	array[i][j] =  Double.valueOf(tempArray[i][j]).doubleValue();
		            }
		         }
			return array;
		

		
		
	}
	
	
	/**
	 * Writes the ragged array of doubles into the file. 
	 * Each row is on a separate line within the file 
	 * and each double is separated by a space.
	 * @param data - two dimensional ragged array of doubles
	 * @param outputFile -  the file to write to
	 * @throws java.io.FileNotFoundException - if outputFile is not valid
	 */
	public static void	writeToFile(double[][] data,File outputFile) 
	{
		
		
		data = new double[6][];
		 
		String fileContent = "";
		  data = new double[6][];
		  for (int i=0; i<data.length; i++) {    //colums    
	            for (int j=0; j<data[i].length; j++) {
	            	fileContent += data[i][j] + " ";
	            }
	            fileContent += "\n";
	         }
		  PrintWriter print = null;
		try {
			print = new PrintWriter(outputFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print.print(fileContent);
		print.close();
		
		//BufferedWriter writer = new BufferedWriter("C:/Users/Vignon/eclipse-workspace/Assignment 5 Mickey/src/newfile.txt");

		
	}
}
