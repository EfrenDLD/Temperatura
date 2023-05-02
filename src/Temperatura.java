public class Temperatura {
    public static double convertirF_a_C(double fahrenheit){
        return (fahrenheit-32) * 5 / 9;//Formula para convertir grados Fahrenheit a Celsius
    }
    public static double convertirC_a_F(double celsius){
        return (celsius * 9 / 5) + 32;//Formula para convertir grados Celsius a  Fahrenheit
    }
}
