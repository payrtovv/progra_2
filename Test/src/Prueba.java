public class Prueba {
    public static void main(String[] args) {
        Auto bmx = new Auto();
        bmx.marca = "BMW";
        bmx.modelo = "1537";
        bmx.color = "Blanco";
        bmx.cilindraje = 3.2;

        bmx.verDetalle();

        System.out.println("--------------------------------------");

        Auto mb = new Auto();

        mb.marca = "MB";
        mb.modelo = "911";
        mb.color = "Rojo";
        mb.cilindraje = 3.4;

        mb.verDetalle();

        System.out.println("------------------------------------------");

        Bicicleta bicicleta = new Bicicleta();

        bicicleta.color = "Amarillo como el sol";

        bicicleta.detalles();

        System.out.println("------------------------------------------");


        //System.out.println(bicicleta.detallesbici());

        Auto bmw = new Auto();
        bmw.marca = "BMW";
        bmw.modelo = "1537";
        bmw.color = "Negro";
        bmw.cilindraje = 1234;

        System.out.println("bmw.verdetalle = \n" + bmw.verDetalle());

        System.out.println("bmw.acelerar = " + bmw.acelerar());
        System.out.println("bmw.fremar = " + bmw.frenar(80));
        System.out.println("bmw.capavodadTamque = " + bmw.capacidadTanque(40, 0.7f));
        System.out.println("bmw:capacidadtanque = " + bmw.capacidadTanque(40, 90f) );
    }


}
