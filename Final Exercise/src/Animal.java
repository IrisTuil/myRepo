
public class Animal 
{
	private String typeOfAnimal;
	private int numberOfLegs;
	private boolean hasWings;
	
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	public void setTypeOfAnimal(String animalType) {
			this.typeOfAnimal = animalType;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int nuOfLegs) {
		this.numberOfLegs = nuOfLegs;
	}
	public boolean isHasWings() {
		return hasWings;
	}
	public void setYesWings(boolean hfcdygfd)
	{
		this.hasWings = hfcdygfd;
	}
	public void setHasWings(String wings) {
		if (wings.equals("yes"))
		{
			this.hasWings = true;
		}
		else if (wings.equals("no")) 
		{
			this.hasWings = false;
		}
		else
		{
			this.hasWings = false;
		}
	}
	public String toString()
	{
		String helpWings = "";
		if (isHasWings() == true)
		{
			helpWings = "wings";
		}
		else
		{
			helpWings = "no wings";
		}
		return "This animal is a/an " + this.getTypeOfAnimal() + " and it has " +
		this.getNumberOfLegs() + " legs and " + helpWings + ".";
		//+ "We will take " + answer1 + " in the ark.";
	} // add the amount of instances created by the user (X times loop was triggered)
	
}
