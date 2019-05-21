package Objects;

import java.util.Date;

import Subjects.Voo;

public interface Totens {
	public void notificar(int numeroDoVoo, String empresa, String horario, String chegada, String situacao);

	public void notificar();
	
	public void addBaseDados(Voo voo);
	public void removerBaseDados(Voo voo);

}
