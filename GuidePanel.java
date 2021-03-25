import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GuidePanel extends JPanel implements ActionListener {
    private JButton goMenu;

    public GuidePanel() {
        goMenu = new JButton(" Back ");
        this.setLayout(null);
        goMenu.setForeground(Color.WHITE);
        goMenu.setBackground(Color.BLACK);
        goMenu.setBorderPainted(false);
        goMenu.setBounds(5,5, 70,30);
        goMenu.addActionListener(this);
        this.add(goMenu);
        this.setBackground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == goMenu)
            MyFrame.cardsL.next(MyFrame.c);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Monospaced", Font.BOLD, 30));
        g.drawString("Instructions:", 350, 300);

    }
}