package domain;

import java.util.Date;

public class FeedbackMedicamento {
    private Receita receita;
    private Date dataFeedback;
    private String comentario;
    private int avaliacao;

    public FeedbackMedicamento(Receita receita, Date dataFeedback, String comentario, int avaliacao) {
        this.receita = receita;
        this.dataFeedback = dataFeedback;
        this.comentario = comentario;
        this.avaliacao = avaliacao;
    }

    public Receita getReceita() {
        return receita;
    }

    public Date getDataFeedback() {
        return dataFeedback;
    }

    public String getComentario() {
        return comentario;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
}
