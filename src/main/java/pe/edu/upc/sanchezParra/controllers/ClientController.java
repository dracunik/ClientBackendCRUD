package pe.edu.upc.sanchezParra.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sanchezParra.dtos.ClientDTO;
import pe.edu.upc.sanchezParra.entities.Client;
import pe.edu.upc.sanchezParra.services.IClientService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sanchez")
public class ClientController {
    @Autowired
    private IClientService spCS;
    @GetMapping
    public List<ClientDTO> list() {
        return spCS.list().stream().map(x->{
            ModelMapper spM = new ModelMapper();
            return spM.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody ClientDTO spDto) {
        ModelMapper spM = new ModelMapper();
        Client spC = spM.map(spDto, Client.class);
        spCS.insert(spC);
    }
    @GetMapping("/findByName")
    public List<ClientDTO> findByName(@RequestParam String spName) {
        return spCS.findByName(spName).stream().map(x->{
            ModelMapper spM = new ModelMapper();
            return spM.map(x, ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/count")
    public Integer count(@RequestParam String spName){
        return spCS.count(spName);
    }
    @PostMapping("/countDate")
    public Integer countDate(){
        return spCS.countDate();
    }
}
