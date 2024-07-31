import java.util.List;

public class itemBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivel;


    public itemBiblioteca(String titulo, String autor, boolean disponivel){
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString(){
        return String.format("Livro: "+ titulo + ", Autor:" + autor + ", Disponivel:" + disponivel);
    }
    public void emprestimo(){
        this.disponivel = false;
    }
}
