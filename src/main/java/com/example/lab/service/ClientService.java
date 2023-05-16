package com.example.lab.service;

import com.example.lab.exception.ClientNotFoundException;
import com.example.lab.model.Client;
import com.example.lab.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepo;


    public Client findById(Long aLong) {
        return clientRepo.findById(aLong).orElseThrow(()->new ClientNotFoundException(aLong));
    }


    public void save(Client client) {

        clientRepo.save(client);
    }

    public void delete(Long id) {

        clientRepo.deleteById(id);
    }


    public List<Client> getAll() {
        return clientRepo.findAll();
    }

    public Client update(Client newClient, Long id){
         return clientRepo.findById(id).map(client -> {
            client.setName(newClient.getName());
            client.setSurname(newClient.getSurname());
            client.setPatronymic(newClient.getPatronymic());
            client.setGender(newClient.isGender());

            client.setBirthDate(newClient.getBirthDate());

             client.setSeries_passport(newClient.getSeries_passport());
             client.setNumber_passport(newClient.getNumber_passport());

            client.setEmail(newClient.getEmail());
             client.setTelephone(newClient.getTelephone());
            client.setAddress(newClient.getAddress());

             client.setEmployed(newClient.getEmployed());

             client.setPosition(newClient.getPosition());
             client.setRegistration(newClient.getRegistration());
             client.setCitizenship(newClient.getCitizenship());

            return clientRepo.save(client);
        }).orElseThrow(()->new ClientNotFoundException(id));
    }
}
