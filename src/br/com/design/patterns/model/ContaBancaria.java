package br.com.design.patterns.model;

import br.com.design.patterns.investimentos.Investimento;

public class ContaBancaria {
	
	private double saldo;
	private double investido;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
		this.setInvestido(0.0);
	}
	
	public void investir(double valor, Investimento investimento) {
		if(valor > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para essa operação.");
		}
		
		this.saldo -= valor;
		this.setInvestido(this.getInvestido() + valor);
		
		double lucro = investimento.investir(valor);
		this.saldo += lucro;
		
		System.out.println(String.format("LUCRO DE %s REAIS", lucro));
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInvestido() {
		return investido;
	}

	public void setInvestido(double investido) {
		this.investido = investido;
	}

}