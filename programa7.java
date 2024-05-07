import javax.swing.JOptionPane;

public class programa7 {
    public static void main (String entrada[]) {
        int num1, num2, soma = 0;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para adicao\nDigite 2 para somatoria\n";

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr).charAt(0));

        switch (op) {
            case '1':
                if (num1 % 2 == 0 && num2 % 2 == 0) {
                    soma = num1 + num2;
                    msg = msg + "Soma de " + num1 + " + " + num2 + " = " + soma + "\n\n";
                }
                break;

            case '2': 
                for (int i = 1; i <= num2; i = i + 1) {
                    soma = soma + num1;
                }
                msg = msg + "Somatoria de " + num1 + ", " + num2 + " vezes é: " + soma + "\n\n";
                break;

            default:
                JOptionPane.showMessageDialog(null, 
                "Opcao invalida, calculos não realizados");    
        }

        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
