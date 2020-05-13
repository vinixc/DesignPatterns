package br.com.design.patterns.model;

import java.time.LocalDate;

import br.com.design.patterns.enums.TipoContrato;

public class Contrato {
	
	private LocalDate data;
	private String cliente;
	private TipoContrato tipo;
	
	public Contrato(LocalDate data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}
	
	public void avanca() {
		if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
		else if (tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
		else if (tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
	}
	
	public EstadoContrato salvaEstado() {
		return new EstadoContrato(new Contrato(this.data, this.cliente, this.tipo));
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}

}
