package transp.api.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transp.api.rest.model.dadosTransportadoraView;
import transp.api.rest.repository.TranspRepository;

@RestController  /*Arquitetura REST*/
@RequestMapping(value = "/transportadoras")
public class IndexController {
	
	@Autowired
	private TranspRepository transpRepository;
	
	/*Serviço RESTfull*/
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<dadosTransportadoraView> init(@PathVariable(value = "id") Integer id) {
		
		Optional<dadosTransportadoraView> transportadoras = transpRepository.findById(id);
		
		return new ResponseEntity<dadosTransportadoraView>(transportadoras.get(), HttpStatus.OK);
	}
}
