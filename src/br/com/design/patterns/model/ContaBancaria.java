package br.com.design.patterns.model;

import java.io.StringWriter;
import java.time.LocalDate;

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
	
	private LocalDate dataAbertura;
	
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
	
	public ContaBancaria(double saldo, LocalDate dataAbertura, String nome) {
		this.saldo = saldo;
		this.investido = 0.0;
		this.dataAbertura = dataAbertura;
		this.nome = nome;
	}

	public void investir(double valor, Investimento investimento) {
		if(valor > this.saldo) {
			throw new IllegalArgumentException("Saldo insuficiente para essa operacao.");
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

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAbertura == null) ? 0 : dataAbertura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(investido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (dataAbertura == null) {
			if (other.dataAbertura != null)
				return false;
		} else if (!dataAbertura.equals(other.dataAbertura))
			return false;
		if (Double.doubleToLongBits(investido) != Double.doubleToLongBits(other.investido))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", investido=" + investido + ", dataAbertura=" + dataAbertura
				+ ", nome=" + nome + "]";
	}
	
	
}