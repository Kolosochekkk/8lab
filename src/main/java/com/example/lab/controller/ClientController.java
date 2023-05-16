package com.example.lab.controller;

import com.example.lab.model.Client;
import com.example.lab.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/client")
    void newClient(@RequestBody Client newClient){
        clientService.save(newClient);
    }

    @GetMapping("/clients")
    List<Client> getAllUsers(){
        return clientService.getAll();
    }

    @GetMapping("/client/{id}")
    Client getClientById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @PutMapping("/client/{id}")
    Client updateClient(@RequestBody Client newClient,@PathVariable Long id){
        return clientService.update(newClient,id);
    }

    @DeleteMapping("/client/{id}")
    String deleteClient(@PathVariable Long id){
        clientService.delete(id);
        return  "Cleint with id "+id+" has been deleted success";

    }

}

