package udla.Pvillota.herencia;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        //Persona alumno = new Alumno();



        Alumno alumno = new Alumno();

        alumno.setNombre("Pablo");
        alumno.setApellido("Villota");
        alumno.setCarrera("Ing. software");
        alumno.setCorreo("pablo.villota@udla.edu.ec");
        alumno.setEdad(19);
        alumno.setNotap1(10);
        alumno.setNotap2(10);
        alumno.setNotap3(10);
        System.out.println("Datos del alumno");
        System.out.println("Nombre - Apellido: " + alumno.getNombre() + " " + alumno.getApellido());


        //alumno.nombre

        Profesor profesor = new Profesor();

        AlumnoInt alumnoInt = new AlumnoInt();


    }
}