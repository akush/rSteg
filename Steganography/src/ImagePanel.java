/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhinav
 */
import javax.swing.*;
import java.awt.*;

/**
 * User: denis Date: 21.07.2005 Time: 11:31:02
 */
public class ImagePanel extends JPanel {

    private Image backgroundImage;

    public ImagePanel(Image backgroundImage) {
        super();
        this.backgroundImage = backgroundImage;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.backgroundImage, 0, 0, null);
    }
}
