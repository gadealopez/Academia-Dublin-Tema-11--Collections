package Teoria.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {

        /*//ARRAYLIST
        ArrayList a=new ArrayList(); //borra y añade datos constantemente
        //NUMERO DE ELEMENTOS
        System.out.println(a.size());
        //AÑADIR
        a.add("A");
        a.add("B");
        a.add("C");
        //MOSTRAR
        System.out.println(a);
        //LEER
        System.out.println(a.get(1)); //a[1];
        //INSERTAR (y desplazar)
        a.add(1,"D");
        System.out.println(a);

        //SUSTITUIR
        a.set(2,"w");
        System.out.println(a);

        //ELIMINAR POR POSICION
        a.remove(2);
        System.out.println(a);

        //ELIMINAR POR OBJETO (equals)
        a.remove("D");
        System.out.println(a);

        //CONTIENE

        System.out.println(a.contains("A"));
        */

        /*

        //ITERRADORES
        ArrayList a=new ArrayList();
        Iterator it=a.iterator();//un iterador no se puede instanciar,se obtiene a partir de un ArrayList existente y se configura en funcion de la cantidad de elementos que tenga
        a.add("A");
        a.add("B");
        a.add("C");
        it=a.iterator();// si modifico la cantidad de elementos del ArrayList tengo que volver a obtener su iterador
        System.out.println(a); //muestra A,B,C
        System.out.println(it.hasNext()); // me devuelve verdadero si el elemento al cual apunta el iterador existe,por eso devuelve true
        System.out.println(it.next());// me devuelve el elemento al cual apunta y avanza al siguiente , devuelve A
        System.out.println(it.next());//devuelve el segundo, B
        it.remove(); //borra el elemento de la posicion anterior, borra la B,que es el ultimo elemento apuntado
        System.out.println(a);
        */

        /*



        //RECOGER ArrayList
        ArrayList a=new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");

        //FOR
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i)); //a[i]


        }

        //ITERADOR
        Iterator it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove() //OPCIONAL
        }
        //FOR EACH
        for (Object x: a) { //para cada elemento x del arraylist a , lo muestro
            System.out.println(x);

        }
        */
/*
        //ARRAYLIST GENERAL (OBJECT)
        ArrayList a=new ArrayList();
        //ArrayList<Object>a=----
        a.add("A");
        a.add(new Alumno("Pepe"));
        a.add(true);
        a.add(new Persona("Luis"));
        if(a.get(3)instanceof Persona){
            Persona p=(Persona)a.get(3);
        }
        Iterator it=a.iterator();
        //Iterator<Object> it---
        Object x=it.next();
        if(x instanceof Persona){
            //Casting
        }
        ejemploGeneral(a);



 */

/*
        //ARRAYLIST GENERICOS (genero)
        ArrayList<Persona>a=new ArrayList<>();
        //= "    " ();
        //="     " <Persona> ();
        //a.add("A"); //no es persona
        a.add(new Alumno("pepe"));
        a.add(new Persona("luis"));
        Persona p=a.get(1);
        if(a.get(0)instanceof Alumno){
            //casting

        }
        Iterator<Persona> it=a.iterator();
        Persona x=it.next();
        ejemploGenerico(a);


 */


        //CASTING ENTRE ARRAYLIST
        Persona p=new Alumno("Pepe"); // en memoria solo se pueden almacenar alumnos
        //Arraylist <Persona> a=new Arraylist<Alumno>();



















    } //FIN MAIN
    //hacer un metodo que reciba un arrylist general y muestre los nombres de todas las personas usando for,iterador y for each
   /* public static void ejemploGeneral(ArrayList a){
        //FOR
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)instanceof Persona){
                System.out.println(((Persona)a.get(i)).nombre);

            }

        }
        //ITERADOR
       Iterator it=a.iterator();
        while(it.hasNext()){
            Object x=it.next();
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }
        //for each
        for(Object x: a){
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }





    }



    public static void ejemploGenerico(ArrayList<Persona> a){
        //FOR
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)instanceof Persona){
                System.out.println(((Persona)a.get(i)).nombre);

            }

        }
        //ITERADOR
        Iterator<Persona> it=a.iterator();

        while(it.hasNext()){
            Persona x=it.next();
            if(x instanceof Persona){
                System.out.println(x.nombre);
            }
        }
        //for each
        for(Persona x: a){
            if(x instanceof Persona){
                System.out.println(x.nombre);
            }
        }





    }


    public static void metodo(ArrayList<? extends Object>a){
        //sirve para trabajar con cualquier arraylist generico de tipo object sin tener que crear un metodo para cada uno

    }
    public static void metodo2(ArrayList<? extends Persona>a) {
    }
    public static <E extends Persona>void  metodo3(ArrayList<E>a){

    }

    */


}
