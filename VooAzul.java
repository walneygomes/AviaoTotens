package Subjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Objects.Totens;

public class VooAzul implements Voo {
	private static final int TEMPO_VIAJEM = 420; // HORAS
	private static final int NUMERO = 9;
	private static final int QNT_VIAJEM = 9;

	private int numeroDoVoo;
	private String empresa;
	private String horarios;
	private String horarioChegada;
	private String situaçaoPartida;
	private ArrayList<Totens> notificar;
	static int pos;

	public VooAzul() {
		System.out.println("============AZUL====================");
		System.err.println(" Horario atual "+horaAtualAmbiente());

		this.notificar = new ArrayList<Totens>();
	}

	public void adicionarInformacao(int numeroDoVoo, String empresa, String[] horarios) {
		this.setNumeroDoVoo(numeroDoVoo);
		this.setEmpresa(empresa);
		this.setHorarios(this.proximoHorario(horarios));
		this.situacao();
		this.setHorarioChegada(calcularInstanteDeRota(proximoHorario(horarios)));
		notifica();

	}

	public void notifica() {
		for (Totens t : notificar) {
			t.notificar(this.getNumeroDoVoo(), this.getEmpresa(), this.getHorarios(), this.getHorarioChegada(),
					this.getSituaçaoPartida());
		}

	}

	public void addObservers(Totens totens) {
		totens.addBaseDados(this);

		notificar.add(totens);

	}

	public void removerObservers(Totens totens) {
		// TODO Auto-generated method stub
		totens.removerBaseDados(this);
		notificar.remove(totens);

	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public boolean situacao() {
		boolean situacao = false;
		if ((horaAtualAmbiente().equals(this.getHorarios()))) {
			this.setSituaçaoPartida("Parado");

		} else {
			this.setSituaçaoPartida("Delocando");

		}
		return situacao;

	}

	public String calcularInstanteDeRota(String horario) {
		SimpleDateFormat sdfConvert = new SimpleDateFormat("HH:mm");
		Date hora = null;
		Date x = new Date();

		try {
			hora = sdfConvert.parse(horario);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(hora);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		gc.add(Calendar.MINUTE, 2 * +TEMPO_VIAJEM);
		if ((sdf.format(gc.getTime())).equals("10:34")) {
			System.out.print("Aqui");
		}
		return sdf.format(gc.getTime());
	}

	private String horaAtualAmbiente() {
		GregorianCalendar calendar = new GregorianCalendar();
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minutos = calendar.get(Calendar.MINUTE);
		String horaAtual = tratadorHoraAtual(hora, minutos);

		return horaAtual;
	}

	private String tratadorHoraAtual(int hora, int minutos) {
		String horaAtual = hora + ":" + minutos;
		if (minutos < NUMERO) {
			horaAtual = hora+ ":"  + "0" + minutos;

		}

		return horaAtual;
	}

	public String proximoHorario(String[] horarios) {
		String horarioss = horarios[pos];

		if (!(pos == horarios.length - 1)) {
			horarioss = horarios[pos];
			pos++;
		}

		return horarioss;

	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroDoVoo() {
		return numeroDoVoo;
	}

	public void setNumeroDoVoo(int numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}

	public ArrayList<Totens> getNotificar() {
		return notificar;
	}

	public void setNotificar(ArrayList<Totens> notificar) {
		this.notificar = notificar;
	}

	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public String getSituaçaoPartida() {
		return situaçaoPartida;
	}

	public void setSituaçaoPartida(String situaçaoPartida) {
		this.situaçaoPartida = situaçaoPartida;
	}
}