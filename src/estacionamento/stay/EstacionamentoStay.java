package estacionamento.stay;

import java.time.LocalTime;

public class EstacionamentoStay {

	private LocalTime inicioHora;
	private LocalTime finalHora;
	
	
	public LocalTime getInicioHora() {
		return inicioHora;
	}
	public void setInicioHora(LocalTime inicioHora) {
		this.inicioHora = inicioHora;
	}
	public LocalTime getFinalHora() {
		return finalHora;
	}
	public void setFinalHora(LocalTime finalHora) {
		this.finalHora = finalHora;
	}
	
	
	
}
