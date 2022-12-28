package horstmann.corejava.guiPract;
import java.awt.*;
public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment()
        .getAvailableFontFamilyNames();
        for(String fonts:fontNames)
        {
            System.out.println(fonts);
        }
    }
    
}
