package domain;

import interfaces.ICalendarioConsumo;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class CalendarioConsumo implements ICalendarioConsumo {
    private Receita receita;
    private Date dataInicio;
    private Date dataFim;
    private LocalDateTime horarioTomar;
    private String observacoes;
    private List<LembreteMedicamento> lembretes;
    private List<HistoricoUso> historico;



    public CalendarioConsumo(Receita receita, Date dataInicio, Date dataFim, LocalDateTime horarioTomar, String observacoes, List<LembreteMedicamento> lembretes, List<HistoricoUso> historico) {
        this.receita = receita;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horarioTomar = horarioTomar;
        this.observacoes = observacoes;
        this.lembretes = lembretes;
        this.historico = historico;
    }

    public Receita getReceita() {
        return receita;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public LocalDateTime getHorarioTomar() {
        return horarioTomar;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public List<LembreteMedicamento> getLembretes() {
        return lembretes;
    }

    public List<HistoricoUso> getHistorico() {
        return historico;
    }

    @Override
    public List<LembreteMedicamento> filtrarLembretesPorData(LocalDateTime data){
        return this.lembretes.stream().filter(p -> p.getHoraLembrete() == data).toList();
    }

    @Override
    public List<HistoricoUso> filtrarHistoricoUsoPorData(Date data){
        return this.historico.stream().filter(p -> p.getDataUso() == data).toList();
    }
}


