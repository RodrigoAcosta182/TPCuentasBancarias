package ar.edu.unlam.pb2.cuentas;

public class CajaDeAhorro extends CuentaSueldo {
	private Integer contadorExtracciones;
	static final Double COSTO_ADICIONAL = 6.0;

	public CajaDeAhorro(Integer cbu, String alias, Double saldo) {
		super(cbu, alias, saldo);
		this.contadorExtracciones=0;

	}

	@Override
	public Double extraerDinero(Double extraccion) {
		if (this.getSaldo() > extraccion && extraccion > 0) {
			this.setSaldo(this.getSaldo()-extraccion);
			this.contadorExtracciones++;
		}
		
		if(this.contadorExtracciones>5) {
			this.setSaldo(this.getSaldo()-COSTO_ADICIONAL);
		}

		return super.extraerDinero(extraccion);
	}

}
