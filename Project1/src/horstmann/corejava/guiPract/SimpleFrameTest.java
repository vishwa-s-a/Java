package horstmann.corejava.guiPract;
import java.awt.*;// here awt refers to abstract window toolkit
import javax.swing.JFrame;//here javax means java extension package, not a core package
// this SimpleFrame class is used for setting the size of the frame to our values, instead of default values 0,0
class SimpleFrame extends JFrame{
    Toolkit tool=Toolkit.getDefaultToolkit();
    Dimension size=tool.getScreenSize();
    private int DefaultWidth=size.width;
    private int DefaultHeight=size.height;
    public SimpleFrame()
    {
        setSize(DefaultWidth,DefaultHeight);
    }
}
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame=new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setVisible(true);
            frame.setAlwaysOnTop(true);
        }
        );
    }
    
}
