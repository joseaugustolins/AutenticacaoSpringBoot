package joseaugusto;

import javax.validation.constraints.NotBlank;

public class Usuario {

    private Integer id;
    @NotBlank(message="required")
    private String nome;
    @NotBlank(message="required")
    private String senha;

    public Usuario(Integer id, @NotBlank(message = "required") String nome, @NotBlank(message = "required") String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
