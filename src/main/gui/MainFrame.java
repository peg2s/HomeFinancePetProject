package main.gui;

import settings.Style;
import settings.Text;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Refresh{
    private GridBagConstraints constraints;
public MainFrame() {
    super(Text.get("PROGRAMM_NAME"));
    setVisible(true);
    setResizable(false);
    setIconImage(Style.ICON_MAIN.getImage());
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // заменить на закрытие с сохранением, задать вопрос пользователю
    setLayout(new GridBagLayout());

    constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    // добавили тулбар

    constraints.gridy = 1;
    constraints.gridwidth = 1;
    constraints.anchor = GridBagConstraints.NORTH;
    // добавили левую панель



}

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        pack();
    }
}
