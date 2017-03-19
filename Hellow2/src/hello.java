import java.awt.*;
import java.awt.event.*;
/*
import javax.swing.*;
import javax.swing.event.*;
*/
public class hello {
	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;
	private Label msglabel;
	private String userInput;
	
	// constructor method for "hello" class
	// This is a method to set initial program values for hello
	// When the object "hello" is created, Java calls the constructor first
	public hello(String inputValExample){
		prepareGUI();
		// We can pass an initial value into the constructor for each "hello" object created
		userInput = inputValExample;
	}
	
	public static void main(String[] args){
		hello hellow = new hello("mainin1");
		hellow.showFrameDemo();
		/* experiment trying to make two main frames */
		hello hellow2 = new hello("mainin2");
		hellow2.showFrameDemo();
	}
	
	/* Builds GUI frames */
	private void prepareGUI(){
		mainFrame = new Frame("Java AWT Examples");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});
		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);
		statusLabel = new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);
		
		msglabel = new Label();
		msglabel.setAlignment(Label.CENTER);
		msglabel.setText("Welcome to TutorialsPoint AWT TUT");
		
		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	
	private void showFrameDemo(){
		headerLabel.setText(userInput);
		
		final Frame frame = new Frame();
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.add(msglabel);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				frame.dispose();
			}
		});
		Button okButton = new Button("Open a frame");
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("A Frame shown to the user");
				frame.setVisible(true);
			}
		});
		controlPanel.add(okButton);
		
		mainFrame.setVisible(true);
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi again");
		JPanel p = new JPanel(new BorderLayout());
		System.out.println(p);
	}
	*/
}
