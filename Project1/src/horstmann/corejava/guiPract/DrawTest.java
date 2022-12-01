package horstmann.corejava.guiPract;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
class DrawFrame extends JFrame{
    public DrawFrame()
    {
        add(new DrawComponent());
        pack();
    }
}
class DrawComponent extends JComponent{
    private static final int default_Width=400;
    private static final int default_Height=400;
    public void paintComponent(Graphics g)
    {
        var g2=(Graphics2D) g;
        // now to draw a rectangle
        double leftX=100;
        double topY=100;
        double width=200;
        double height=150;

        var rect=new Rectangle2D.Double(leftX,topY,width,height);
        g2.draw(rect);
        // draw a enclosed ellipse

        var ellipse=new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        //draw a diagonal line 

        g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(default_Width,default_Height);
    }
}
public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            var frame=new DrawFrame();
            frame.setTitle("shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}
