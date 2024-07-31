//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Maçã", "Felipe", true);
        Livro l2 = new Livro("Banana", "Felipe", true);
        Biblioteca.adicionarItem(l2);
        Biblioteca.adicionarItem(l1);
        System.out.println(Biblioteca.listAll());
        System.out.println(Biblioteca.buscarItem("Maçã"));

    }
}