public class Auto {
    public String marca;
    public String modelo;
    public String color = "Negro";
    public double cilindraje;
    public float consumo = 40;

    /*public void detalle(){
        System.out.println("La marca del auto es: "+ this.marca);
        System.out.println("auto.modelo = "+ this.modelo);
        System.out.println("auto.color = "+ this.color);
        System.out.println("auto.cilindraje = "+ this.cilindraje);
    }*/

    public String verDetalle(){
        String dv = "la marca es =" + this.marca + "\n" +
        "el modelo es = " + this.modelo + "\n" +
        "El color es = " + this.color+ "\n" +
        "El cilindraje es " + this.cilindraje;
        return dv;
    }

    public String acelerar(){
        return "el auto marca = " + this.marca + "\tEsta acelerando";
    }

    public String frenar(int kmph){
        return "El auto modelo = " + this.modelo + "\tEsta frenando a " + kmph;
    }

    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo /(cap * consumo);
        return cm;


    }

    public float capacidadTanque(int cap, int porConsumo) {
        float cm = (cap * (porConsumo / 100));
        return cm;
    }
}
