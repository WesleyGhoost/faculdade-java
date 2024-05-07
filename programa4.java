import javax.swing.*;

public class programa4 {
    public static void main (String entrada[]) {
        int n1, n2;
        double div, pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        div = n1 / n2;
        pot = Math.pow(n1, n2);

        msg = "O quociente entre " + n1 + " e " + n2 + " é " + div + "\n";
        msg = msg + "A potencia de " + n1 + " elevado a " + n2 + " é " + pot;
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
