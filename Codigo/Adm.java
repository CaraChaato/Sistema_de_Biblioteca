public class Adm extends Usuario {
    private int idAdm;

    public Adm(String cpf, String nome, String senha, String email, int idAdm) {
        super(cpf, nome, senha, email);
        this.idAdm = idAdm;
    }

    @Override
    public String toString() {
        return "Adm [idAdm=" + idAdm + "]" + super.toString();
    }

    
}
