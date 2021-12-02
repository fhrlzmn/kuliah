package tes;

import java.applet.Applet;
import java.awt.Graphics;
 
/**
 *
 * @author Fhrlzmn
 */
//Extending the Applet class
public class Text extends Applet{
    public void paint(Graphics g){
        g.drawString("UNIBBA to Applet", 100, 100);
    }
}