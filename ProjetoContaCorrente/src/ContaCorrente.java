import javax.swing.JOptionPane;


public class ContaCorrente {
    public String nome_cliente;
    public String banco;
    public int agencia;
    public int num_conta;
    public double saldo;
    
    public void Cadastrar(String nm, String bc, int ag, int conta){
        
        this.nome_cliente=nm;
        this.banco=bc;
        this.agencia=ag;
        this.num_conta=conta;
        
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "Nome do cliente: " + this.nome_cliente +
                                      "\nBanco: " + this.banco + "\nAgência: " + this.agencia +
                                      "\nNumero da conta: " + this.num_conta);
    }
    
    public void ConsultarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo da conta: " + this.saldo);
    }
    
    public void Depositar(double valor){
        this.saldo += valor;
    }
    
    public void Sacar(double valor){
        this.saldo -= valor;
    }
    
}
