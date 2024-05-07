import javax.swing.JOptionPane;

public class programa11 {
    public static void soma(int vetor[]) {
        int s = 0;

        for (int i = 0; i < vetor.length; i++) {
            s = s + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria é: " + s);
    }

    public static int product(int vetor[]) {
        int p = 1;

        for (int i = 0; i < vetor.length; i++) {
            p = p * vetor[i];
        }
        return p;
    }

    public static void main (String entrada[]) {
        int r, vet[] = {2, 4, 6, 8, 10};

        soma(vet);
        r = product(vet);
        JOptionPane.showMessageDialog(null, "O produto é: " + r);

        System.exit(0);
    }
}
