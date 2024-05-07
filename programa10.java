import javax.swing.*;

public class programa10 {
    public static void soma() {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        JOptionPane.showMessageDialog(null, "A soma é: " + (n1 + n2));
    }

    public static void sub(int x, int y) {
        int s;
        s = x - y;

        JOptionPane.showMessageDialog(null, "A diferença é: " + s);
    }

    public static int product() {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        return(n1 * n2);
    }

    public static double division(int x, int y) {
        double d;
        d = (double)x / (double)y;
        return d;
    }

    public static void main (String entrada[]) {
        int n1, n2, s;
        double r;

        soma();
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        sub(n1, n2);
        s = product();
        JOptionPane.showMessageDialog(null, "O produto é: " + s);
        r = division(n1, n2);
        JOptionPane.showMessageDialog(null, "A divisão é: " + r);

        System.exit(0);
    }
}
