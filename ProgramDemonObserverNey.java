package Teste;

import AnotaçoesDoAutor.WalneyNegreirosGomesAnn;
import Objects.Totens;
import Objects.TotensDesembarque;
import Objects.TotensEmbarque;
import Subjects.Voo;
import Subjects.VooAzul;
import Subjects.VooGol;

@WalneyNegreirosGomesAnn

public class ProgramDemonObserverNey {

	public static void main(String[] argumentos) {
		String[] horarios = { "1808", "9:08" };
		// TODO Auto-generated method stub
		// Observers aqueles que vao receber as notificoes
		Totens desen = new TotensDesembarque();
		Totens embarque = new TotensEmbarque();

		// Subjects2 aqueles que vao enviar as notificacoes

		// Subjects1 aqueles que vao enviar as notificacoes
		Voo gol = new VooGol();
		gol.addObservers(desen);
		gol.addObservers(embarque);
		gol.adicionarInformacao(234, "gol", horarios);

		// Notifica-los
		// notificacao resultado
		desen.notificar();
		embarque.notificar();

		Voo azul = new VooAzul();
		String[] horarios1 = { "18:50", "00:00" };
		azul.addObservers(embarque);
		azul.addObservers(desen);
		azul.adicionarInformacao(234, "Azul", horarios1);

		// Notifica-los
		// notificacao resultado
		desen.notificar();
		embarque.notificar();
	}

}
