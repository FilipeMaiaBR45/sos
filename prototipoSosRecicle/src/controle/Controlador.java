/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Usuario;
import modelo.Missao;
import modelo.Status;
import visao.FormCadastrar;
import visao.FormCadastrarMissao;


public class Controlador {
    public boolean cadastrar(String email, String nome, String telefone, String descricaoUsuario, String senha, boolean funcao, int nivel, int pontuacao){
        Usuario u = new Usuario();
        
        return u.Salvar();
    }
    public boolean cadastrarMissao(Missao c){
    Missao m = new Missao();
    return m.criarMissao(c);
    }
    public boolean mudarStatus(Status status){
    Status m = new Status();
    return m.ConcluirMissao(status.getIdStatus());
}
    }
