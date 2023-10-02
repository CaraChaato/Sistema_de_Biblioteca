import java.sql.*;

public class Livro {
    private int idLivro;
    private String titulo;
    private String genero;
    private String autor;
    private Date dataPublicacao;
    private String edicao;
    private String editora;
    private String isbn;
    private boolean livroAcervo;
    private boolean livroDisponivel;

    public Livro(int idLivro, String titulo, String genero, String autor, Date dataPublicacao, String edicao,
            String editora, String isbn, boolean livroAcervo, boolean livroDisponivel) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
        this.livroAcervo = livroAcervo;
        this.livroDisponivel = livroDisponivel;
    }

    @Override
    public String toString() {
        return "Livro [idLivro=" + idLivro + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor
                + ", dataPublicacao=" + dataPublicacao + ", edicao=" + edicao + ", editora=" + editora + ", isbn="
                + isbn + ", livroAcervo=" + livroAcervo + ", livroDisponivel=" + livroDisponivel + "]";
    }

    
}
