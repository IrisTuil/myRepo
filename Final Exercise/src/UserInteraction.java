import java.util.Scanner;
public class UserInteraction 
{
	private static boolean isString(String userAns1) 
	{
		return userAns1.matches("[a-zA-Z]+");
	}
	private static boolean IsInt(String userAns2)
	{
	    return userAns2.matches("^-?\\d+$");
	}
	public static void speakToUser ()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String answer = " ";
		String answer1 = " ";
		
		
		while (Ark.getfullcells() < Ark.getArkSize() && !answer.equals ("exit"))
		{
				System.out.println("Welcome to the ARK, where fun never sleeps;)" + "\n" +  
						"Do you want to generatre a new Animal? (yes/no)");
				answer = input.next();
		
				if(answer.equals("yes"))
				{
					Animal animal1 = new Animal();
					System.out.println("what is the type of the animal?");
					answer = input.next();
					if(UserInteraction.isString(answer) == false)
					{
						while(UserInteraction.isString(answer) == false)
						{
							System.out.println("Please insert only letters");
							answer = input.next();
						}
					}
					else
					{
						animal1.setTypeOfAnimal(answer);	
					}
					System.out.println("How many legs does the animal have?");
					answer = input.next();
					if(UserInteraction.IsInt(answer) == false)
					{
						while(UserInteraction.IsInt(answer) == false) 
						{
							System.out.println("Please insert only numbers");
							answer = input.next();
							animal1.setNumberOfLegs(Integer.parseInt(answer));	
						}
					}
					else
					{
						animal1.setNumberOfLegs(Integer.parseInt(answer));	
					}
					System.out.println("Does it have wings?");
					answer = input.next();
					if(UserInteraction.isString(answer) == false)
					{
						while(UserInteraction.isString(answer) == false)
						{
							System.out.println("Please insert only letters");
							answer = input.next();
						}
					}
					else
					{
						animal1.setHasWings(answer);	
					}
					System.out.println("How many of this animal are we taking?");
					answer1 = input.next();
						if(UserInteraction.IsInt(answer1) == false)
						{
							while(UserInteraction.IsInt(answer1) == false)
							{
								System.out.println("Please insert only numbers");
								answer1 = input.next();
							}
						}
						else if(Ark.getfullcells() + Integer.parseInt(answer1) <= Ark.getArkSize())
						{
							Ark.putInArk(animal1, Integer.parseInt(answer1));	
							System.out.println(Ark.toString2());
							System.out.println(Ark.toString3());
						}
						else
						{
							System.out.println("You may only add " + (Ark.getArkSize() - Ark.getfullcells()) + 
									" more animals to the ark");
							//answer1 = input.next();
							//Ark.putInArk(animal1, Integer.parseInt(answer1));	
							//System.out.println(Ark.toString2());
							//System.out.println(Ark.toString3());
						}
						
				}
				else if(answer.equals("no"))
				{
					System.out.println("bye bye now!");
					answer = (Ark.differentAnswer(answer));
				}
				else
				{
					System.out.println(Ark.differentAnswer(answer));
				}	
		}
	}	
}
