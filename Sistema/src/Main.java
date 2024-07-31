import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();

        System.out.print("Digite a idade do usuário: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        Usuario usuario = new Usuario(id, nome, email, idade);
        UsuarioService.adicionarUsuario(usuario);
        System.out.println(UsuarioService.buscarPorNome("Felipe"));
    }
}