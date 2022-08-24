public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Bono de 200 pesos
        // salary = salary + 200;
        salary += 200;

        System.out.println("Salario neto: " + salary);

        // Pensión: dsto de $50
        salary -= 50;

        System.out.println("dsto: " + salary);

        // 2 horas extra $30 c/u
        // Comida 45
        salary += ((2 * 30) - 45);

        System.out.println("Salario + Horas extra: " + salary);

        // Actualización de cadenas de texto
        String Employee = "Pepito";
        Employee = Employee + " Perez";

        System.out.println(Employee);
    }
}
