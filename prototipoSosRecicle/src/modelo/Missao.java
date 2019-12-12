

package modelo;

import java.util.Date;





public class Missao {
    private int idMissao;
    private Date prazo;
    private int pontosMissao;
    private String objetivo;
    private String nome;
    private String emailUsuario;
    private int idTipoMissao;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdMissao() {
        return idMissao;
    }

    public void setIdMissao(int idMissao) {
        this.idMissao = idMissao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public int getPontosMissao() {
        return pontosMissao;
    }

    public void setPontosMissao(int valor) {
        this.pontosMissao = valor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailUsuarios() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public int getIdTipoMissao() {
        return idTipoMissao;
    }

    public void setIdTipoMissao(int idTipoMissao) {
        this.idTipoMissao = idTipoMissao;
    }

   public boolean criarMissao(Missao c){
   return true;
   }
   
    
            }