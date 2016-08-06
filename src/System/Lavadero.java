package System;

/**
 * Created by AldoBalderrama on 7/28/2016.
 */
public class Lavadero extends Thread {
    private String nombre;
    private int tiempo;

    public Lavadero(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public void run() {
        try {
            sleep(tiempo);
        } catch (InterruptedException e) {

        }
        System.out.println("Terminamos " + this.nombre + " Tiempo : " + tiempo);
    }
}
