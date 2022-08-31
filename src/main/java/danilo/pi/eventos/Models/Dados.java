package danilo.pi.eventos.Models;

public class Dados {

	private String nome;
	private String data;
	private String horario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "dados [nome=" + nome + ", data=" + data + ", horario=" + horario + "]";
	}
	
	
}
