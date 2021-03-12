package src.Main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicFrame extends JFrame{

	public TicFrame() {

        initUI();
    }

    private void initUI() {

        add(new TicPanel());

        setTitle("Tic Tac Toe");
        setSize(260, 260);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {

            public void run() 
            {
            	TicFrame ex = new TicFrame();
                ex.setVisible(true);
            }
        });
    }
}


public class TicPanel extends JPanel{

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,restart,tryAgain,setNames,follow;
    int _1,_2,_3,_4,_5,_6,_7,_8,_9,tie;
    int cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8,cp9;
    int x,sc1,sc2;
    boolean ai = false;
    JLabel jl3 = new JLabel();
    JLabel p1Sc = new JLabel();
    JLabel p2Sc = new JLabel();
    JOptionPane jp = new JOptionPane();
    String player1;
    String player2;

    public TicPanel()
    {
        player1 = ("Player_1");
        player2 = ("Player_2");
        jl3.setText("<----------------->");
        p1Sc.setText(player1+" = "+sc1);
        p2Sc.setText(player2+" = "+sc2);
         x = 0;
        _1 = 0;
        _2 = 0;
        _3 = 0;
        _4 = 0;
        _5 = 0;
        _6 = 0;
        _7 = 0;
        _8 = 0;
        _9 = 0;
        b1 = new JButton("_");
        b2 = new JButton("_");
        b3 = new JButton("_");
        b4 = new JButton("_");
        b5 = new JButton("_");
        b6 = new JButton("_");
        b7 = new JButton("_");
        b8 = new JButton("_");
        b9 = new JButton("_");
        restart = new JButton("RESTART ");
        reset = new JButton("   RESET   ");
        tryAgain = new JButton("TRY AGAIN");
        setNames = new JButton("SET NAME");
        follow = new JButton("  PlayerVsPlayer  ");
      	tryAgain.setEnabled(false);
        adding();
    }

    public void Check()
    {
        if(_1 == 1 && _2 == 1 && _3 == 1){
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_1 == 2 && _2 == 2 && _3 == 2) || (cp1 == 1 && cp2 == 1 && cp3 == 1) ){
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_1 == 1 && _4 == 1 && _7 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_1 == 2 && _4 == 2 && _7 == 2) || (cp1 == 1 && cp4 == 1 && cp7 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_2 == 1 && _5 == 1 && _8 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_2 == 2 && _5 == 2 && _8 == 2) || (cp2 == 1 && cp5 == 1 && cp8 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_3 == 1 && _6 == 1 && _9 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_3 == 2 && _6 == 2 && _9 == 2) || (cp3 == 1 && cp6 == 1 && cp9 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_4 == 1 && _5 == 1 && _6 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_4 == 2 && _5 == 2 && _6 == 2) || (cp4 == 1 && cp5 == 1 && cp6 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_7 == 1 && _8 == 1 && _9 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_7 == 2 && _8 == 2 && _9 == 2)  || (cp7 == 1 && cp8 == 1 && cp9 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_1 == 1 && _5 == 1 && _9 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_1 == 2 && _5 == 2 && _9 == 2) || (cp1 == 1 && cp5 == 1 && cp9 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else if(_3 == 1 && _5 == 1 && _7 == 1)
        {
            sc1++;
            p1Sc.setText(player1+" = "+sc1);
            jp.showMessageDialog(null,player1+" Won");
            disable();
        }
        else if((_3 == 2 && _5 == 2 && _7 == 2) || (cp3 == 1 && cp5 == 1 && cp7 == 1))
        {
            sc2++;
            p2Sc.setText(player2+" = "+sc2);
            jp.showMessageDialog(null,player2+" Won");
            disable();
        }
        else
        {
            if(tie == 9 || (tie == 5 && follow.getText() == "    CpuVsPlayer     "))
            {
            jp.showMessageDialog(null,"Draw!\nBetter luck next Time");
            reset.setEnabled(false);
            tryAgain.setEnabled(true);
            }
        }
    }

    public void restart()
    {
        tie = 0;
        b1.setText("_");
        b2.setText("_");
        b3.setText("_");
        b4.setText("_");
        b5.setText("_");
        b6.setText("_");
        b7.setText("_");
        b8.setText("_");
        b9.setText("_");
        x = 0;
        _1 = 0;
        _2 = 0;
        _3 = 0;
        _4 = 0;
        _5 = 0;
        _6 = 0;
        _7 = 0;
        _8 = 0;
        _9 = 0;
        cp1 = 0;
        cp2 = 0;
        cp3 = 0;
        cp4 = 0;
        cp5 = 0;
        cp6 = 0;
        cp7 = 0;
        cp8 = 0;
        cp9 = 0;
        tryAgain.setEnabled(false);
        reset.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

    }

