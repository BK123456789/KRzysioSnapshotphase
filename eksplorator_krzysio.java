package eksplorator_krzysio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import eksplorator_krzysio.eksplorator_krzysio;

public class eksplorator_krzysio extends JFrame implements ActionListener
{
	JButton uruchom;
	
	public eksplorator_krzysio()
	{
		setSize(650,520);
		setTitle("Eksplorator Krzysio");
		uruchom = new JButton("Uruchom eksplorator Krzysio");
        add(uruchom);
        uruchom.addActionListener(this);
		
	}
	
	public static void main (String[] args)
	{
		eksplorator_krzysio okienko = new eksplorator_krzysio();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) 
    {
        Object zrodlo = e.getSource();
        if (zrodlo==uruchom)
        {
                JFileChooser fc = new JFileChooser();
                       if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
                       {
                               File plik = fc.getSelectedFile();
                               JOptionPane.showMessageDialog(null, "Nazwa pliku: " + plik.getName() + "\n" + "Informacje: " + "\n" + "Rodzic: " + plik.getParent() + "\n" + "Ścieżka dostępu: " + plik.getAbsolutePath() + "\n" + "Można Wywołać?: " + plik.canExecute()+ "\n" + "Można Odczytać?: " + plik.canRead() + "\n" + "Można Edytować?: " + plik.canWrite() + "\n" + "Jest Absolutny?: " +plik.isAbsolute()+ "\n" + "Jest Ukryty?: " + plik.isHidden());
                       }
        }
        
      
}

}