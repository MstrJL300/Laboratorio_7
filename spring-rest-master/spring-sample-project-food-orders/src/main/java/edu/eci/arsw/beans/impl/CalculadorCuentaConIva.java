package edu.eci.arsw.beans.impl;

import edu.eci.arsw.model.Orden;
import edu.eci.arsw.model.Plato;
import edu.eci.arsw.beans.CalculadorCuenta;
import edu.eci.arsw.beans.CalculadorIVA;


public class CalculadorCuentaConIva implements CalculadorCuenta {

	CalculadorIVA civa;
	
	
	@Override
	public int calcularCosto(Orden o) {
		int total=0;
		for (Plato p:o.getPlatos()){
			total+=p.getPrecio()*(1+civa.obtenerPorcentajeIva(p));
		}
		return total;
	}

}
