package System;

/**
 * Created by AldoBalderrama on 7/28/2016.
 */
public class HiloMain {
    public static void main(String[] args) {
        Lavadero l1, l2, l3;
        l1 = new Lavadero("compacto", 10 * 1000);
        l2 = new Lavadero("camion", 20 * 1000);
        l3 = new Lavadero("mediano", 5 * 1000);

        l1.start();
        l2.start();
        l3.start();

    }
}
