package edu.eci.arsw.beans.impl;

import edu.eci.arsw.model.Orden;
import edu.eci.arsw.model.Plato;
import edu.eci.arsw.beans.CalculadorCuenta;

public class CalculadorBasicoCuentas implements CalculadorCuenta {

	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio();
		}
		return total;
	}

}
