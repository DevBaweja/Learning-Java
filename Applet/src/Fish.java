//**********************************************************************
// Fish.Java    Louis Colucci
// Draws a fish
//**********************************************************************

import javax.swing.JApplet;

import java.awt.*;

public class Fish extends JApplet
{
    public void paint (Graphics page)
    {

    final int MID = 300;
    final int TOP = 100;


    setBackground (Color.green);

    page.setColor (Color.white);

    //Draws the body
    page.setColor (Color.blue);
    page.fillOval (MID-70, TOP+70, 360, 120);

    // Adds the name Jascha Heifetz to the body
    page.setColor (Color.black);
    page.drawString ("Jascha Heifetz", 365, 240);

    //Draws the fin
    page.setColor (Color.yellow);
    page.fillOval (MID+75, TOP+40, 85, 45);


     //Draws the tail
    page.setColor (Color.yellow);
    page.fillOval (MID+275, TOP+90, 140, 75);

    //Draws the eye
    page.setColor (Color.yellow);
    page.fillOval (MID+0, TOP+100, 12, 12);

    //Draws the mouth
    page.setColor(Color.white);
    page.drawArc (MID-68, TOP+105, 75, 30, 190, 110);
        }
}