package br.com.design.patterns.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.design.patterns.model.ItemDaNota;
import br.com.design.patterns.model.NotaFiscal;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String comCnpj;
	private double valorBruto;
	private double impostos;
	private String observacao;
	
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private LocalDate data;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.comCnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder comData() {
		this.data = LocalDate.now();
		return this;
	}
	
	public NotaFiscal controi() {
		return new NotaFiscal(razaoSocial, comCnpj, data, valorBruto, impostos, todosItens, observacao);
	}

}
