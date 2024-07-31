import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static List<itemBiblioteca> items = new ArrayList<>();

    public static void adicionarItem(itemBiblioteca item) {
        items.add(item);
    }

    public static void removerItem(itemBiblioteca item) {
        items.remove(item);
    }
    public static List<itemBiblioteca> listAll(){
        return items;
    }
    public static itemBiblioteca buscarItem(String titulo) {
        for (itemBiblioteca item : items) {
            if (item.getTitulo().equals(titulo)) {
                if (!item.isDisponivel()){
                    throw new ItemNaoDisponivelException("item não disponivel");
                }
                return item;
            }
        }
        throw new ItemNaoDisponivelException("Item não encontrado");
    }


}
