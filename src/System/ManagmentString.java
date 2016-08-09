package System;

/**
 * Created by AldoBalderrama on 8/8/2016.
 */
public class ManagmentString {
    public static void main(String[] args) {
        String s1 = "Correo: Aldo Balderrama Vaca - Outlook - Google Chrome";
        String s2 = "ERROR StatusLogger No log4j2 configuration file found. Using default configuration: logging only errors to the console. - Buscar con Google - Google Chrome";
        String s3 = "(3) KeepUFocus JAL | Trello - Google Chrome";
        String s4 = "Traductor de Google - Google Chrome";

        String[] array1 = s1.split("-");
        String[] array2 = s2.split("-");
        String[] array3 = s3.split("-");
        String[] array4 = s4.split("-");

        for (String item : array1) {
            System.out.println(item.trim());
        }
        for (String item : array2) {
            System.out.println(item.trim());
        }
        for (String item : array3) {
            System.out.println(item.trim());
        }
        for (String item : array4) {
            System.out.println(item.trim());
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(array1[array1.length - 2]);
        System.out.println(array2[array2.length - 2]);
        System.out.println(array3[array3.length - 2]);
        System.out.println(array4[array4.length - 2]);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(array3.length);
        String title = array3[array3.length - 2];
        System.out.println(title);
        if(title.contains("|")){
            String[] vTitle = title.split(" ");
            System.out.println(vTitle[vTitle.length -1]);
        }
    }
}