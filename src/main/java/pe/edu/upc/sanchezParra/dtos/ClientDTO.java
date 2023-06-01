package pe.edu.upc.sanchezParra.dtos;

import java.time.LocalDate;

public class ClientDTO {
    private int spIdClient;
    private String spNameClient;
    private String spLastNameClient;
    private String spAddressClient;
    private LocalDate spBirthDateClient;

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
