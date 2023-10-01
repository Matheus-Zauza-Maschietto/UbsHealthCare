package domain;

import java.time.LocalDateTime;

public class LembreteMedicamento {
    private CalendarioConsumo calendarioDeConsumo;
    private LocalDateTime horaLembrete;
    private String descricao;

    public CalendarioConsumo getCalendarioDeConsumo() {
        return calendarioDeConsumo;
    }

    public LocalDateTime getHoraLembrete() {
        return horaLembrete;
    }

    public String getDescricao() {
        return descricao;
    }

    public LembreteMedicamento(CalendarioConsumo calendarioDeConsumo, LocalDateTime horaLembrete, String descricao) {
        this.calendarioDeConsumo = calendarioDeConsumo;
        this.horaLembrete = horaLembrete;
        this.descricao = descricao;


    }
}
