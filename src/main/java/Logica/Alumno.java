package Logica;

public class Alumno
{

    //Variables
    int id;
    int edad;
    String nombre;
    String apellido;

    //agregamos un constructor vacío
    public Alumno() {

    }

    //Ahora uno con todo
    public Alumno(int id, int edad, String nombre, String apellido)
    {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // ponemos un modificador de acceso
    public void mostrarNombre()
    {
        System.out.println("Hola soy un alumno y sé decir mi nombre pq no tengo down :)");
    }







    // aquí no está vacio, sino le agregamos la variable double y su nombre para saber si el alumno está aprobado ono
    // por cierto, esto es un método
    public void saberCal(double calificacion)
    {
        if(calificacion >= 6 )
        {
            System.out.println("Felicidades estas aprobado");
        }
        else
        {
            System.out.println("Mamaste prrin");
        }
    }
}
