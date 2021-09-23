public class MyPoint 
{
    
    private int xCoord;
    private int yCoord;


    public MyPoint()
    {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public MyPoint(int xCoord, int yCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public double distance(int xCoord, int yCoord)
    {
        return Math.sqrt(Math.pow(this.xCoord - xCoord, 2) + Math.pow(this.yCoord - yCoord, 2));
    }

    public double distance(MyPoint p)
    {
        return Math.sqrt(Math.pow(this.xCoord - p.getxCoord(), 2) + Math.pow(this.yCoord - p.getyCoord(), 2));
    }

    public static double distance(MyPoint p1, MyPoint p2)
    {
        return Math.sqrt(Math.pow(p1.getxCoord() - p2.getxCoord(), 2) + Math.pow(p1.getyCoord() - p2.getyCoord(), 2));
    }

    public int getxCoord() 
    {
        return xCoord;
    }

    public void setxCoord(int xCoord) 
    {
        this.xCoord = xCoord;
    }

    public int getyCoord() 
    {
        return yCoord;
    }

    public void setyCoord(int yCoord) 
    {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() 
    {
        return "MyPoint [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
    }

}
