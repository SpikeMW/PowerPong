import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GamePanel extends JPanel implements ActionListener {
    private JButton goMenu;

    public GamePanel() {
        this.setLayout(null);
        goMenu = new JButton(" Back ");
        goMenu.setBounds(5,5, 70,30);
        goMenu.setForeground(Color.WHITE);
        goMenu.setBackground(Color.BLACK);
        goMenu.setBorderPainted(false);
        goMenu.addActionListener(this);
        this.add(goMenu);
        this.setBackground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == goMenu)
            MyFrame.cardsL.previous(MyFrame.c);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced", Font.BOLD, 30));
        g.drawString("Work in progress", 350, 300);

    }
}