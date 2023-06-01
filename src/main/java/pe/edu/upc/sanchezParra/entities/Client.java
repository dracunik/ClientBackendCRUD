package pe.edu.upc.sanchezParra.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spIdClient;
    @Column (name = "spNameClient", nullable = false)
    private String spNameClient;
    @Column (name = "spLastNameClient", nullable = false)
    private String spLastNameClient;
    @Column (name = "spAddressClient", nullable = false)
    private String spAddressClient;
    @Column (name = "spBirthDateClient", nullable = false)
    private LocalDate spBirthDateClient;

    public Client() {
    }

    public Client(int spIdClient, String spNameClient, String spLastNameClient, String spAddressClient, LocalDate spBirthDateClient) {
        this.spIdClient = spIdClient;
        this.spNameClient = spNameClient;
        this.spLastNameClient = spLastNameClient;
        this.spAddressClient = spAddressClient;
        this.spBirthDateClient = spBirthDateClient;
    }

    public int getSpIdClient() {
        return spIdClient;
    }

    public void setSpIdClient(int spIdClient) {
        this.spIdClient = spIdClient;
    }

    public String getSpNameClient() {
        return spNameClient;
    }

    public void setSpNameClient(String spNameClient) {
        this.spNameClient = spNameClient;
    }

    public String getSpLastNameClient() {
        return spLastNameClient;
    }

    public void setSpLastNameClient(String spLastNameClient) {
        this.spLastNameClient = spLastNameClient;
    }

    public String getSpAddressClient() {
        return spAddressClient;
    }

    public void setSpAddressClient(String spAddressClient) {
        this.spAddressClient = spAddressClient;
    }

    public LocalDate getSpBirthDateClient() {
        return spBirthDateClient;
    }

    public void setSpBirthDateClient(LocalDate spBirthDateClient) {
        this.spBirthDateClient = spBirthDateClient;
    }
}
