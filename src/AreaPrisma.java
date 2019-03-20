import javax.swing.*;

public class AreaPrisma {

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

    public static double leerValor (String mensaje) {
        String bas;
        double basing;

        do {
            bas = JOptionPane.showInputDialog(null, mensaje);
        } while (!esNumero(bas));
        basing = Double.parseDouble(bas);

        return basing;

    }

    public static void imprimirValor (String mensa, String valor) {

        JOptionPane.showMessageDialog(null,mensa+valor);

    }

    public static boolean esNumero (String nume) {
        boolean resultado = true;
        for (int i=0; i<nume.length(); i++) {
            if (Character.isDigit(nume.charAt(i))==false) {
                resultado = false;
            }
        }
        return resultado;
    }

    public static double alturaTriangulo (double baseTriangulo) {
        double alturatri;
        alturatri = ((Math.sqrt(3) * baseTriangulo)) / 2.0;
        return (float) alturatri;
    }

    public static double areaBase (double baseTriangulo, double alturaTriangulo) {
        return (baseTriangulo * alturaTriangulo) / 2.0;
    }

    public static double perimetro (double baseTriangulo) {
        return 3 * baseTriangulo;
    }

    public static double areaLateral (double perimetro, double alturaPrisma) {
        return perimetro * alturaPrisma;
    }

    public static double areaTotal (double areaBase, double areaLateral) {
        return 2 * areaBase + areaLateral;
    }

}
