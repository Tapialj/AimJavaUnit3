import java.util.*;

public class Assignment3_4 
{

    public static void main(String[] args) throws Exception 
    {
        int     xCoord = 0,
                yCoord = 0;
        String  userInput;
        boolean isInt = false;
        MyPoint p1,
                p2;
        Scanner input = new Scanner(System.in);

        System.out.println("This program creates a point at (0,0) and a point at the coordinates entered by you. It the computes and displays the distance from (0,0) to the point defined by you, using three different methods.\n");

        p1 = new MyPoint();

        do{
            System.out.println("the x coordinate of a point:");
            userInput = input.nextLine();
            userInput = userInput.trim();
            
            if(checkIfInt(userInput))
            {
                isInt = true;
                xCoord = Integer.parseInt(userInput);
            }
            else
            {
                System.out.println("Please enter a valid input");
            }
        }
        while(!isInt);

        isInt = false;

        do
        {
            System.out.println("the y coordinate of a point:");
            userInput = input.nextLine();
            userInput = userInput.trim();

            if(checkIfInt(userInput))
            {
                isInt = true;
                yCoord = Integer.parseInt(userInput);
            }
            else
            {
                System.out.println("Please enter a valid input");
            }
        }
        while(!isInt);

        p2 = new MyPoint(xCoord, yCoord);

        System.out.printf("%nUsing method 1, the distance from (%d,%d) to (%d,%d) is %.2f%n", p1.getxCoord(), p1.getyCoord(), xCoord, yCoord, p1.distance(xCoord, yCoord));

        System.out.printf("Using method 1, the distance from (%d,%d) to (%d,%d) is %.2f%n", p1.getxCoord(), p1.getyCoord(), p2.getxCoord(), p2.getyCoord(), p1.distance(p2));

        System.out.printf("Using method 1, the distance from (%d,%d) to (%d,%d) is %.2f%n", p1.getxCoord(), p1.getyCoord(), p2.getxCoord(), p2.getyCoord(), MyPoint.distance(p1, p2));

        System.out.println("\nGoodbye...");
        
        input.close();
        System.exit(0);
    }

    public static boolean checkIfInt(String check)
	{
		if(check == null)
			return false;
					
		try
		{
			int i = Integer.parseInt(check);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		
		return true;
	}

}
