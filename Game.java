import java.awt.image.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.*;
import java.awt.*;



public class Game extends JPanel {
	
   private int myWindowWidth = 700;
   private int myWindowHeight = 550;
	
   public Game() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
	
   public void paintComponent (Graphics g) {
      // Top Section
      g.drawString ("YAHTZEE!", 325, 20);	
      
      g.drawString ("Rolls left", 30, 44);	
      g.drawRect(95, 33, 50, 20);

      g.drawString ("Dice Total", 30, 73);	
      g.drawRect(95, 60, 50, 20);

      // 1 2 3 4 5 6 section
      g.drawRect(30, 150, 90, 20);
      g.drawRect(130, 150, 90, 20);

      g.drawRect(30, 180, 90, 20);
      g.drawRect(130, 180, 90, 20);

      g.drawRect(30, 210, 90, 20);
      g.drawRect(130, 210, 90, 20);

      g.drawRect(30, 240, 90, 20);
      g.drawRect(130, 240, 90, 20);

      g.drawRect(30, 270, 90, 20);
      g.drawRect(130, 270, 90, 20);

      g.drawRect(30, 300, 90, 20);
      g.drawRect(130, 300, 90, 20);

      // SubTOTAL,BONUS-- BOXES
      g.drawRect(130, 340, 100, 20);
      g.drawRect(130, 370, 100, 20);
      g.drawRect(130, 400, 100, 20);
     

      // SUBTOAL, BONUS---LETTERINGS-

      g.drawString("SUBTOTAL", 50, 355);
      g.drawString("BONUS", 50, 385);
      g.drawString("UPPERTOTAL", 50, 415);

         // DICE IMAGES (squares)

         
         g.drawRect(230, 40, 40, 40);
         g.drawRect(280, 40, 40, 40);
         g.drawRect(330, 40, 40, 40);
         g.drawRect(380, 40, 40, 40);
         g.drawRect(430, 40, 40, 40);

         g.drawRect(445, 85, 10, 10);
         g.drawRect(245, 85, 10, 10);
         g.drawRect(295, 85, 10, 10);
         g.drawRect(345, 85, 10, 10);
         g.drawRect(395, 85, 10, 10);



      // try{
      //    BufferedImage myPicture = ImageIO.read(new File("art.png"));
      //    g.drawImage(myPicture, 0,0,null);
      // } catch(Exception e){
         
      // }
   }
}