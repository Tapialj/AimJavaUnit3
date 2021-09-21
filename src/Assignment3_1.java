import java.text.DecimalFormat;

public class Assignment3_1 
{

    public static void main(String[] args) throws Exception 
    {
        Rectangle rect1 = new Rectangle(40, 4);
        Rectangle rect2 = new Rectangle(5, 3.5);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.\n");
        System.out.println("Rectangle 1:" +
                            "\nheight = " + df.format(rect1.getHeight()) +
                            "\nwidth = " + df.format(rect1.getWidth()) +
                            "\narea = " + df.format(rect1.getArea()) +
                            "\nperimeter = " + df.format(rect1.getPerimiter()));

        System.out.println("\nRectangle 2:" +
                            "\nheight = " + df.format(rect2.getHeight()) +
                            "\nwidth = " + df.format(rect2.getWidth()) +
                            "\narea = " + df.format(rect2.getArea()) +
                            "\nperimeter = " + df.format(rect2.getPerimiter()));

        System.out.println("\nGoodbye...");

        System.exit(0);
    }

}
