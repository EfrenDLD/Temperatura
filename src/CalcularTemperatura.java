import java.util.Scanner;
public class CalcularTemperatura {
    Scanner scanner = new Scanner(System.in);
    public void calcularPaciente() {

        System.out.println("Ingrese el numero de pacientes : ");
        int numero = scanner.nextInt();

        for (int i=1;i<numero;i++) {
            System.out.println("\n Ingrese el nombre del paciente #" + i + ": ");
            String nombre = scanner.nextLine();

            System.out.println("ingrese la Edad");
            int edad = scanner.nextInt();

            System.out.println("Ingrese la temperatura en Celcius :");
            double temperaturaCelsius = scanner.nextDouble();

            Paciente paciente = new Paciente(nombre, edad, temperaturaCelsius);
            paciente.mostrarTemperaturas();
        }
    }
}

