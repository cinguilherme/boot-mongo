package com.example.monguitoz.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;

@Configuration
@ComponentScan
@EnableMongoRepositories
public class ApplicationConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "local";
	}

	@Override
	public Mongo mongo() throws Exception {
		Mongo mongo = new MongoClient("127.0.0.1",27017);
		return mongo;
	}
	
	@Override
    protected String getMappingBasePackage() {
        return "com.example.monguitoz";
    }

}
