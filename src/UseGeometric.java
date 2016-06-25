/**
 * Created by Frank Hall on 6/25/2016.
 */
public class UseGeometric
{
    public static void main(String[]args)
    {
        GeometricFigure[] figure = new GeometricFigure[2];// makes an array of GeometricFigures
        figure[0] = new Triangle(10,15, "Triangle");// assigns the values to the constrctors of the child classes
        figure[1] = new Square(12, 12, "Square"); // assigns the values to the constrctors of the child classes

        for(int x = 0; x < figure.length; x++)// for statement to print out the array items.
        {

            System.out.println("The area of a " +
                    figure[x].getFigure() + " is: " + figure[x].figureArea(figure[x].getHeight(), figure[x].getWidth()));
            // the above print out says to get figure[x].getFigure(name of the figure; Triangle, square) and also go to the figurearea method and get the height and width.
            //figure area has the perameters of figure[x].getHeight(), figure[x].getWidth() so it know what info to get from the method.
        }

    }
}

//x.figureArea(must have height and width to send to method, so must use gets);
