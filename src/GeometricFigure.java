/**
 * Created by Frank Hall on 6/25/2016.
 */
public abstract class GeometricFigure // abstract class
{
    protected int height;// protected var, makes variable usuable by the children classes
    protected int width;// protected var, makes variable usuable by the children classes
    protected String figure;// protected var, makes variable usuable by the children classes
    public GeometricFigure(int height, int width, String figure)// constructor
    {
        this.height = height;//this signifies that the program will use the variables with in the constructor
        this.width = width;
        this.figure = figure;
    }
    public int getHeight()// get mehod
    {
        return height;
    }
    public int getWidth()// get mehod
    {
        return width;
    }
    public String getFigure()// get mehod
    {
        return figure;
    }
    public abstract double figureArea(int h, int w);// abstract method that must be made in the child classes
}
