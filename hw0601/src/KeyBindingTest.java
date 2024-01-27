import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyBindingTest extends JFrame {
    JScrollPane scrollPane;
    JTextArea textArea;

    KeyBindingTest() {
        setTitle("Key Bindings Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        JPanel panel = (JPanel) getContentPane();
        textArea = new JTextArea();
        textArea.setFont(new Font("Consolas", Font.PLAIN, 20));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        panel.add(textArea);
        scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);

        panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "right");
        panel.getActionMap().put("right", rightPressed); // 글자에 실행될 함수 등록
        panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "left");
        panel.getActionMap().put("left", leftPressed);
        panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "up");
        panel.getActionMap().put("up", upPressed);
        panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "down");
        panel.getActionMap().put("down", downPressed);
        panel.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
        panel.getActionMap().put("delete", deletePressed);
        setVisible(true);
    }

    Action rightPressed = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            textArea.append("Right key pressed\n");
        }
    };
    Action leftPressed = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            textArea.append("Left key pressed\n");
        }
    };
    Action upPressed = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            textArea.append("Up key pressed\n");
        }
    };
    Action downPressed = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            textArea.append("Down key pressed\n");
        }
    };
    Action deletePressed = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
        }
    };

    public static void main(String[] args) {
        KeyBindingTest mf = new KeyBindingTest();
    }
}
