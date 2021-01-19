package com.xiongzhikai.nest.configs;

import java.security.NoSuchAlgorithmException;

import javax.annotation.PostConstruct;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.xiongzhikai.nest.models.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @PostConstruct
    public void init() throws NoSuchAlgorithmException {
        this.mainDatasource = MongoClients.create(this.mainDatasourceConnectionString);
        this.mainDatabase = this.mainDatasource.getDatabase(this.mainDatabaseName);

        // RSA
        // RSAPublicKey publicKey = //Get the key instance
        // RSAPrivateKey privateKey = //Get the key instance
        // Algorithm algorithmRS = Algorithm.RSA256(publicKey, privateKey);

        // KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        // generator.initialize(2048);
        // KeyPair keyPair = generator.generateKeyPair();
        // PublicKey publicKey = keyPair.getPublic();
        // PrivateKey privateKey = keyPair.getPrivate();
        // RSAPublicKey

        // try {
        //     Algorithm algorithm = Algorithm.RSA256(publicKey, privateKey);
        //     String token = JWT.create().withIssuer("auth0").sign(algorithm);
        // } catch (JWTCreationException exception) {
        //     // Invalid Signing configuration / Couldn't convert Claims.
        // }

    }

    // ==================
    // Datasource
    // ==================

    public MongoClient mainDatasource;

    @Value("${datasource.main.connectionString}")
    String mainDatasourceConnectionString;

    @Bean
    public MongoClient mainDatasource() {
        return this.mainDatasource;
    }

    // ==================
    // Database
    // ==================

    public MongoDatabase mainDatabase;

    @Value("${database.main.name}")
    String mainDatabaseName;

    @Bean
    public MongoDatabase mainDatabase() {
        return this.mainDatabase;
    }

    // ==================
    // Collections
    // ==================

    @Bean
    public MongoCollection<Customer> customerCollection() {
        return this.mainDatabase.getCollection("Customer", Customer.class);
    }

}
