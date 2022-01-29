package com.entr.customer.login.entertheship.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entr.customer.login.entertheship.entity.Entpnr;
import com.entr.customer.login.entertheship.repository.EntpnrRepository;

@RestController
@RequestMapping(path = "/entrepreneur")
@CrossOrigin
public class EntpnrController {

	@Autowired
	EntpnrRepository entpnrRepository;
	
	@GetMapping(path = "/getall",produces = {"application/json","application/xml"})
	public ResponseEntity<Iterable<Entpnr>> getAll(){
		return 	ResponseEntity.ok(entpnrRepository.findAll());
	}
	
	@GetMapping(path = "/getentpnr/{id}",produces = {"application/json","application/xml"})
	public ResponseEntity<Entpnr> getById(@PathVariable long id ){
		
		Optional<Entpnr> entpnr = entpnrRepository.findById(id);
		if(entpnr.isEmpty()) {
			
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(entpnr.get());
		}
		
		
		
		
	}
	
}
