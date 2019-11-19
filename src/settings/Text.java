package settings;

import java.util.HashMap;

final public class Text {
    private  static HashMap <String, String> data = new HashMap<>();
    public static String get(String key) {
        return data.get(key);
    }

    public static String[] getMonth(){
        String[] month = new String[12];
        month[0] = get("JANUARY");
        month[1] = get("FEBRUARY");
        month[2] = get("MARCH");
        month[3] = get("APRIL");
        month[4] = get("MAY");
        month[5] = get("JUNE");
        month[6] = get("JULY");
        month[7] = get("AUGUST");
        month[8] = get("SEPTEMBER");
        month[9] = get("OCTOBER");
        month[10] = get("NOVEMBER");
        month[11] = get("DECEMBER");
        return month;
    }

    public static final void init() {
        data.put("PROGRAMM_NAME","Home Finance 1.0");
        data.put("MENU_VIEW","Вид");
        data.put("MENU_SETINGS","Настройки");
        data.put("MENU_FILE","Файл");
        data.put("MENU_HELP","Помощь");
        data.put("JANUARY","январь");
        data.put("FEBRUARY","февраль");
        data.put("MARCH","март");
        data.put("APRIL","апрель");
        data.put("MAY","май");
        data.put("JUNE","июнь");
        data.put("JULY","июль");
        data.put("AUGUST","август");
        data.put("SEPTEMBER","сентябрь");
        data.put("OCTOBER","октябрь");
        data.put("NOVEMBER","ноябрь");
        data.put("DECEMBER","декабрь");

    }


}

