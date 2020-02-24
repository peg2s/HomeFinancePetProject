package main.gui.toolbar;

import main.gui.MainButton;
import main.gui.Refresh;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

abstract public class AbstractToolBar extends JPanel implements Refresh {

    // private final Handler handler;

    public AbstractToolBar() {
        //super();
        //setBorder(border);
    }

    abstract protected void init();

    protected MainButton addButton(String title, ImageIcon icon, String action, boolean topIcon) {
        MainButton button = new MainButton(title, icon, null, action);
        if (topIcon) {
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
        }
        else {
            button.setHorizontalTextPosition(SwingConstants.RIGHT);
            button.setVerticalTextPosition(SwingConstants.CENTER);
        }
        add(button);
        return button;
    }

    @Override
    public void refresh() {
        removeAll();
        init();
    }

}

