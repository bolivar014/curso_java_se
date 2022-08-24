public class incrementDecrement {
    public static void main(String[] args) {
        int lives = 5;

        lives = lives - 1;
        System.out.println(lives); // 4

        lives--; // Drecremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives); // 4

        // Prefija
        // Gana un regalo, por ganar vidas
        int gift = 100 + lives++; // PostFijo
        System.out.println(gift);
    }
}
