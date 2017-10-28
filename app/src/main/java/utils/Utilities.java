package utils;

/**
 * Created by a7med on 28/10/2017.
 */

public class Utilities {

    public static String getAdressFormat(String adress) {
        String tab[] = adress.split(",");
        return (tab[0] + " "+getPostCode(tab[2])+tab[1]);
    }

    public static String getPostCode(String adress) {
        String tab[] = adress.split(" ");
        return (tab[tab.length - 1]);
    }
}
