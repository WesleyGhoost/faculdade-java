import javax.swing.JOptionPane;

public class programa8 {
    public static void main (String entrada[]) {
        int n1, n2, produto = 1;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para multiplicar\nDigite 2 para produtória";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero positivo"));
        op = (JOptionPane.showInputDialog(msgEntr).charAt(0));

        switch (op) {
            case '1':
                if (n1 > 0 && n2 > 0) {
                    produto = n1 * n2;
                    msg = msg + "O produto de " + n1 + " x " + n2 + " = " + produto;
                }
                break;

            case '2':
                for (int i = 1; i <= n2; i = i + 1) {
                    produto = produto * n1;
                } 
                msg = msg + "A produtória de " + n1 + ", " + n2 + " vezes é: " + produto + "\n\n"; 
                break;  
        
            default:
                JOptionPane.showMessageDialog(null, 
                "Opcao invalida, calculos não realizados");
                break;
        }

        if (op >= '1' || op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
