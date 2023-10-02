package domain;

import java.time.LocalDateTime;

public class LembreteMedicamento {
    private CalendarioConsumo calendarioDeConsumo;
    private LocalDateTime horaDataLembrete;
    private String descricao;
    private Boolean estaTerminado = false;

    public CalendarioConsumo getCalendarioDeConsumo() {
        return calendarioDeConsumo;
    }

    public LocalDateTime getHoraLembrete() {
        return horaDataLembrete;
    }

    public String getDescricao() {
        return descricao;
    }

    public LembreteMedicamento(CalendarioConsumo calendarioDeConsumo, LocalDateTime horaLembrete, String descricao) {
        this.calendarioDeConsumo = calendarioDeConsumo;
        this.horaDataLembrete = horaLembrete;
        this.descricao = descricao;
    }

    public void FinalizarLembre(){
        this.estaTerminado = true;
    }
}
