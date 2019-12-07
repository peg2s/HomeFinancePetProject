package main;

import settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;

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
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("/17498.ttf")));
    }

}
