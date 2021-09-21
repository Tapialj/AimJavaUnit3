public class Rectangle 
{

    private double width;
    private double height;


    public Rectangle()
    {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return this.height * this.width;
    }

    public double getPerimiter()
    {
        return (this.height * 2) + (this.width * 2);
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    @Override
    public String toString() 
    {
        return "Rectangle [height=" + height + ", width=" + width + "]";
    }

}
