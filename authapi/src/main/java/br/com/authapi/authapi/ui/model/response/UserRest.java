package br.com.authapi.authapi.ui.model.response;

//Classe que retorna o a resposta como JSON
public class UserRest {

    //DB user ID usado para encontrar usuario, usuarios maliciosos podem tentar chutar isso,
    //Podemos gerar aleatorio com bastante caracteres SEGURANCA.
    //Obviamente o response model nao pode ter password -> duhh

    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
