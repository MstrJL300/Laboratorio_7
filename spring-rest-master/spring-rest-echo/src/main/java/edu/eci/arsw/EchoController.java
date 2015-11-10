package edu.eci.arsw;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.ui.Model;

@RestController
public class EchoController {

    private static final String template = "%s!";

    @RequestMapping(value="/echo/{input}",method=RequestMethod.GET)
    public Echo echo(@PathVariable String input) {
        return new Echo(String.format(template, input));
    }

    @RequestMapping(value="/hecho/{input}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> hello(@PathVariable String input) {
	return new ResponseEntity<>("REST API. Echo: <b>"+input+"</b>",HttpStatus.ACCEPTED);
    }

}
