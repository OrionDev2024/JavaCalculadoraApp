import java.util.Scanner;

public class CalculadoraApp {
    static double resultado;
    public static  void main(String[] args){
        Scanner consola = new Scanner(System.in);

        while (true) {
            //menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //revisar que este dentro de las opciones disponibles.
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;//fin de ciclo while
                } else {
                    System.out.println("opción erronea.");
                }//fin de else
                System.out.println();
            } //fin de try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }//fin de catch
        }//fin de main
    }//fin de main
    private static void mostrarMenu(){
        System.out.println("**** Aplicación Calculadora ****");
        //Mostramos el menú
        System.out.println("""
                    1. Suma.
                    2. Resta.
                    3. Multiplicación.
                    4. División.
                    5. Salir.
                    """);
        System.out.print("Operación a realizar: ");
    }//fin de funcion mostrarMenu
    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona el valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        switch (operacion) {
            case 1 -> realizarSuma(operando1, operando2);
            case 2 -> realizarResta(operando1, operando2);
            case 3 -> realizarMultiplicacion(operando1, operando2);
            case 4 -> realizarDivision(operando1, operando2);
            default -> System.out.println("Opción erronea: " + operacion);

        }
    }//fin de funcion ejecutarOperacion
    //función para realizar la suma
    private static void realizarSuma(double operando1, double operando2){
        resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: " + resultado);
    }// fin de funcion realizarSuma
    //función para realizar la resta
    private static void realizarResta(double operando1, double operando2){
        resultado = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }//fin de la funcion realizarResta
    //función para realizar la multiplicación
    private static  void realizarMultiplicacion(double operando1, double operando2){
        resultado = operando1 * operando2;
        System.out.println("resultado de multiplicación: " + resultado);
    }//fin de la funcion realizarMultiplicacion
    //función para realizar la división
    private static  void realizarDivision(double operando1, double operando2){
        //Validar que el operando2 no sea 0
        if (operando2 == 0){
            System.out.println("No se puede dividir entre 0");
        }else {
            resultado = operando1 / operando2;
            System.out.println("Resultado de la división: " + resultado);
        }
    }//fin de la funcion realizarDivision

}
