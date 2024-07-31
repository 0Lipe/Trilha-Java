import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;
    private static List<ContaBancaria> todasAsContas = new ArrayList<>();

    ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        todasAsContas.add(this);
    }


    public void depositar(double valor){
        if (valor <= 0 ){
            System.out.println("O valor precisa ser maior do que zero");
        }else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("O valor precisa ser maior que zero");
        }else {
            this.saldo -= valor;
        }

    }

    public double verificarSaldo(){
        return this.saldo;
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if (contaDestino.equals(this)){
            System.out.println("Você não pode transferir para si proprio");
        }else if (valor > this.saldo){
            System.out.println("Você não tem saldo suficiente");
        }else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }
    }
    public static List<ContaBancaria> getConta(){
        return todasAsContas;
    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : todasAsContas ) {
            if (conta.numeroConta == numeroConta) {
                return conta;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return String.format("Conta Bancária [Número: %d, Titular: %s, Saldo: %.2f]", numeroConta, titular, saldo);
    }
}
