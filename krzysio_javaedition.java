package krzysio_javaedition;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import krzysio_javaedition.krzysio_javaedition;

public class krzysio_javaedition extends JFrame implements ActionListener
{
	public krzysio_javaedition()

	{
		setSize(1280,700);
		setTitle("Krzysio");
		JButton eksplorator_krzysio = new JButton("Eksplorator Krzysio");
		add(eksplorator_krzysio);
		eksplorator_krzysio.addActionListener(this);
	}
	public static void main (String[] args)
	{
		krzysio_javaedition okienko = new krzysio_javaedition();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
		
		
	}
    public void actionPerformed(ActionEvent e)
    {
            Object zrodlo = e.getSource();
            if(zrodlo==eksplorator_krzysio)

    }         
}

