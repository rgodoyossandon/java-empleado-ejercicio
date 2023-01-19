package empleado;


public class Main 
{
    public static void main( String[] args )
    {
     
        Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0] = new Empleado("Rodrigo","Godoy",40,"Desarrollado",950000.00);
        misEmpleados[1] = new Empleado("Fernando","Herrera",35,"Jefe RRHH",1500000.00);
        misEmpleados[2] = new Empleado("Sergio","Garrido",27,"Administrativo",500000.00);
       
    

    for(Empleado e: misEmpleados){

        System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido() + " Edad: " + e.getEdad() 
                            + " Cargo: " + e.getCargo() + " Sueldo: " + e.getSueldo() );
        }
    }
}
