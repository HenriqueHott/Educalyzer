/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class Participacao {
     private int idprova,idAluno,idParticipacao;

    public Participacao(int idprova, int idAluno, int idParticipacao) {
        this.idprova = idprova;
        this.idAluno = idAluno;
        this.idParticipacao = idParticipacao;
    }

    public void setIdprova(int idprova) {
        this.idprova = idprova;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public void setIdParticipacao(int idParticipacao) {
        this.idParticipacao = idParticipacao;
    }
            

    public int getIdprova() {
        return idprova;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public int getIdParticipacao() {
        return idParticipacao;
    }
}
