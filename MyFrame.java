import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    static CardLayout cardsL;
    static Container c;
    MenuPanel menuP;
    GamePanel gameP;
    GuidePanel guideP;

    public MyFrame() {    //constructor
        c = getContentPane();
        cardsL = new CardLayout();
        c.setLayout(cardsL);

        menuP = new MenuPanel();
        gameP = new GamePanel();
        guideP = new GuidePanel();

        c.add("Welcome", menuP);
        c.add("Power Pong", gameP);
        c.add("Instructions", guideP);

    }

}
