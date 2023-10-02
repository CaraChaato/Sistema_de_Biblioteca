import java.sql.*;
import java.util.ArrayList;


public class Usuario {

    private String cpf;
    private String nome;
    private String senha;
    private String email;
    private ArrayList<Date> telefone;

    public Usuario(){};
    public Usuario(String cpf, String nome, String senha, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Usuario [cpf=" + cpf + ", nome=" + nome + ", senha=" + senha + ", email=" + email + ", telefone="
                + telefone + "]";
    }

    

}
