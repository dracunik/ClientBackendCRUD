package pe.edu.upc.sanchezParra.services;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.sanchezParra.entities.Client;

import java.util.List;

public interface IClientService {
    public void  insert (Client spClient); //
    List<Client> list();
    List<Client> findByName(String spName);
    Integer count(String spName);
    Integer countDate();
}
