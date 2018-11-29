package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.IClientRepository;

import ch.qos.logback.core.net.server.Client;

public class ClientController  {
@Autowired
private IClientRepository clientRep;

@RequestMapping("/add")
public Client add(Client c) {
	clientRep.save(c);
	return c;
	}




@RequestMapping("/delete")
public void supprimer(Long code){
	clientRep.deleteById(code);
}

@RequestMapping("/getall")
public List<Client> getAll() {
	return clientRep.findAll();
}

@RequestMapping("/getone")
public Client getOne(long code) {
	return clientRep.findById(code).get();
}

@RequestMapping("/update")
public Client update(Client client) {
	return clientRep.save(client);
}



}
