import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class CinemaSeats extends JFrame implements ActionListener {
    JFrame f;
    ArrayList<JButton> order = new ArrayList<>();
    Icon blanco = new ImageIcon("C:\\Users\\CESAR\\Desktop\\Obsession\\Logo\\Blanco.jpg");
    Icon azul = new ImageIcon("C:\\Users\\CESAR\\Desktop\\Obsession\\Logo\\Azul.jpg");
    Font font = new Font("Courier", Font.BOLD, 12);
    Font font1 = new Font("Courier", Font.BOLD, 16);
    JButton seatA1;
    JButton seatA2 = new JButton(blanco);
    JButton seatA3 = new JButton(blanco);
    JButton seatA4 = new JButton(blanco);
    JButton seatA5 = new JButton(blanco);
    JButton seatA6 = new JButton(blanco);
    JButton seatB1 = new JButton(blanco);
    JButton seatB2 = new JButton(blanco);
    JButton seatB3 = new JButton(blanco);
    JButton seatB4 = new JButton(blanco);
    JButton seatB5 = new JButton(blanco);
    JButton seatB6 = new JButton(blanco);
    JButton seatC1 = new JButton(blanco);
    JButton seatC2 = new JButton(blanco);
    JButton seatC3 = new JButton(blanco);
    JButton seatC4 = new JButton(blanco);
    JButton seatC5 = new JButton(blanco);
    JButton seatC6 = new JButton(blanco);
    JButton submit = new JButton("SUBMIT");
    JButton yes = new JButton("Yes");
    JButton No = new JButton("No");


    public void Room1() {
        f = new JFrame("Coding Cinema - Sala 1");
        f.getContentPane().setBackground(Color.gray);

        JTextField screenPoss = new JTextField();
        JLabel screenMsm = new JLabel("<html><font color='white'>SCREEN</font></html>");
        screenMsm.setFont(font1);
        JLabel Column1 = new JLabel("<html><font color='white'>1</font></html>");
        Column1.setFont(font1);
        JLabel Column2 = new JLabel("<html><font color='white'>2</font></html>");
        Column2.setFont(font1);
        JLabel Column3 = new JLabel("<html><font color='white'>3</font></html>");
        Column3.setFont(font1);
        JLabel Column4 = new JLabel("<html><font color='white'>4</font></html>");
        Column4.setFont(font1);
        JLabel Column5 = new JLabel("<html><font color='white'>5</font></html>");
        Column5.setFont(font1);
        JLabel Column6 = new JLabel("<html><font color='white'>6</font></html>");
        Column6.setFont(font1);
        JLabel RowA = new JLabel("<html><font color='white'>A</font></html>");
        RowA.setFont(font1);
        JLabel RowB = new JLabel("<html><font color='white'>B</font></html>");
        RowB.setFont(font1);
        JLabel RowC = new JLabel("<html><font color='white'>C</font></html>");
        RowC.setFont(font1);


        seatA1 = new JButton(blanco);
        seatA1.setActionCommand("A1");
        seatA2.setActionCommand("A2");
        seatA3.setActionCommand("A3");
        seatA4.setActionCommand("A4");
        seatA5.setActionCommand("A5");
        seatA6.setActionCommand("A6");
        seatB1.setActionCommand("B1");
        seatB2.setActionCommand("B2");
        seatB3.setActionCommand("B3");
        seatB4.setActionCommand("B4");
        seatB5.setActionCommand("B5");
        seatB6.setActionCommand("B6");
        seatC1.setActionCommand("C1");
        seatC2.setActionCommand("C2");
        seatC3.setActionCommand("C3");
        seatC4.setActionCommand("C4");
        seatC5.setActionCommand("C5");
        seatC6.setActionCommand("C6");


        screenMsm.setBounds(204, 3, 90, 17);
        screenPoss.setBounds(24, 20, 434, 15);
        Column1.setBounds(60, 152, 40, 28);
        Column2.setBounds(120, 152, 40, 28);
        Column3.setBounds(180, 152, 40, 28);
        Column4.setBounds(290, 152, 40, 28);
        Column5.setBounds(350, 152, 40, 28);
        Column6.setBounds(410, 152, 40, 28);
        RowA.setBounds(238, 55, 40, 28);
        RowB.setBounds(238, 90, 40, 28);
        RowC.setBounds(238, 125, 40, 28);
        seatA1.setBounds(34, 55, 60, 28);
        seatA2.setBounds(96, 55, 60, 28);
        seatA3.setBounds(158, 55, 60, 28);
        seatA4.setBounds(266, 55, 60, 28);
        seatA5.setBounds(328, 55, 60, 28);
        seatA6.setBounds(390, 55, 60, 28);
        seatB1.setBounds(34, 90, 60, 28);
        seatB2.setBounds(96, 90, 60, 28);
        seatB3.setBounds(158, 90, 60, 28);
        seatB4.setBounds(266, 90, 60, 28);
        seatB5.setBounds(328, 90, 60, 28);
        seatB6.setBounds(390, 90, 60, 28);
        seatC1.setBounds(34, 125, 60, 28);
        seatC2.setBounds(96, 125, 60, 28);
        seatC3.setBounds(158, 125, 60, 28);
        seatC4.setBounds(266, 125, 60, 28);
        seatC5.setBounds(328, 125, 60, 28);
        seatC6.setBounds(390, 125, 60, 28);


        submit.setBounds(180, 190, 120, 35);

        screenPoss.setBackground(Color.cyan);
        screenPoss.setEditable(false);
        f.add(screenPoss);
        f.add(Column1);
        f.add(Column2);
        f.add(Column3);
        f.add(Column4);
        f.add(Column5);
        f.add(Column6);
        f.add(RowA);
        f.add(RowB);
        f.add(RowC);
        f.add(screenMsm);
        f.add(seatA1);
        f.add(seatA2);
        f.add(seatA3);
        f.add(seatA4);
        f.add(seatA5);
        f.add(seatA6);
        f.add(seatB1);
        f.add(seatB2);
        f.add(seatB3);
        f.add(seatB4);
        f.add(seatB5);
        f.add(seatB6);
        f.add(seatC1);
        f.add(seatC2);
        f.add(seatC3);
        f.add(seatC4);
        f.add(seatC5);
        f.add(seatC6);
        f.add(submit);

        seatA1.addActionListener(this);
        seatA2.addActionListener(this);
        seatA3.addActionListener(this);
        seatA4.addActionListener(this);
        seatA5.addActionListener(this);
        seatA6.addActionListener(this);
        seatB1.addActionListener(this);
        seatB2.addActionListener(this);
        seatB3.addActionListener(this);
        seatB4.addActionListener(this);
        seatB5.addActionListener(this);
        seatB6.addActionListener(this);
        seatC1.addActionListener(this);
        seatC2.addActionListener(this);
        seatC3.addActionListener(this);
        seatC4.addActionListener(this);
        seatC5.addActionListener(this);
        seatC6.addActionListener(this);
        submit.addActionListener(this);


        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();


        if (input.equalsIgnoreCase("A1")) {
            if (seatA1.getIcon() == blanco) {
                seatA1.setIcon(azul);
                order.add(seatA1);

            } else {
                seatA1.setIcon(blanco);
                order.remove(seatA1);
            }

        } else if (input.equalsIgnoreCase("A2")) {
            if (seatA2.getIcon() == blanco) {
                seatA2.setIcon(azul);
                order.add(seatA2);

            } else {
                seatA2.setIcon(blanco);
                order.remove(seatA2);
            }

        } else if (input.equalsIgnoreCase("A3")) {
            if (seatA3.getIcon() == blanco) {
                seatA3.setIcon(azul);
                order.add(seatA3);

            } else {
                seatA3.setIcon(blanco);
                order.remove(seatA3);
            }

        } else if (input.equalsIgnoreCase("A4")) {
            if (seatA4.getIcon() == blanco) {
                seatA4.setIcon(azul);
                order.add(seatA4);

            } else {
                seatA4.setIcon(blanco);
                order.remove(seatA4);
            }

        } else if (input.equalsIgnoreCase("A5")) {
            if (seatA5.getIcon() == blanco) {
                seatA5.setIcon(azul);
                order.add(seatA5);

            } else {
                seatA5.setIcon(blanco);
                order.remove(seatA5);
            }

        } else if (input.equalsIgnoreCase("A6")) {
            if (seatA6.getIcon() == blanco) {
                seatA6.setIcon(azul);
                order.add(seatA6);

            } else {
                seatA6.setIcon(blanco);
                order.remove(seatA6);
            }

        } else if (input.equalsIgnoreCase("B1")) {
            if (seatB1.getIcon() == blanco) {
                seatB1.setIcon(azul);
                order.add(seatB1);

            } else {
                seatB1.setIcon(blanco);
                order.remove(seatB1);
            }

        } else if (input.equalsIgnoreCase("B2")) {
            if (seatB2.getIcon() == blanco) {
                seatB2.setIcon(azul);
                order.add(seatB2);

            } else {
                seatB2.setIcon(blanco);
                order.remove(seatB2);
            }

        } else if (input.equalsIgnoreCase("B3")) {
            if (seatB3.getIcon() == blanco) {
                seatB3.setIcon(azul);
                order.add(seatB3);

            } else {
                seatB3.setIcon(blanco);
                order.remove(seatB3);
            }

        } else if (input.equalsIgnoreCase("B4")) {
            if (seatB4.getIcon() == blanco) {
                seatB4.setIcon(azul);
                order.add(seatB4);

            } else {
                seatB4.setIcon(blanco);
                order.remove(seatB4);
            }

        } else if (input.equalsIgnoreCase("B5")) {
            if (seatB5.getIcon() == blanco) {
                seatB5.setIcon(azul);
                order.add(seatB5);

            } else {
                seatB5.setIcon(blanco);
                order.remove(seatB5);
            }

        } else if (input.equalsIgnoreCase("B6")) {
            if (seatB6.getIcon() == blanco) {
                seatB6.setIcon(azul);
                order.add(seatB6);

            } else {
                seatB6.setIcon(blanco);
                order.remove(seatB6);
            }

        } else if (input.equalsIgnoreCase("C1")) {
            if (seatC1.getIcon() == blanco) {
                seatC1.setIcon(azul);
                order.add(seatC1);

            } else {
                seatC1.setIcon(blanco);
                order.remove(seatC1);
            }

        } else if (input.equalsIgnoreCase("C2")) {
            if (seatC2.getIcon() == blanco) {
                seatC2.setIcon(azul);
                order.add(seatC2);

            } else {
                seatC2.setIcon(blanco);
                order.remove(seatC2);
            }

        } else if (input.equalsIgnoreCase("C3")) {
            if (seatC3.getIcon() == blanco) {
                seatC3.setIcon(azul);
                order.add(seatC3);

            } else {
                seatC3.setIcon(blanco);
                order.remove(seatC3);
            }

        } else if (input.equalsIgnoreCase("C4")) {
            if (seatC4.getIcon() == blanco) {
                seatC4.setIcon(azul);
                order.add(seatC4);

            } else {
                seatC4.setIcon(blanco);
                order.remove(seatC4);
            }

        } else if (input.equalsIgnoreCase("C5")) {
            if (seatC5.getIcon() == blanco) {
                seatC5.setIcon(azul);
                order.add(seatC5);

            } else {
                seatC5.setIcon(blanco);
                order.remove(seatC5);
            }

        } else if (input.equalsIgnoreCase("C6")) {
            if (seatC6.getIcon() == blanco) {
                seatC6.setIcon(azul);
                order.add(seatC6);

            } else {
                seatC6.setIcon(blanco);
                order.remove(seatC6);
            }

        } else if(input.equalsIgnoreCase("Submit")){

            ArrayList<String> seats = new ArrayList<>();
            JFrame confirmOrder = new JFrame("Seat(s) order confirmation");
            JLabel sure;
            JLabel price;


            if (order != null && order.size() != 0) {

                for (JButton x : order) {
                    seats.add(x.getActionCommand());
                }
                sure = new JLabel("Are you sure you want to buy seat(s):    " + seats);
                price = new JLabel("For: US$" + seats.size() * 6 + "?");


                sure.setBounds(60, 0, 320, 40);
                price.setBounds(125, 15, 320, 60);
                No.setBounds(115, 60, 60, 25);
                yes.setBounds(190, 60, 60, 25);
                confirmOrder.add(price);
                confirmOrder.add(yes);
                confirmOrder.add(No);


                yes.addActionListener(e1 -> {
                    String input2 = e1.getActionCommand();
                    if (input2.equalsIgnoreCase("Yes")) {
                        for (JButton button : order) {
                            button.setBackground(null);
                            button.setEnabled(false);

                        }
                        order.clear();
                        confirmOrder.dispose();
                    }
                });

                No.addActionListener(e1 -> {
                    String input3 = e1.getActionCommand();
                    if (input3.equalsIgnoreCase("No")) {
                        for (JButton button : order) {
                            button.setIcon(blanco);

                        }
                        order.clear();
                        confirmOrder.dispose();
                    }
                });

            } else {
                sure = new JLabel("Choose a seat");
                sure.setBounds(125, 5, 320, 60);

            }

            confirmOrder.add(sure);
            confirmOrder.setSize(380, 160);
            confirmOrder.setLayout(null);
            confirmOrder.setVisible(true);

        }
}


    public static void main(String[] args) {
        new CinemaSeats().Room1();
    }
}
