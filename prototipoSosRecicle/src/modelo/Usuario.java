
package modelo;

public class Usuario {
    private String email;
    private String nome;
    private String telefone;
    private String descricaoUsuario;
    private String senha;
    private boolean funcao;
    private int nivel;
    private int pontuacao;
    private int qtdNegociacoes;

   
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricaoUsuario;
    }

    public void setDescricao(String descricao) {
        this.descricaoUsuario = descricao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getFuncao() {
        return funcao;
    }

    public void setFuncao(boolean funcao) {
        this.funcao = funcao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getQtdNegociacoes() {
        return qtdNegociacoes;
    }

    public void setQtdNegociacoes(int qtdNegociacoes) {
        this.qtdNegociacoes = qtdNegociacoes;
    }
    
    public boolean Salvar(){
     return true;   
    }
}

