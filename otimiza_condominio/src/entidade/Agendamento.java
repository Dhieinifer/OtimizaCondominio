package entidade;

public class Agendamento {
	private String data2;
	private int horario;
	private Churrasqueira churras;
	private Salao_de_festas salao;
	
	public Agendamento(String data2, int horario, Churrasqueira  churras) {
		this.data2 = data2;
		this.horario = horario;
		this.churras = churras;
	}
	public Agendamento(String data2, int horario, Salao_de_festas sala) {
		this.data2 = data2;
		this.horario = horario;
		this.salao = sala;
	}
	public Agendamento() {
		
	}

	public String getData() {
		return data2;
	}

	public void setData(String data2) {
		this.data2 = data2;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public int ConsultaChurrasqueira() {
		return churras.getCod_churrasqueira();
	}
	public int nextInt() {
		
		return 0;
	}
	
}
