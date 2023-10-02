public class Cliente extends Usuario {
    private int idCliente;

    public Cliente(String cpf, String nome, String senha, String email, int idCliente) {
        super(cpf, nome, senha, email);
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + "]"+ super.toString();
    }

}
