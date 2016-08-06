package System;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = System.getProperty("user.name");
        System.out.println(a);
        System.getProperties().list(System.out);
        for (int x = 0; x < 5; x++) {
            process();
            Thread.sleep(1000);
            System.out.print("cls");
        }
    }

    /**
     * hola ladfo
     * @throws Exception sdfdsf
     */
    public static void process()
            throws Exception {
        Process pro = Runtime.getRuntime().exec("cmd.exe /c tasklist");//("cmd.exe /c tasklist");
        InputStream is = pro.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String aux;
        while ((aux = br.readLine()) != null) {
            System.out.println(aux);
        }
    }
}
