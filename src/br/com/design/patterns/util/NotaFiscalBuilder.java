package br.com.design.patterns.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.design.patterns.model.ItemDaNota;
import br.com.design.patterns.model.NotaFiscal;
import br.com.design.patterns.observer.AcaoAposGerarNotaFiscal;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String comCnpj;
	private double valorBruto;
	private double impostos;
	private String observacao;
	
	private List<AcaoAposGerarNotaFiscal> todasAcoesASeremExecutada;
	
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private LocalDate data;
	
	public NotaFiscalBuilder() {
		this.data = LocalDate.now();
		todasAcoesASeremExecutada = new ArrayList<>();
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.comCnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder comData(LocalDate data) {
		this.data = data;
		return this;
	}
	
	public void adicionaAcao(AcaoAposGerarNotaFiscal acao) {
		this.todasAcoesASeremExecutada.add(acao);
	}
	
	public NotaFiscal controi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, comCnpj, data, valorBruto, impostos, todosItens, observacao);
		
		todasAcoesASeremExecutada.stream().forEach(a-> a.executa(notaFiscal));
		
		return notaFiscal;
	}
}
