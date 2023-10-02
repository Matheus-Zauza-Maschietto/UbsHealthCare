package domain;

import java.time.LocalDateTime;
import java.util.Date;

public class HistoricoUso {
    private CalendarioConsumo calendarioDeConsumo;
    private Date dataUso;
    private String estadoUso;
    private LocalDateTime horaUso;



    public HistoricoUso(CalendarioConsumo calendarioDeConsumo, Date dataUso, String estadoUso, LocalDateTime horaUso) {
        this.calendarioDeConsumo = calendarioDeConsumo;
        this.dataUso = dataUso;
        this.estadoUso = estadoUso;
        this.horaUso = horaUso;
    }

    public CalendarioConsumo getCalendarioDeConsumo() {
        return calendarioDeConsumo;
    }

    public Date getDataUso() {
        return dataUso;
    }

    public String getEstadoUso() {
        return estadoUso;
    }

    public LocalDateTime getHoraUso() {
        return horaUso;
    }
}
