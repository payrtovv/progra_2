import java.util.ArrayList;
import java.util.*;

public class ListaArreglos {
    public static void main(String[] args) {
        //crear arraylist
        List<String> ListaColores = new ArrayList<>();

        // Creacion mediante la clase Array
        String[] nombres = {"Pablo", "Daniel", "Pamela"};
        List<String> ListaNombres = Arrays.asList(nombres);

        //añadir elementos

        ListaColores.add("verde");
        ListaColores.add("Amarillo");

        // Construir lista a partir de otra lista

        List<String> ListaElementos = new ArrayList<>(ListaColores);



        ListaElementos.addAll(ListaNombres);

        //ITERACION DE ELEMENTOS INDIVIDUALES

        ListIterator<String> Iterator1 = ListaColores.listIterator();
        System.out.println("Recorrido con iteratir hacua adeabte");
        while(Iterator1.hasNext()){
            System.out.println("color: " + Iterator1.next());
        }

        System.out.println("Recorrido con iteratir hacua atras");
        while(Iterator1.hasPrevious()){
            System.out.println("color: " + Iterator1.previous());
        }

        System.out.println("Recorrido con iteratir eliminacion dinamica");
        while(Iterator1.hasNext()){
            if (Iterator1.next().equals("Amarillo")){
                Iterator1.remove();
            }
        }

        ListIterator<String> Iterator2 = ListaElementos.listIterator();
        System.out.println("Recorrido con iterator hacia adelante");
        while(Iterator2.hasNext()){
            System.out.println("Elemento: " + Iterator2.next());
        }

        System.out.println("Recorrido con iterator hacia atras");
        while(Iterator2.hasPrevious()){
            System.out.println("Elemento: " + Iterator2.previous());
        }

        System.out.println("Recorrido con iteracion eleminacion dinamica");
        while(Iterator2.hasNext()){
            if (Iterator2.next().equals("Pablo")){
                Iterator2.remove();

            }
        }

        System.out.println("lista colores");
        ListaColores.forEach(System.out::println);

        System.out.println("lista elementos");
        ListaElementos.forEach(System.out::println);

    }
}