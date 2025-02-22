package desafio_DIO_login.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column (unique = true, nullable = false)
    private String nome;

    private String senha;

    public Login(){

    }

    public Login(Long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
