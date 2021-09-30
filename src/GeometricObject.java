import java.util.*;
import java.text.*;

public abstract class GeometricObject 
{

    private String color;
    private boolean filled;
    private Date dateCreated;


    public GeometricObject()
    {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public abstract double getArea();

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    @Override
    public String toString() 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
        String date = sdf.format(dateCreated);

        return "color = " + color + "\nfilled = " + filled + "\ndateCreated = " + date;
    } 

}
