import javax.swing.*;

/**
 * Clase AreaPrisma
 *
 * Calcula el area de prisma de base triangular
 *
 */

public class AreaPrisma {

    /**
     * Metodo principal cre ejecuta el programa.
     * @param args
     */

    public static void main (String [] args) {
        String aTotal;
        String mess ="Base";
        double basing = leerValor(mess);
        mess = "Altura";
        double altup = leerValor(mess);
        double htri = alturaTriangulo(basing);
        double areabas = areaBase(basing, htri);
        double peri = perimetro(basing);
        double arlate = areaLateral(peri, altup);
        double areaTot = areaTotal(areabas, arlate);
        aTotal = ""+ areaTot;
        mess = "El area es ";
        imprimirValor(mess, aTotal);

    }

    /**
     * Metodo que lee un double
     * @param mensaje  a mostrar
     * @return el valor introducido
     */

    public static double leerValor (String mensaje) {
        String bas;
        double basing;

        do {
            bas = JOptionPane.showInputDialog(null, mensaje);
        } while (!esNumero(bas));
        basing = Double.parseDouble(bas);

        return basing;

    }

    /**
     * Imprime un valor
     * @param mensa mensaje mostrar
     * @param valor a mostrar
     */

    public static void imprimirValor (String mensa, String valor) {

        JOptionPane.showMessageDialog(null,mensa+valor);

    }

    /**
     * Metodo que comprueba que si el valor introducido es un numero
     * @param nume valor introducido
     * @return verdadero si es un numero y falso en caso contrario.
     */

    public static boolean esNumero (String nume) {
        boolean resultado = true;
        for (int i=0; i<nume.length(); i++) {
            if (Character.isDigit(nume.charAt(i))==false) {
                resultado = false;
            }
        }
        return resultado;
    }

    /**
     * Método que calcula la altura de la base triangular
     * @param baseTriangulo la base del triango
     * @return la altura del triangulo
     */

    public static double alturaTriangulo (double baseTriangulo) {
        double alturatri;
        alturatri = ((Math.sqrt(3) * baseTriangulo)) / 2.0;
        return (float) alturatri;
    }

    /**
     * Calcula el area de la base del prisma
     * @param baseTriangulo
     * @param alturaTriangulo
     * @return el area
     */

    public static double areaBase (double baseTriangulo, double alturaTriangulo) {
        return (baseTriangulo * alturaTriangulo) / 2.0;
    }

    /**
     * Calcula el perimetro
     * @param baseTriangulo
     * @return el perimetro
     */

    public static double perimetro (double baseTriangulo) {
        return 3 * baseTriangulo;
    }

    /**
     * Calcula el area lateral del prisma
     * @param perimetro
     * @param alturaPrisma
     * @return area lateral del prisma
     */

    public static double areaLateral (double perimetro, double alturaPrisma) {
        return perimetro * alturaPrisma;
    }

    /**
     * Calcula el area del prisma
     * @param areaBase
     * @param areaLateral
     * @return el area del Prisma
     */

    public static double areaTotal (double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }

}
