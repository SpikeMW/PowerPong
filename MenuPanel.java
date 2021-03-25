import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuPanel extends JPanel implements ActionListener {
    private JButton goGame;
    private JButton goGuide;

    public MenuPanel() {
        this.setLayout(null);
        goGame = new JButton(" Play! ");
        goGuide = new JButton(" Guide ");
        goGame.setBounds(465,300, 70,30);
        goGuide.setBounds(460,400, 80,30);
        goGuide.setBorderPainted(false);
        goGuide.setForeground(Color.WHITE);
        goGuide.setBackground(Color.BLACK);
        goGuide.addActionListener(this);
        goGame.setBorderPainted(false);
        goGame.setForeground(Color.WHITE);
        goGame.setBackground(Color.BLACK);
        goGame.addActionListener(this);
        this.add(goGuide);
        this.add(goGame);
        this.setBackground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == goGame)
            MyFrame.cardsL.next(MyFrame.c);
        if (e.getSource() == goGuide)
            MyFrame.cardsL.last(MyFrame.c);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced", Font.BOLD + Font.ITALIC, 50));
        g.drawString("Power Pong", 350, 200);
    }

}