package horstmann.corejava.guiPract;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame=new FontFrame();
            frame.setTitle("Fonts check");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}
class FontFrame extends JFrame{
    public FontFrame()
    {
        add(new FontComponent());
        pack();
    }

}
class FontComponent extends JComponent{
    private static final int default_height=600;
    private static final int default_width=400;
    public void paintComponent(Graphics g)
    {
        var g2=(Graphics2D )g;
        //declaring the string message
        String message="Hello World";
        //declaring the font style and size
        var font=new Font("Serif",Font.BOLD,36);
        // setting the font size and style to our graphics object
        g2.setFont(font);

        //measure the size of the message

        FontRenderContext context=g2.getFontRenderContext();
        Rectangle2D bounds=font.getStringBounds(message,context);

        //set (x,y)=top left corner of text

        double x=(getWidth()-bounds.getWidth())/2;
        double y=(getHeight()-bounds.getHeight())/2;

        // now to add ascent to y to reach the baseline

        double ascent=-bounds.getY();
        double baseY=y+ascent;
        // draw the message

        g2.drawString(message,(int)x,(int)baseY);

        g2.setPaint(Color.lightGray);

        //draw the baseline

        g2.draw(new Line2D.Double(x,baseY,x+bounds.getWidth(),baseY));

        //draw the enclosing rectangle

        var rect=new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
        g2.draw(rect);



    }
    public Dimension getPreferredSize()
    {
        return new Dimension(default_width,default_height);
    }
}
