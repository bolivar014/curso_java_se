public class SwithStatements {
    public static void main(String[] args) {
        String ColorModeSelected = "Dark";

        switch (ColorModeSelected) {
            case "Light":
                System.out.println("Seleccionaste Ligth Mode");
            break;
            case "Night":
                System.out.println("Seleccionaste Nigth Mode");
            break;
            case "Blue":
                System.out.println("Seleccionaste Blue Mode");
            break;
            default:
                System.out.println("Seleccionaste Default Mode");
            break;
        }
    }
}
