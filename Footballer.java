class Footballer
{

	private String name;
	private int goals;
	private int points;


	public Footballer () // constructor
	
	{
		
	}
	
	public Footballer (String theName, int theGoals, int thePoints) // constructor
	
	{
		name = theName;
		goals = theGoals;
		points = thePoints; 
	}
	
	// Mutators (Setter Methods)
	
	public void setName (String theName)
	
	{
		name = theName;
	}
	
	public void setGoals (int theGoals)
	
	{
		goals = theGoals;
	}

	public void setPoints (int thePoints)
	
	{
		points = thePoints;
	}

	
	// Selectors (Getter Methods) no parameters
	
	public String getName ()
	
	{
		return name;
	}
	
	public int getGoals()
	
	{
		return goals;
	}
	
	public int getPoints ()
	
	{
		return points;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "\n Name            : " + name;
		myString += "\n Goals Scored    : " + goals;
		myString += "\n Points Scored   : " + points;
		myString += "\n Total Points    : " + totalPoints() + "\n"; //prints the total points scored using the method totalPoints()
		
		return myString;
	
	} 
	
	//method to calculate the total points for a player
	public int totalPoints()
	
	{
		return goals * 3  + points;
	}

}
