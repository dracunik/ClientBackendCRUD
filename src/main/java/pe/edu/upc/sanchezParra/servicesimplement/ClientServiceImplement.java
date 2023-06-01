package pe.edu.upc.sanchezParra.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sanchezParra.entities.Client;
import pe.edu.upc.sanchezParra.repositories.IClientRepository;
import pe.edu.upc.sanchezParra.services.IClientService;

import java.util.List;

@Service
public class ClientServiceImplement implements IClientService {
    @Autowired
    private IClientRepository spCR;
    @Override
    public void  insert (Client spClient){
        spCR.save(spClient);
    }
    @Override
    public List<Client> list(){
        return spCR.findAll();
    }

    @Override
    public List<Client> findByName(String spName) {
        return spCR.findByName(spName);
    }

    @Override
    public Integer count(String spName) {
        return spCR.count(spName);
    }

    @Override
    public Integer countDate() {
        return spCR.countDate();
    }

}
