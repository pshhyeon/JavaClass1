import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerTest extends JFrame implements KeyListener {
    JScrollPane scrollPane;
    JTextArea textArea;

    KeyListenerTest() {
        setTitle("Key Listener Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 20));
        textArea.addKeyListener(this);
        textArea.setEditable(false);
        add(textArea);
        scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                textArea.append("Right key pressed\n");
                break;
            case KeyEvent.VK_LEFT:
                textArea.append("Left key pressed\n");
                break;
            case KeyEvent.VK_DOWN:
                textArea.append("Down key pressed\n");
                break;
            case KeyEvent.VK_UP:
                textArea.append("Up key pressed\n");
                break;
            case KeyEvent.VK_DELETE:
                textArea.setText("");
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        KeyListenerTest mf = new KeyListenerTest();
    }
}