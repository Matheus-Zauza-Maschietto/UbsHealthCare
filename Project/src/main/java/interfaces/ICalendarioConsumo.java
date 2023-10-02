package interfaces;

import domain.HistoricoUso;
import domain.LembreteMedicamento;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ICalendarioConsumo {
    List<LembreteMedicamento> filtrarLembretesPorData(LocalDateTime data);
    List<HistoricoUso> filtrarHistoricoUsoPorData(Date data);
}
