/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class Questao {
    private int idQuestao,idCompetencia;
    private String enunciado,gabarito,justficativa,autor,alternativas;

    public Questao(int idCompetencia, String enunciado, String gabarito, String justficativa, String autor, String alternativas) {
        this.idQuestao = idQuestao;
        this.idCompetencia = idCompetencia;
        this.enunciado = enunciado;
        this.gabarito = gabarito;
        this.justficativa = justficativa;
        this.autor = autor;
        this.alternativas = alternativas;
    }

       //para o professor add questao
        public Questao(String enunciado, String gabarito, String justficativa, String autor, String alternativas) {
        this.idCompetencia = idCompetencia;
        this.enunciado = enunciado;
        this.gabarito = gabarito;
        this.justficativa = justficativa;
        this.autor = autor;
        this.alternativas = alternativas;
    }

    
    
    
    public int getIdQuestao() {
        return idQuestao;
    }

    public int getIdCompetencia() {
        return idCompetencia;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getGabarito() {
        return gabarito;
    }

    public String getJustficativa() {
        return justficativa;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlternativas() {
        return alternativas;
    }

    public void setIdQuestao(int idQuestao) {
        this.idQuestao = idQuestao;
    }

    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public void setJustficativa(String justficativa) {
        this.justficativa = justficativa;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }
    
   
    
}
