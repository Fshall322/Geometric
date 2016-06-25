/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Triangle extends GeometricFigure  //child of GeometricFigure
{
    public Triangle(int height, int width, String figure)//constructor
    {
        super(height, width, figure);  //refers to the variables in the parent class
    }
    public double figureArea(int height, int width) //the method that was abstract in the parent class. this will determine the area for triangle and square
    {
        double area;
        area = width * height / 2;
        return area;
    }
}
