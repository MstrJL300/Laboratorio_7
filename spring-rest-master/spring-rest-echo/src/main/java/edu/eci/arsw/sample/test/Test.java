package edu.eci.arsw.sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import edu.eci.arsw.model.ExcepcionManejadorOrdenes;
import edu.eci.arsw.model.ManejadorOrdenes;
import edu.eci.arsw.model.Orden;
import edu.eci.arsw.model.Plato;

public class Test {

	public static void main(String[] args) throws ExcepcionManejadorOrdenes {
		ApplicationContext ac=new ClassPathXmlApplicationContext("manejadorOrdenesAppContext.xml");
		
		ManejadorOrdenes mo=ac.getBean(ManejadorOrdenes.class);
		
		imprimirFactura(mo, 0);
		
	}
	
	public static void imprimirFactura(ManejadorOrdenes mo,int n) throws ExcepcionManejadorOrdenes{
		System.out.println("FACTURA DE COMPRA");
		for (Plato p:mo.consultarOrden(n).getPlatos()){
			System.out.println(p.getNombre()+"......."+p.getPrecio());
		}
		System.out.println("TOTAL:\t\t\t"+mo.calcularTotalOrden(n));
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
