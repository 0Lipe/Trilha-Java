//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria( "Felipe", 1 );
        ContaBancaria c2 = new ContaBancaria("Lucas", 2);
        c2.depositar(10);
        c2.transferir(c1, 5);
        c2.sacar(2.50);
        System.out.println(ContaBancaria.getConta());
    }
}