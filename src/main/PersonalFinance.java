package main;

import settings.Settings;
import settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class PersonalFinance {
    public static void main(String[] args) {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    private static void init() throws IOException, FontFormatException {
        Settings.init();

        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT));
    }

}
