package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import ch.qos.logback.core.net.server.Client;

public interface IClientRepository extends MongoRepository<Client, Long>{
	

}
