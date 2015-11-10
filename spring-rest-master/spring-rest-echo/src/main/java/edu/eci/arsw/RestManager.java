/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw;

import edu.eci.arsw.model.ExcepcionManejadorOrdenes;
import edu.eci.arsw.model.ManejadorOrdenes;
import edu.eci.arsw.model.Orden;
import edu.eci.arsw.model.Plato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2087133
 */
@RestController
@RequestMapping ( "/ordenes" )
public class RestManager {
    
    @Autowired
    ManejadorOrdenes mo = new ManejadorOrdenes();
    
    @RequestMapping ( method = RequestMethod.GET )
    @ResponseBody
    public List < Orden > consords () {
        return mo.getOrdenes();    
    }
    @RequestMapping ( value = "/{numorden} " , method = RequestMethod.GET )
    @ResponseBody
    public Orden consord ( @PathVariable int numorden ) throws ExcepcionManejadorOrdenes {
        return mo.consultarOrden(numorden); 
    }
    
    @RequestMapping ( method = RequestMethod.POST )
    public ResponseEntity <?> persist ( @RequestBody Orden orden) {
        //Orden or = new Orden();
        orden.agregarPlato(new Plato("pizza",7500));
        mo.registrarOrden(orden);
        return new ResponseEntity <>( HttpStatus.CREATED );
    }
}
