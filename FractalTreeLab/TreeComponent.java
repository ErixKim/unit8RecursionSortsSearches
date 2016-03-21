import java.awt.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.geom.Line2D;
public class TreeComponent extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    double smallerBranch;
    double amountSmaller;
    double angleBetweenBranch;
    /**
     * Default constructor for objects of class TreeComponent
     */
    public TreeComponent(double smallerBranch, double amountSmaller, double angleBetweenBranch)
    {
        this.smallerBranch = smallerBranch;
        this.amountSmaller = amountSmaller;
        this.angleBetweenBranch = angleBetweenBranch;
    }

    public void drawFractal (Graphics2D g2, int startX, int startY, double dLength, double angle)
    {
        double angle1 = angle - angleBetweenBranch;
        double angle2 = angle + angleBetweenBranch;
        dLength = dLength * amountSmaller;
        
        int endX1;
        int endY1;
        int endX2;
        int endY2;
        endX1 = (int)(startX - dLength*Math.sin(angle1));
        endY1 = (int)(startY - dLength*Math.cos(angle1));
        g2.draw(new Line2D.Double(startX,startY,endX1,endY1));
    }
    
    public void paintComponent (Graphics2D g2)
    {
        super.paintComponent(g2);
        g2.setColor(Color.green);
        drawFractal(g2,50,50, 100, 0);
    }
    
}
