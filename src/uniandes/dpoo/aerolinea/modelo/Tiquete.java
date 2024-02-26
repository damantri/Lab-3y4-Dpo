package uniandes.dpoo.aerolinea.modelo;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Cliente clienteComprado;
	private Vuelo vuelo;
	
	public Tiquete (String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.clienteComprado = clienteComprado;
		this.tarifa = tarifa;
	}
	public Cliente getCliente() {
		return false;
	}
	public Vuelo getVuelo() {
		return Vuelo;
	}
	public String getCodigo() {
		return null;
	}
	public int getTarifa() {
		return 1;
	}
	public void marcarComoUsado() {
		return ;
	}
	public boolean esUsado() {
		return true;
	}
}
