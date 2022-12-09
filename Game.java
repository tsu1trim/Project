import java.awt.image.*;
import javax.swing.*;
import java.io.File;
import javax.imageio.*;
import java.awt.*;



public class Game extends JPanel {
	
   private int myWindowWidth = 700;
   private int myWindowHeight = 450;
	
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
      g.drawRect(30, 155, 90, 20);


      // try{
      //    BufferedImage myPicture = ImageIO.read(new File("art.png"));
      //    g.drawImage(myPicture, 0,0,null);
      // } catch(Exception e){
         
      // }
   }
}