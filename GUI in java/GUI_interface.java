import javax.swing.JOptionPane ;

public class GUI_interface {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
		JOptionPane.showMessageDialog(null, "You are "+age+" year old ");
	}
}