    public void disable()
    {
    	tryAgain.setEnabled(true);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        reset.setEnabled(false);
    }

    public void adding()
    {
        add(b1);
        add(b2);
        add(b3);
        add(tryAgain);
        add(b4);
        add(b5);
        add(b6);
        add(setNames);
        add(b7);
        add(b8);
        add(b9);
        add(reset);
        add(follow);
        add(restart);
        add(p1Sc);
        add(jl3);
        add(p2Sc);

        tryAgain.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event) {

                    restart();
                }

            });
        restart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event) {

                restart();
                sc1 = 0;
                sc2 = 0;
                p1Sc.setText(player1+" = "+sc1);
                p2Sc.setText(player2+" = "+sc2);
            }

        });
        follow.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    restart();
                    if(ai)
                    {
                        follow.setText("  PlayerVsPlayer  ");
                        ai = false;
                      
                    }
                    else
                    {
                    	
                        follow.setText("    CpuVsPlayer     ");
                        ai = true;
                        
                    }
                    sc1 = 0;
                    sc2 = 0;
                    if(follow.getText().trim().equals("PlayerVsPlayer")){
                    player2 = "player2";
                    p1Sc.setText(player1+" = "+sc1);
                    p2Sc.setText(player2+" = "+sc2);
                    }else
                    {
                    	 player2 = "Cpu";
                         p1Sc.setText(player1+" = "+sc1);
                         p2Sc.setText(player2+" = "+sc2);
                    }
                }

            });
        reset.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    
                   if(ai)
                   {
                	   restart();   
                   }
                   else{
                	   if(x == 1)
                	   jp.showMessageDialog(null,"Dont cheat your friend "+player1);
                	   if(x == 0)
                		   jp.showMessageDialog(null,"Dont cheat your friend "+player2);	   
                   }
                   
                	   
                }

            });
        setNames.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    int c = 0;
                    while(c == 0){
                        try{
                        	while(c == 0)
                        	{
                            player1 = jp.showInputDialog("Enter Player_1 Name", null);
                            if(player1.length() <= 6 || (player1.equals("")))
                            {
                            	break;
                            }else{
                            	jp.showMessageDialog(null,"Name should be below six(6) Letter!");
                            }
                        	}
                            if(ai)
                            {
                            	player2 = "CPU";
                            	 p2Sc.setText(player2+" = "+sc2);
                            }
                            else
                            {
                            	while(c == 0)
                            	{
                            player2 = jp.showInputDialog("Enter Player_2 Name", null);
                            if(player2.length() <= 6 || (player1.equals("")))
                            {
                            	break;
                            }else{
                            	jp.showMessageDialog(null,"Name should be below six(6) Letter!");
                            }
                            	}
                            }
                            p1Sc.setText(player1+" = "+sc1);
                            p2Sc.setText(player2+" = "+sc2);
                            if(player1.equalsIgnoreCase(player2))
                            {
                            	player2 = player2+"2";
                                p2Sc.setText(player2+" = "+sc2);
                            }
                            if((player1 == null && player2 == null) || (player1 == null || player2 == null))
                            {
                                player1 = "Player1";
                                player2 = "player2";
                                p1Sc.setText(player1+" = "+sc1);
                                p2Sc.setText(player2+" = "+sc2);
                                jp.showMessageDialog(null," No Name set!");
                                break;
                            }

                            else
                            {
                                jp.showMessageDialog(null,"Name set!");
                                break;
                            }
                          
                        }
                        catch(Exception e)
                        {

                        }
                    }
                }

            });
        b1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b1.setText("x");
                        b1.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _1 = 1;
                        if(ai)
                        {
                            AI();
                        }
                    }
                    else
                    {
                        b1.setText("o");
                        b1.setEnabled(false);
                        x = 0;
                        _1 = 2;
                    }
                    Check();
                }

            });
        b2.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b2.setText("x");
                        b2.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _2 = 1;
                        if(ai)
                        {
                            AI();
                        }
                    }
                    else
                    {
                        b2.setText("o");
                        b2.setEnabled(false);
                        x = 0;
                        _2 = 2;
                    }
                    Check();

                }

            });
        b3.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b3.setText("x");
                        b3.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }

                        _3 =1;
                        if(ai)
                        {
                            AI();
                        }
                    }
                    else
                    {
                        b3.setText("o");
                        b3.setEnabled(false);
                        x = 0;
                        _3 = 2;
                    }
                    Check();

                }

            });
        b4.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b4.setText("x");
                        b4.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _4 = 1;
                        if(ai)
                        {
                            AI();
                        }
                    }
                    else
                    {
                        b4.setText("o");
                        b4.setEnabled(false);
                        x = 0;
                        _4 = 2;
                    }
                    Check();

                }

            });
        b5.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b5.setText("x");
                        b5.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _5 = 1;
                        if(ai)
                        {
                        	AI();
                        }
                    }
                    else
                    {
                        b5.setText("o");
                        b5.setEnabled(false);
                        x = 0;
                        _5 = 2;
                    }
                    Check();

                }

            });
        b6.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b6.setText("x");
                        b6.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _6 = 1;
                        if(ai)
                        {
                        	AI();
                        }
                    }
                    else
                    {
                        b6.setText("o");
                        b6.setEnabled(false);
                        x = 0;
                        _6 = 2;
                    }
                    Check();

                }

            });
        b7.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b7.setText("x");
                        b7.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _7 = 1;
                        if(ai)
                        {
                        	AI();
                        }
                    }
                    else
                    {
                        b7.setText("o");
                        b7.setEnabled(false);
                        x = 0;
                        _7 = 2;
                    }
                    Check();

                }

            });
        b8.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b8.setText("x");
                        b8.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _8 = 1;
                        if(ai)
                        {
                        	AI();
                        }
                    }
                    else
                    {
                        b8.setText("o");
                        b8.setEnabled(false);
                        x = 0;
                        _8 = 2;
                    }
                    Check();

                }

            });
        b9.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent event) {
                    tie++;
                    if(x == 0)
                    {
                        b9.setText("x");
                        b9.setEnabled(false);
                        if(!ai){
                            x = 1;
                        }
                        _9 = 1;
                        if(ai)
                        {
                        	AI();
                        }
                    }
                    else
                    {
                        b9.setText("o");
                        b9.setEnabled(false);
                        x = 0;
                        _9 = 2;
                    }
                    Check();

                }

            });

    }

    public void AI()
    {
        if(ai)
        {
            if(b1.getText().equalsIgnoreCase("O") && b2.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }
            else if(b4.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("O") && b6.getText().equalsIgnoreCase("_"))
            {
                b6.setText("o");
                b6.setEnabled(false);
                cp6 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("O") && b8.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }

            else if(b2.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("O") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("O") && b6.getText().equalsIgnoreCase("O") && b4.getText().equalsIgnoreCase("_"))
            {
                b4.setText("o");
                b4.setEnabled(false);
                cp4 = 1;
            }
            else if(b8.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }
            else if(b1.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("O") && b2.getText().equalsIgnoreCase("_"))
            {
                b2.setText("o");
                b2.setEnabled(false);
                cp2 = 1;
            }
            else if(b4.getText().equalsIgnoreCase("O") && b6.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b8.getText().equalsIgnoreCase("_"))
            {
                b8.setText("o");
                b8.setEnabled(false);
                cp8 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("O") && b4.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }
            else if(b2.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("O") && b8.getText().equalsIgnoreCase("_"))
            {
                b8.setText("o");
                b8.setEnabled(false);
                cp8 = 1;
            }
            else if(b3.getText().equalsIgnoreCase("O") && b6.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }

            else if(b4.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("O") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("O") && b8.getText().equalsIgnoreCase("O") && b2.getText().equalsIgnoreCase("_"))
            {
                b2.setText("o");
                b2.setEnabled(false);
                cp2 = 1;
            }
            else if(b6.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("O") && b4.getText().equalsIgnoreCase("_"))
            {
                b4.setText("o");
                b4.setEnabled(false);
                cp4 = 1;
            }
            else if(b2.getText().equalsIgnoreCase("O") && b8.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }
            else if(b3.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b6.getText().equalsIgnoreCase("_"))
            {
                b6.setText("o");
                b6.setEnabled(false);
                cp6 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b1.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }

            else if(b3.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("O") && b3.getText().equalsIgnoreCase("O") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b2.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }
            else if(b4.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("X") && b6.getText().equalsIgnoreCase("_"))
            {
                b6.setText("o");
                b6.setEnabled(false);
                cp6 = 1;
            }

            else if(b7.getText().equalsIgnoreCase("X") && b8.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }

            else if(b2.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("X") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("X") && b6.getText().equalsIgnoreCase("X") && b4.getText().equalsIgnoreCase("_"))
            {
                b4.setText("o");
                b4.setEnabled(false);
                cp4 = 1;
            }
            else if(b8.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("X") && b2.getText().equalsIgnoreCase("_"))
            {
                b2.setText("o");
                b2.setEnabled(false);
                cp2 = 1;
            }
            else if(b4.getText().equalsIgnoreCase("X") && b6.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b8.getText().equalsIgnoreCase("_"))
            {
                b8.setText("o");
                b8.setEnabled(false);
                cp8 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b4.getText().equalsIgnoreCase("X") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }
            else if(b2.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("X") && b8.getText().equalsIgnoreCase("_"))
            {
                b8.setText("o");
                b8.setEnabled(false);
                cp8 = 1;
            }
            else if(b3.getText().equalsIgnoreCase("X") && b6.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }

            else if(b4.getText().equalsIgnoreCase("X") && b7.getText().equalsIgnoreCase("X") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("X") && b8.getText().equalsIgnoreCase("X") && b2.getText().equalsIgnoreCase("_"))
            {
                b2.setText("o");
                b2.setEnabled(false);
                cp2 = 1;
            }
            else if(b6.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b7.getText().equalsIgnoreCase("X") && b4.getText().equalsIgnoreCase("_"))
            {
                b4.setText("o");
                b4.setEnabled(false);
                cp4 = 1;
            }
            else if(b2.getText().equalsIgnoreCase("X") && b8.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }
            else if(b3.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b6.getText().equalsIgnoreCase("_"))
            {
                b6.setText("o");
                b6.setEnabled(false);
                cp6 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("_"))
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
            else if(b1.getText().equalsIgnoreCase("X") && b9.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }

            else if(b3.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("X") && b7.getText().equalsIgnoreCase("_"))
            {
                b7.setText("o");
                b7.setEnabled(false);
                cp7 = 1;
            }

            else if(b7.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("_"))
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }
            else if(b7.getText().equalsIgnoreCase("X") && b3.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("O") && b9.getText().equalsIgnoreCase("X"))
            {
                b6.setText("o");
                b6.setEnabled(false);
                cp6 = 1;
            }

            else if(b3.getText().equalsIgnoreCase("X") && b5.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("X")) 
            {
                b4.setText("o");
                b4.setEnabled(false);
                cp4 = 1;
            }
            else if(b4.getText().equalsIgnoreCase("o") && b5.getText().equalsIgnoreCase("O") && b7.getText().equalsIgnoreCase("x")) 
            {
                b9.setText("o");
                b9.setEnabled(false);
                cp9 = 1;
            }
            else if(b1.getText().equalsIgnoreCase("o") && b5.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x")) 
            {
                b3.setText("o");
                b3.setEnabled(false);
                cp3 = 1;
            }
            else if(b5.getText().equalsIgnoreCase("_"))
            {
                b5.setText("o");
                b5.setEnabled(false);
                cp5 = 1;
            }

            else if(b1.getText().equalsIgnoreCase("_"))
            {
                b1.setText("o");
                b1.setEnabled(false);
                cp1 = 1;
            }
        }
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.GRAY);
        g.setFont(new Font("Aerial",Font.BOLD,30));
        g.drawString("_______________________________", 00,142);
        g.drawString("TIC-TAC-TOE", 40,175);
        g.setColor(Color.white);
        g.drawString("_______________________________", 00,144);
        g.drawString("TIC-TAC-TOE", 42,177);
        g.setColor(Color.GRAY);
        g.setFont(new Font("Aerial",Font.BOLD,20));
        g.drawString("By", 120,195);
        g.setColor(Color.white);
        g.drawString("By", 122,197);
        g.setColor(Color.GRAY);
        g.setFont(new Font("Aerial",Font.BOLD,25));
        g.drawString("_______________________________", 00,222);
        g.drawString("NARMATHA T", 58,220);
        g.setColor(Color.white);
        g.drawString("NARMATHA T", 60,222);
        g.drawString("_______________________________", 00,224);
    }

}