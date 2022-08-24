public class MathematicsOperator {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Libreria Math permite hacer operaciones matematicas más complejas
        // Imprimir valor de PI
        System.out.println(Math.PI);

        // Imprimir valor entero hacía arriba
        System.out.println(Math.ceil(x));

        // Imprimir valor entero hacía abajo
        System.out.println(Math.floor(x));

        // Imprimir valor elevado a otro
        System.out.println(Math.pow(x,y));

        // Imprimir valor mayor
        System.out.println(Math.max(x,y));

        // Imprimir la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Imprimir Area de un circulo
        System.out.println(Math.PI * Math.pow(y, 2));

        // Imprimir Area de una esfera
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Imprimir volumen de una esfera
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
