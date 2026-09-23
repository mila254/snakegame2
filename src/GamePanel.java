import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final Board board = new Board();

    public GamePanel () {

        setPreferredSize (new Dimension (GameConstants.WIDTH, GameConstants.HEIGHT));
    }

    @Override // Ela substituiu um metodo já existente na classe pai JPanel
    protected void paintComponent(graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2)
    }
}