package br.com.design.patterns.model;

import java.time.LocalDate;

import br.com.design.patterns.enums.Status;

public class Pedido {
	
	private String cliente;
	private double valor;
	private Status status;
	private LocalDate dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga() {
		status = Status.PAGO;
	}
	
	public void finaliza() {
		setDataFinalizacao(LocalDate.now());
		status = Status.ENTREGUE;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(LocalDate dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
