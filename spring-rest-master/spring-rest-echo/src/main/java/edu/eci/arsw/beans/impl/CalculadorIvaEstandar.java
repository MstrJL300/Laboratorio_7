package edu.eci.arsw.beans.impl;

import org.springframework.stereotype.Service;
import edu.eci.arsw.model.Plato;
import edu.eci.arsw.beans.CalculadorIVA;

@Service
public class CalculadorIvaEstandar implements CalculadorIVA {

	@Override
	public float obtenerPorcentajeIva(Plato p) {
		return 0.16f;
	}

}
