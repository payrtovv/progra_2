public class Bicicleta {
    String color = "Rojo";
    String llantas = "BMX";
    int horas = 2;
    String frenos = "Tambor";

    public void detalles(){
        System.out.println("Color: "+ this.color);
        System.out.println("LLantas: "+ this.llantas);
        System.out.println("Horas: "+ this.horas);
        System.out.println("Frenos: "+ this.frenos);
    }

    public String detallesbici(){
        StringBuilder bicicleta = new StringBuilder();
        bicicleta.append("Color: "+ this.color+" ");
        bicicleta.append("LLantas: "+ this.llantas+" ");
        bicicleta.append("Horas: "+ this.horas+" ");
        bicicleta.append("Frenos: "+ this.frenos+" ");
        return bicicleta.toString();
    }
}
