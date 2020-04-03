package Panel;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

public class MyWebPage extends Applet {
                
                // North
                Panel pn,pn1,pn2;
                Label lbn;
                Button btn1,btn2,btn4;
                Choice chn;
                
                Panel ps ,ps1,ps2,ps21,ps22;
                TextArea txfeed;
                Checkbox chyes,chno,r5,r4,r3,r2,r1;
                CheckboxGroup like,star;
                
                public void init()
                {
                                // body
                                setLayout(new BorderLayout());
                                
                                north();
                                add(pn,BorderLayout.NORTH);

                                south();
                                add(ps,BorderLayout.SOUTH);
                }
                
                public void north()
                {
                                
                                lbn = new Label("GeeksForGeeks");
                                
                                pn= new Panel();
                                pn1= new Panel();
                                pn2= new Panel();
                                
                                btn1= new Button("A");
                                btn2= new Button("B");
                                chn = new Choice();
                                chn.add("Select item");
                                chn.add("C");
                                chn.add("C++");
                                chn.add("Java");
                                
                                btn4= new Button("D");
                
                                // button
                                pn2.setLayout(new GridLayout(1,4));
                                pn2.add(btn1);
                                pn2.add(btn2);
                                pn2.add(chn);
                                pn2.add(btn4);
                                
                                pn1.add(lbn); 
                                
                                pn.setLayout(new GridLayout(2,1));
                                pn.add(pn1);
                                pn.add(pn2);
                }
                
                
                public void south()
                {
                                
                                txfeed = new TextArea(10,10);
                                like = new CheckboxGroup();
                                star = new CheckboxGroup();
                                chyes = new Checkbox("YESS",like,true);
                                chno = new Checkbox("NO",like,false);
                                
                                r5 = new Checkbox("*****",star,true);
                                r4 = new Checkbox("****",star,false);
                                r3 = new Checkbox("***",star,false);
                                r2 = new Checkbox("**",star,false);
                                r1 = new Checkbox("*",star,false);
                                
                                ps = new Panel();
                                ps.setLayout( new BorderLayout());
                                
                                ps1 = new Panel();
                                ps1.setLayout(new GridLayout(2,1));
                // elements in ps1            
                                ps1.add(new Label("Feedback"));
                                ps1.add(txfeed);
                                
                                ps.add(ps1,BorderLayout.WEST);
                                
                
                                ps2 = new Panel();
                                ps2.setLayout(new GridLayout(2,1));
                
                                
                                
                                ps21 = new Panel();
                                ps21.setLayout(new GridLayout(1,3));
                                
                                ps21.add(new Label("Do you like it?"));
                                ps21.add(chyes);
                                ps21.add(chno);
                                
                                ps22 = new Panel();
                                ps22.setLayout(new GridLayout(1,6));
                                ps22.add(new Label("Rate us?"));
                                ps22.add(r5);
                                ps22.add(r4);
                                ps22.add(r3);
                                ps22.add(r2);
                                ps22.add(r1);
                                

                                // elements in ps2
                                ps2.add(ps21);
                                ps2.add(ps22);
                                
                                ps.add(ps2,BorderLayout.NORTH);
                                
                }
}


