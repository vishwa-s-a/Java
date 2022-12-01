package horstmann.corejava.guiPract;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JComponent;
/*
 * a component to display the message
 */
class HelloWorldComponent extends JComponent{
    private static final int default_Width=300;
    private static final int default_height=200;

    public static final int message_X=75;
    public static final int message_Y=100;
    public void paintComponent(Graphics g)
    {
        //g.drawString("******************************",message_X,message_Y);
        g.drawString("It is a Hello World Program",message_X,message_Y);
    }
    // it is a must to have a method for setting a frame to certain dimension
    public Dimension getPreferredSize()
    {
        return new Dimension(default_Width,default_height);
    }
}
/*
 * frame that contains the message panel
 */
class HelloWorldFrame extends JFrame{
    public HelloWorldFrame()
    {
        // when this constructor is called we will add the following component
        add(new HelloWorldComponent());
        pack();
    }
}
public class HelloWorld{
    public static void main(String args[])
    {
        EventQueue.invokeLater(() ->
        {
            var frame=new HelloWorldFrame();
            frame.setTitle("Vishwa GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}
