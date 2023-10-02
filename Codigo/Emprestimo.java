public class Emprestimo {
    private String cpf;
    private int idLivro;
    private String dataEmprestimo;
    private String dataPrevista;
    private String dataDevolucao;
    

    public Emprestimo(String cpf, int idLivro, String dataEmprestimo, String dataPrevista, String dataDevolucao) {
        this.cpf = cpf;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo [cpf=" + cpf + ", idLivro=" + idLivro + ", dataEmprestimo=" + dataEmprestimo
                + ", dataPrevista=" + dataPrevista + ", dataDevolucao=" + dataDevolucao + "]";
    }

    
}
