package controller;

import java.awt.event.WindowAdapter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import app.MainFrame;
import model.Karton;

public class Close extends WindowAdapter{
	
	@Override
	public void windowClosing(java.awt.event.WindowEvent windowEvent){
		
		int close = JOptionPane.showConfirmDialog(MainFrame.getInstance(), "Da li ste sigurni da zelite da zatvorite?"," ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
	
		if (close != JOptionPane.YES_OPTION)
		{

			MainFrame.getInstance().setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		}
		else
		{

			/*String pathPacijenti = "data/p.txt";

		   try
			{

				FileOutputStream fileOut = new FileOutputStream(pathPacijenti);
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(Karton.getInstance().getListaPacijenata());

				out.close();
				fileOut.close();
				System.out.println("\nSerialization Successful");

			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
*/
			System.exit(0);
		}

	}
}

	