class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	private String neSound;
	public Chick(String type, String sound, String newSound)
	{
		myType = type;
		mySound = sound;
		neSound = newSound;

	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
		neSound = "unknown";
	}
	public String getSound()
	{
		if (Math.random() < 0.5){
			return mySound;
		}
		else 
		{
			return neSound;
		}
				
	}
	public String getType()
	{
		return myType;
	}
	
}
