package aula14.src;

public class TesteFormas {
    public static void main(String[] args) {
        Circulo c;
        Retangulo r;
        Triangulo t;

        // Circulo com raio negativo
        try {
            c = new Circulo(-5);
            c.imprime();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Numero de lados negativo
        try {
            r = new Retangulo(0, 0);
            r.setLados(-4);
            r.imprime();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println();
        }

        // Numero de lados negativo
        try {
            t = new Triangulo(0, 0);
            t.setLados(-3);
            t.imprime();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Retangulo com base negativa
        try {
            r = new Retangulo(-3, 4);
            r.imprime();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Retangulo com altura negativa
        try {
            r = new Retangulo(10, -2);
            r.imprime();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Triangulo com base negativa
        try {
            t = new Triangulo(-3, 4);
            t.imprime();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        // Triangulo com altura negativa
        try {
            t = new Triangulo(4, -6);
            t.imprime();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        /*
         * Circulo com raio negativo
         * 
         * Numero de lados negativo
         * 
         * Numero de lados negativo
         * 
         * Retangulo com base negativa
         * 
         * Retangulo com altura negativa
         * 
         * Triangulo com base negativa
         * 
         * Triangulo com altura negativa
         */
    }
}