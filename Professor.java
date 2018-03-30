/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class Professor {
    private String nome;
    private int idprofessor;

    public String getNome() {
        return nome;
    }

    public int getIdprofessor() {
        return idprofessor;
    }

    public Professor() {
    }

    public Professor(String nome, int idprofessor) {
        this.nome = nome;
        this.idprofessor = idprofessor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdprofessor(int idprofessor) {
        this.idprofessor = idprofessor;
    }
       
    public void criarQuestao(int idProx,String enunciado,String alternativas,String gabarito,String jusficativa){
        Questao q;
        q = new Questao(idProx,enunciado,gabarito,jusficativa,this.getNome(),alternativas);
    
    }
    
    
    
    
}
