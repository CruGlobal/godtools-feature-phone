

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class menu extends Canvas{
Midlet main;
//form form;
Image back;
Image choose;

int mychoice = 0;

// 0 = display mode
// 1 = quiz mode

public menu(Midlet m) {
        main = m;
    setFullScreenMode(true);
    loadimage();
    }

public void loadimage(){
        try {
        back = Image.createImage("/image/menuback.png");
        choose = Image.createImage("/image/selector.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

}
    

    protected void paint(Graphics g) {
        g.drawImage(back, 0, 0, Graphics.LEFT|Graphics.TOP);
        
        if(mychoice == 0){
            g.drawImage(choose, 15, 84, g.LEFT|g.TOP);
        }
        else if (mychoice == 1){
        g.drawImage(choose, 15, 122, g.LEFT|g.TOP);
        }
        else if (mychoice == 2){
        g.drawImage(choose, 15,160, g.LEFT|g.TOP);
        }
        else if (mychoice == 3){
        g.drawImage(choose, 15,198, g.LEFT|g.TOP);
        }
        else if (mychoice == 4){
        g.drawImage(choose, 15,226, g.LEFT|g.TOP);
        }
        
    }

    protected void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
        
        if(getGameAction(keyCode) == DOWN && mychoice == 0){
        mychoice = 1;
        }
        
        else if(getGameAction(keyCode) == UP && mychoice == 1){
        mychoice = 0;
        }
        else if(getGameAction(keyCode) == DOWN && mychoice == 1){
        mychoice = 2;
        }
        else if(getGameAction(keyCode) == UP && mychoice == 2){
        mychoice = 1;
        }
        else if(getGameAction(keyCode) == DOWN && mychoice == 2){
        mychoice = 3;
        }
        else if(getGameAction(keyCode) == UP && mychoice == 3){
        mychoice = 2;
        }
        else if(getGameAction(keyCode) == DOWN && mychoice == 3){
        mychoice = 4;
        }else if(getGameAction(keyCode) == UP && mychoice == 4){
        mychoice = 3;
        }
        
        
        if(getGameAction(keyCode) == FIRE){
    if(mychoice == 3){ 
       Display.getDisplay(main).setCurrent(main.currentPage);}
    else if (mychoice == 1){
      //  Display.getDisplay(main).setCurrent(main.myquizclass.form);
    }
            
    }
            else if(keyCode == -6){
        main.notifyDestroyed();
            
        
        }
        repaint();
    }
    
    
    
}
