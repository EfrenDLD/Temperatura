public class Paciente {
    public String nombre;
    public int edad;
    public double temperaturaCelsius;
    public double temperaturaFahrenheit;

    public Paciente(String nombre,int edad,double temperaturaCelsios){
        this.edad = edad;
        this.nombre = nombre;
        this.temperaturaCelsius=temperaturaCelsios;
        this.temperaturaFahrenheit =Temperatura.convertirC_a_F(temperaturaCelsius);
    }
    public void mostrarTemperaturas(){
        System.out.println("Temperatura de " + nombre + ":");
        System.out.println("  Celsius: " + temperaturaCelsius);
        System.out.println("  Fahrenheit: " + temperaturaFahrenheit);
    }
}
