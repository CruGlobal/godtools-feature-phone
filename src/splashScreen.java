

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public final class splashScreen extends Canvas{
Image splash;
Midlet main;
    public splashScreen(Midlet m) {
        main = m;
        loadimage();
        setFullScreenMode(true);
    }


    public void loadimage(){
        try {
            splash= Image.createImage("/image/splash.png");
        } catch (IOException ex) {
           
        }
    }
     
    
    protected void paint(Graphics g) {
        
        g.drawImage(splash, 0, 0, Graphics.TOP|Graphics.LEFT);
        
     
         
    }
    
}
