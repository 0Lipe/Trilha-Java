import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class UsuarioService {
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void adicionarUsuario(Usuario usuario) {

        if (usuario == null || usuario.getNome() == null || usuario.getEmail() == null) {
            throw new IllegalArgumentException("Dados do usuário inválidos");
        }
        if (usuarios.stream().anyMatch(u -> u.getEmail().equals(usuario.getEmail()))) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        usuarios.add(usuario);
    }
    public static Usuario buscarPorNome(String nome) {
        Pattern pattern = Pattern.compile(nome, Pattern.CASE_INSENSITIVE);
        for (Usuario usuario : usuarios) {
            Matcher matcher = pattern.matcher(usuario.getNome());
            if (matcher.find()) {
                return usuario;
            }
        }
        return null;
    }

    public static Usuario buscarPorEmail(String email) {
        Pattern pattern = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
        for (Usuario usuario : usuarios) {
            Matcher matcher = pattern.matcher(usuario.getEmail());
            if (matcher.find()) {
                return usuario;
            }
        }
        return null;
    }
}