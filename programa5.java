import javax.swing.*;

public class programa5 {
    public static void main (String entrada[]) {
        int num;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para par/impar\n Digite 2 para positivo/negativo";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr).charAt(0));
        
        switch (op) {
            case '1':
                if (num % 2 == 0) {
                    msg = msg + num + " é par.\n";
                } else {
                    msg = msg + num + " é impar.\n";
                }
                break;

            case '2':
                if (num > 0) {
                    msg = msg + num + " é positivo.\n";
                } else {
                    msg = msg + num + " não é positivo.\n";
                }
                break;
        
            default:
                JOptionPane.showMessageDialog(null, 
                "Opcao invalida, calculos não realizados");
                break;
        }

        if (op == '1' || op == '2') {
            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
