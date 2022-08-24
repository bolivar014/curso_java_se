public class Funciones {
    public static void main(String[] args) {
        double y = 6;
        // Llamamos función circleArea e imprimimos resultado
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolume(y));
        System.out.println(convertToDolar(200, "MXN"));
    }

    // Función para calcular el circulo de un area
    public static double circleArea(double y) {
        return (Math.PI * Math.pow(y, 2));
    }

    public static double sphereArea(double y) {
        return (4 * Math.PI * Math.pow(y, 2));
    }

    public static double sphereVolume(double y) {
        return ((4 / 3) * Math.PI * Math.pow(y, 2));
    }

    /**
     * Descripción: función que especificando su moneda, convierte una cantidad de dinero a USD
     * @param quantity: TOTAL DINERO
     * @param currency: TIPO DE MONEDA
     * @return retorna la conversión
     */
    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
            break;
            case "COP":
                quantity = quantity * 0.00031;
            break;
        }
        // Retornamos
        return quantity;
    }
}
