import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TreeViewer
{
    private final int WIDTH = 400;
    private final int HEIGHT = 500;
    
    private JFrame frame;
    private TreeComponent panel;
    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        TreeViewer viewer = new TreeViewer();
    }

    public TreeViewer()
    {
        frame = new JFrame();
        panel = new TreeComponent(20,50,100);
        frame.setTitle("Tree Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    
}