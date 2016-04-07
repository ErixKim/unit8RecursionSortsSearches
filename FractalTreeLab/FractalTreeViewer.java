import java.awt.*;
import javax.swing.*;

/**
 * FractalTreeViewer is the class where it allows the user to see the fractal tree drawing through a frame. 
 * 
 * @author Eric Kim
 * @version 3/18/2016
 */
public class FractalTreeViewer
{
    private final int WIDTH = 1200;
    private final int HEIGHT = 900;

    //Creates panel instance variable for the FractalTreePanel class
    private FractalTreePanel panel;
    //Creates a frame instance variable to make all the drawings visible
    private JFrame frame;

    /**
     * Default constructor for objects of class FractalTreeViewer
     */
    public FractalTreeViewer()
    {
        // Initializing the frame instance variable
        frame = new JFrame();
        //Setting the title of the frame to "Fractal Tree Lab"
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        //Creating a new FractalTreePanel with a order of 15
        panel = new FractalTreePanel(14);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        //Creating a new FractalTreeViewer to run the entire program
        FractalTreeViewer viewer = new FractalTreeViewer();
    }
}