import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMonedas consulta = new ConsultaMonedas();

        while (true) {
            System.out.println("***Bienvenido al conversor de monedas de Java ***" +
                    "\nElija una opción de conversión:" +
                    "\n1- USD A PESO CHILENO" +
                    "\n2- PESO CHILENO A USD" +
                    "\n3- EURO A PESO CHILENO" +
                    "\n4- PESO CHILENO A EURO" +
                    "\n5- PESO COLOMBIANO A PESO CHILENO" +
                    "\n6- PESO CHILENO A PESO COLOMBIANO" +
                    "\n7- SALIR");

            int opcionUsuario = lectura.nextInt();

            switch (opcionUsuario) {
                case 1:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("USD", "CLP");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("CLP", "USD");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("EUR", "CLP");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("CLP", "EUR");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("COP", "CLP");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.println("Ingrese el monto a convertir:");
                        double monto = lectura.nextDouble();
                        Conversion conversion = consulta.buscarConversion("CLP", "COP");
                        System.out.println("=============================================================");
                        System.out.println(monto + " " + conversion.base_code() + " equivalen a " + (conversion.conversion_rate() * monto) + " " + conversion.target_code());
                        System.out.println("=============================================================");
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al obtener la tasa de conversión: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Finalizando sistema");
                    return;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
