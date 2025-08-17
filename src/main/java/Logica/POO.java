package Logica;

public class POO
{
    public static void main(String[]args)
    {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2, 15, "Pelusin", "Lacoste");

        //Aquí el get es para traer el resultado
        System.out.println("El id del segundo alumno es "+alu2.getId());
    }

}
