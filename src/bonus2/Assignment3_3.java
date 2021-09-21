package bonus2;

import java.util.*;

public class Assignment3_3 
{

    public static void main(String[] args) throws Exception 
    {
        int     cycles = 3;
        boolean correct = false,
                filled = false;
        String  inputText,
                color;
        double[] sides = new double[3];
        ArrayList<GeometricObject> triangles = new ArrayList<GeometricObject>();
        Scanner input = new Scanner(System.in);

        System.out.println("This program gets input for three triangles from the user. It then creates three Triangle objects and displays the description of each.\n");

        for(int i = 0; i < cycles; i++)
        {
            System.out.println("Enter the color of a triangle (e.g. \"red\"):");
            color = input.nextLine();

            do
            {
                System.out.println("Is the triangle filled (y or n):"); 
                inputText = input.nextLine();

                if(inputText.equalsIgnoreCase("y") || inputText.equalsIgnoreCase("n"))
                {
                    correct = true;
                    filled = (inputText.equalsIgnoreCase("y")) ? true : false;
                }
                else
                {
                    System.out.println("Please enter a valid input");
                }
            }
            while(!correct);
            
            correct = false;

            do
            {
                System.out.println("Enter the lengths of the three sides of the triangle separated by spaces:");
                inputText = input.nextLine();

                if(triangleSides(inputText) && checkIfDouble(inputText))
                {
                    correct = true;
                    String[] split = inputText.split(" ");

                    for(int k = 0; k < 3; k++)
                    {
                        sides[k] = Double.parseDouble(split[k]);
                    }
                }
                else
                {
                    System.out.println("Please enter a valid input");
                }
            }
            while(!correct);

            triangles.add(new Triangle(color, filled, sides[0], sides[1], sides[2]));
        }

        for(int i = 0; i < triangles.size(); i++)
        {
            System.out.println("\n" + triangles.get(i).toString());
        }

        System.out.println("\nGoodbye...");

        input.close();
        System.exit(0);

    }

    public static boolean triangleSides(String input)
    {
        String[] split = input.split(" ");

        if(split.length == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkIfDouble(String check)
	{
		if(check == null)
			return false;
					
		try
		{
            String[] split = check.split(" ");
            
            for(int i = 0; i < 3; i++)
            {
			    double k = Double.parseDouble(split[i]);
            }
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		
		return true;
	}

}
