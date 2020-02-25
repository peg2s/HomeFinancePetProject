package main.gui.dialog;


import javax.swing.JOptionPane;
import main.gui.MainFrame;
import settings.Text;


public class ErrorDialog {

    public static void show(MainFrame frame, String text) {
        JOptionPane.showMessageDialog(frame, Text.get(text), Text.get("ERROR"), JOptionPane.ERROR_MESSAGE);
    }

}
