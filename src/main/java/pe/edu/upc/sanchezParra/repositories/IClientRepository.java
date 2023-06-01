package pe.edu.upc.sanchezParra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sanchezParra.entities.Client;

import java.util.List;

@Repository
public interface IClientRepository  extends JpaRepository<Client, Integer> {
    @Query("from Client spClient where spClient.spNameClient=:spName")
    List<Client> findByName(@Param("spName")String spName);
    @Query("select count (spClient) from Client spClient where spClient.spNameClient=:spName")
    Integer count(@Param("spName")String spName);
    @Query("select count (spClient) from Client spClient where spClient.spBirthDateClient > '2023-01-01'")
    Integer countDate();
}
