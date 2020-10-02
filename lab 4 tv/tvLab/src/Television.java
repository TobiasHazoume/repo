/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {
	//The manufacturer attribute will hold the brand name. 
	//This cannot change once the television is created, so will be a named constant.
	private final String MANUFACTURER;
	// The screenSize attribute will hold the size of the television screen.
	//This cannot change once the television has been created so will be a named constant.
	private final int SCREEN_SIZE;
	//The powerOn attribute will hold the value true if the power is on, 
	//and false if the power is off.
	private boolean powerOn;
	//The channel attribute will hold the value of the station that the television is showing.
	private int channel = 0;
	//The volume attribute will hold a number value representing the loudness (0 being no sound).
	private int volume = 0;
	
	//will be used to create an instance of a Television. 
	//so as soon as you  call this constructor this will be the initial values
	public Television(String brand,int size) 
	{
		MANUFACTURER=brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume  = 20;
		channel = 2;
	}
	
	//The setChannel method will store the desired station in the channel field.
	public void setChannel(int station) 
	{
		 channel = station;
	}
	
	//The power method will toggle the power between on and off, changing
	//the value stored in the powerOn field from true to false or from false to true.
	public void power() 
	{
		  powerOn = !powerOn;
	}
	
	//The increaseVolume method will increase the value stored in
	//the volume field by 1.
	public void increaseVolume() 
	{
		volume++;
	}
	
	//The decreaseVolume method will decrease the value stored in
	//the volume field by 1.
	public void decreaseVolume() 
	{
		volume--;
	}
	
	//The getChannel method will return the value stored in the channel
	//field.
	public int getChannel() 
	{
		return channel;
	}
	
	// The getVolume method will return the value stored in the volume
	//field.
	public int getVolume() 
	{
		return volume;
	}
	
	//The getManufacturer method will return the constant value
	//stored in the MANUFACTURER field.
	public String getManufacturer() 
	{
		return MANUFACTURER;
	}
	//The getScreenSize method will return the constant value 
	//stored in the SCREEN_SIZE field.
	public int getScreenSize() 
	{
		return SCREEN_SIZE;
	}
	
}
