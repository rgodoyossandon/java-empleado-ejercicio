package empleado;



public class Empleado extends Persona {

    private String cargo;
    private double sueldo;
    
    public Empleado(String nombre, String apellido, int edad, String cargo, double sueldo){

        super(nombre, apellido, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
}
