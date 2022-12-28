package horstmann.corejava.guiPract;
import java.awt.*;
import javax.swing.*;
public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame=new ImageFrame();
            frame.setTitle("Image display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    
}
class ImageFrame extends JFrame{
    public ImageFrame()
    {
        add(new ImageComponent());
        pack();
    }
}
class ImageComponent extends JComponent{
    private static final int height=600;
    private static final int width=600;
    public void paintComponent(Graphics g)
    {
        Image image=new ImageIcon("C:\\Users\\vishw\\Downloads\\APJ-2008.jpg").getImage();
        g.drawImage(image, 10, 10, null);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(width,height);
    }
}
