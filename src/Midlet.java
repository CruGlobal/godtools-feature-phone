

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

public class Midlet extends MIDlet {
    Display d;
    page currentPage;
    splashScreen mysplashscreen = new splashScreen(this);;
    menu myMenu;
    public static final boolean DEBUG = false; public static final int WHITE = 0xFFFFFF;
    public static final int BLACK = 0x000000;
    public static final int BLUE = 0x0000FF;
    public static final int LIGHT_GRAY = 0xAAAAAA;
    public static final int DARK_GRAY = 0x555555;
//    quizClass myquizclass;
   // form form;
    
    public Midlet()
    {
        
    }
    
    public void startApp() {
        currentPage = new page(this);
        currentPage.repaint();
     //   myquizclass = new quizClass(this);
        myMenu = new menu(this);
        d=Display.getDisplay(this);
        d.setCurrent(mysplashscreen);
           try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        d.setCurrent(this.myMenu);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
