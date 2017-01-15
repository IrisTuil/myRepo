
public class Ark 
{
	private static int capacity;
	private static int number;
	private static Animal[] ark = new Animal[10];
	private static int fullcells;

	public static int getCapacity() {
		return capacity;
	}
	public static void setCapacity(int capacity) {
		Ark.capacity = capacity;
	}
	public static int getnumber() {
		return number;
	}
	public static void setnumber(int number) {
		Ark.number = number;
	}
	public static Animal[] getArk() {
		return ark;
	}
	public static void setArk(Animal[] ark) {
		Ark.ark = ark;
	}
	public static int getArkSize() 
	{
		return ark.length;
	}
	public static String differentAnswer(String answer)
	{
		if (answer.equals("no"))
		{
			answer = "";
			return "exit";
		}
		else
		{
			return "Maybe try again?";
		}	
	}
	public static void putInArk(Animal inark, int numberOfTimes)
	{
		for (int i = getfullcells(); i < getfullcells() + numberOfTimes; i++)
		{
			//Ark.duplicateAnimals(inark);
			Ark.getArk()[i] = Ark.duplicateAnimals(inark);
		}
		Ark.setFullcells(numberOfTimes);
	}
	private static Animal duplicateAnimals(Animal inarkkk)
	{
		Animal animalx = new Animal();
		animalx.setTypeOfAnimal(inarkkk.getTypeOfAnimal());
		animalx.setNumberOfLegs(inarkkk.getNumberOfLegs());
		animalx.setYesWings(inarkkk.isHasWings());
		return animalx;
	}
	public static void setFullcells(int bliblibla)
	{
		//int fullcells2 = 0;
		fullcells = fullcells + bliblibla;
	}
	public static int getfullcells() 
	{
		return fullcells;
	}
	public static String toString2()
	{
		String res = "";
		for (int i = 0; i < getfullcells(); i++)
		{
			//System.out.println(i);
			res = res + Ark.getArk()[i].toString() + "\n";
		}
		return res;
	}
	public static String toString3()
	{
		return "There are now " +  Ark.getfullcells() + " animals in the ark.";
	}
}
