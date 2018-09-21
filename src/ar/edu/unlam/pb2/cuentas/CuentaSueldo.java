package ar.edu.unlam.pb2.cuentas;

public class CuentaSueldo {
	private Integer cbu;
	private String alias;
	private Double saldo;

	public CuentaSueldo(Integer cbu, String alias, Double saldo) {
		super();
		this.cbu = cbu;
		this.alias = alias;
		this.saldo = saldo;
	}
	
	public Double depositarDinero(Double deposito) {
		if (deposito > 0) {
			this.saldo += deposito;
		}
		return this.saldo;
	}

	public Double extraerDinero(Double extraccion) {
		if (this.saldo >= extraccion && extraccion > 0) {
			this.saldo -= extraccion;
		}

		return this.saldo;
	}

	public Double mostrarSaldo() {
		return this.saldo;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
