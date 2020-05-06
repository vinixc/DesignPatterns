package br.com.design.patterns.model;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.namespace.QName;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import br.com.design.patterns.investimentos.Investimento;

@XmlElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContaBancaria {
	
	private double saldo;
	private double investido;
	
	private String nome;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
		this.setInvestido(0.0);
	}
	
	public ContaBancaria(double saldo, String nome) {
		this.saldo = saldo;
		this.setInvestido(0.0);
		this.nome = nome;
	}
	
	public void investir(double valor, Investimento investimento) {
		if(valor > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para essa opera��o.");
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
	
	public String toXml(){
		try {
		JAXBContext context = JAXBContext.newInstance(ContaBancaria.class);
		
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		JAXBElement<ContaBancaria> element = 
				new JAXBElement<ContaBancaria>(new QName("conta"), ContaBancaria.class, this);
		
		StringWriter writer = new StringWriter();
		
		marshaller.marshal(element, writer);
		
		return writer.toString();
		
		}catch(JAXBException e) {
			e.printStackTrace();
			return "ERRO AO GERAR XML";
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}