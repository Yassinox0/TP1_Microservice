package com.example.clientservice.Repositories;

import com.example.clientservice.Entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    @Bean
    default CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Layla Nasser", Float.parseFloat("24")));
            clientRepository.save(new Client(Long.parseLong("2"), "Tariq Farid", Float.parseFloat("25")));
            clientRepository.save(new Client(Long.parseLong("3"), "Noor Al-Mansoori", Float.parseFloat("26")));
            clientRepository.save(new Client(Long.parseLong("4"), "Youssef Khalil", Float.parseFloat("27")));
            clientRepository.save(new Client(Long.parseLong("5"), "Hana Rahmani", Float.parseFloat("28")));
            clientRepository.save(new Client(Long.parseLong("6"), "Omar Zahir", Float.parseFloat("29")));
            clientRepository.save(new Client(Long.parseLong("7"), "Leila Haddad", Float.parseFloat("30")));
            clientRepository.save(new Client(Long.parseLong("8"), "Zain Al-Farsi", Float.parseFloat("31")));


        };
    }
}