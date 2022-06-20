package model;

public class EquipamentoDAO extends EntidadeDAO {
	
	private String musculoTrab;
	private String estado;
	
	public EquipamentoDAO(String nome, String musculoTrab, String estado) {
		super(nome);
		setMusculoTrab(musculoTrab);
		setEstado(estado);
	}

	public String getMusculoTrab() {
		return musculoTrab;
	}

	public void setMusculoTrab(String musculoTrab) {
		this.musculoTrab = musculoTrab;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
