

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class page extends Canvas{

     public  Midlet midlet;
     
    private static Image background2;
   
    
    private MyParser mypar = new MyParser("page1.xml");
    
     
   private int sign = 1;
   int titleWidth = 34;
   int titleHight = 12;
   int bodyWidth = 30;
   int bodyHeight = 210;
   
   
    public page(Midlet mm) {
        midlet = mm;
        loadImag();
        setFullScreenMode(true);
        
    }
    
    
 
    
    public void loadImag(){
        try {
            background2 = Image.createImage("/image/background2.png");
           
            
        } catch (IOException ex) {
        }
   
    
    }
    protected void paint(Graphics g) {
    g.drawImage(background2, 0, 0, Graphics.LEFT|Graphics.TOP);                
    
  if(sign == 1){
      
       g.drawString(mypar.getHeading(), titleWidth, titleHight, Graphics.LEFT|Graphics.TOP);
        //g.drawImage(sign1, 34, 12, Graphics.LEFT|Graphics.TOP);
        g.drawString(mypar.getText(), bodyWidth, bodyHeight, Graphics.LEFT|Graphics.TOP);
     }
   else if(sign == 2){
      g.drawString(mypar.getHeading(), titleWidth, titleHight, Graphics.LEFT|Graphics.TOP);
        //g.drawImage(sign1, 34, 12, Graphics.LEFT|Graphics.TOP);
        g.drawString(mypar.getText(), bodyWidth, bodyHeight, Graphics.LEFT|Graphics.TOP);
    }
    else if(sign == 3){
       g.drawString(mypar.getHeading(), titleWidth, titleHight, Graphics.LEFT|Graphics.TOP);
        //g.drawImage(sign1, 34, 12, Graphics.LEFT|Graphics.TOP);
        g.drawString(mypar.getText(), bodyWidth, bodyHeight, Graphics.LEFT|Graphics.TOP);
    }
    

    }

    protected void keyPressed(int keyCode) {
        
        
        if(getGameAction(keyCode) == LEFT){
         sign = sign+1;                  
        if(sign == 3){sign = 1;}
        }
        else if (getGameAction(keyCode) == RIGHT){
        sign = sign -1;
        if (sign ==0){sign =3;}
        }
        else if(keyCode == -6){
        //midlet.notifyDestroyed();
              Display.getDisplay(midlet).setCurrent(midlet.myMenu); // back to menu
        }
        
        repaint();
    }
    
    
    
}
