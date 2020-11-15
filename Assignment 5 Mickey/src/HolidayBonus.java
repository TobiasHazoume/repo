/**
 * @author Tobias Hazoume
 *
 */
public class HolidayBonus {
	
	/**
	 * constructor
	 */
	public HolidayBonus() 
	{
		

	}
	

	/**
	 * Calculates the holiday bonus for each store
	 * 
	 * @param data
	 * @param data - the two dimensional array of store sales
	 * @param high - bonus for the highest store in a category
     * @param low - bonus for the lowest store in a category
     * @param other - bonus for all other stores in a category
	 * @return an array of the bonus for each store
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low,
			double other) 
	{
		double[][] bonusArray = new double[data.length][];
		// The retail store with the highest amount sold in a category will receive $5,000.
		
				//use highest in row

		high = TwoDimRaggedArrayUtility.getHighestInColumn(data, 1);
		
			
				
	    //The retail store with the lowest amount sold in a category will receive $1,000.
				
		//use lowest in row
		low = TwoDimRaggedArrayUtility.getLowestInColumn(data, 1);
		return null;
						
		//All other retail stores in district #5 will receive $2,000
		//the number isn't highest, lowest or >= 0 then give 2k
				
		//If a retail store didn’t sale anything in a category, or they have a negative sales amount 0
		// if >=0 give 0
				
		//If only one retail store sold items in a category, 
		  //they are eligible to receive only the bonus of $5000 for that category.
		
		
	}
	
	/**
	 * Calculates the total holiday bonuses
	 * 
	 * @param data - the two dimensional array of store sales	 
     * @param high - bonus for the highest store in a category
     * @param low - bonus for the lowest store in a category
     * @param other - bonus for all other stores in a category
	 * @return the total of all holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high,
            double low,
            double other) 
	{
		return high = TwoDimRaggedArrayUtility.getHighestInColumn(data, 1);
	}

	
}
