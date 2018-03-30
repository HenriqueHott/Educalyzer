
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class Competencia {
    private String nome;
    private int idCompetencia;
    ArrayList<Questao>  questoes;

    
    public Competencia(){
    questoes = new ArrayList();
    }
    
    public Competencia(String nome, int idCompetencia) {
        this.nome = nome;
        this.idCompetencia = idCompetencia;
  
    }
  public void addQuestao(Questao q){
  q.setIdCompetencia(this.idCompetencia);
  questoes.add(q);
  }




}
