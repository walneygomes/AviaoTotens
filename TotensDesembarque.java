package Objects;

import java.util.ArrayList;
import java.util.Date;

import Subjects.Voo;

public class TotensDesembarque implements Totens {
	private ArrayList<Voo> baseDados = new ArrayList<Voo>();
	private int numeroDoVoo;
	private String empresa;
	private String horarios;
	private String horarioChegada;
	private String situaçaoPartida;

	public TotensDesembarque() {
		System.out.println("TotensDesembarque");
		System.out.println("");

	}

	public void notificar(int numeroDoVoo, String empresa, String horario, String chegada, String situacao) {
		this.setEmpresa(empresa);
		this.setHorarioChegada(chegada);
		this.setHorarios(chegada);
		this.setSituaçaoPartida(chegada);
		this.setNumeroDoVoo(numeroDoVoo);

	}

	public void notificar() {
		for (int i = 0; i < 3; i++) {
			System.out.println("");
		}
		System.out.println("Desenbarque em");
		System.out.println(this.getHorarioChegada());

		for (int i = 0; i < 3; i++) {
			System.out.println("");
		}

	}

	public void addBaseDados(Voo voo) {
		// TODO Auto-generated method stub
		baseDados.add(voo);
		System.out.println("Novo voo addicionado ");

	}

	public void removerBaseDados(Voo voo) {
		// TODO Auto-generated method stub
		baseDados.remove(voo);
		System.out.println("Um voo removido ");

	}

	public ArrayList<Voo> getBaseDados() {
		return baseDados;
	}

	public void setBaseDados(ArrayList<Voo> baseDados) {
		this.baseDados = baseDados;
	}

	public int getNumeroDoVoo() {
		return numeroDoVoo;
	}

	public void setNumeroDoVoo(int numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
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
