import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel(); //Alterada depois do GamePanel
        frame.add(panel);
        frame.pack(); //Alterado
        frame.setVisible(true);
        });
    }
}
