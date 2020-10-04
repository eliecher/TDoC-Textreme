package App;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;

public class Textreme {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		Text_editor window = new Text_editor();
		window.frame.setVisible(true);
		window.frame.setLocationRelativeTo(null);
	}
}

class Text_editor {
	JFrame frame;
	JPanel fontTaker;
	JTextPane textArea;
	JTextField fontEnter;
	JButton fontButt;
	JScrollPane scroll;

	public Text_editor() {
		frame = new JFrame("Textreme");
		frame.setLayout(new BorderLayout());
		frame.setBounds(0, 0, 735, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textArea = new JTextPane();
		textArea.setCursor(new Cursor(0));
		textArea.setCaretColor(Color.WHITE);
		textArea.getCaret().setBlinkRate(500);
		textArea.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		scroll = new JScrollPane(textArea);
		frame.getContentPane().add(scroll, BorderLayout.CENTER);
	}
}
