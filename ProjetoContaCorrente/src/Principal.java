import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        
        int op = 0;
        
        String msg = "1- Cadastrar correntista"
                    + "\n2- Exibir correntista"
                    + "\n3- Consultar saldo"
                    + "\n4- Depositar"
                    + "\n5- Sacar"
                    + "\n0- Sair";
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch(op){
                case 1:
                    String nm = JOptionPane.showInputDialog("Nome do cliente: ");
                    String banco = JOptionPane.showInputDialog("Banco: ");
                    int ag = Integer.parseInt(JOptionPane.showInputDialog("Agência: "));
                    int numconta = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));
                    cc.Cadastrar(nm, banco, ag, numconta);
                    break;
                case 2:
                    cc.Exibir();
                    break;
                case 3:
                    cc.ConsultarSaldo();
                    break;
                case 4:
                    double vl = Double.parseDouble(JOptionPane.showInputDialog("Valor a depositar: "));
                    cc.Depositar(vl);
                    break;
                case 5:
                    double val = Double.parseDouble(JOptionPane.showInputDialog("Valor a sacar: "));
                    cc.Sacar(val);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
            
        }while(op!=0);
    }
    
}
