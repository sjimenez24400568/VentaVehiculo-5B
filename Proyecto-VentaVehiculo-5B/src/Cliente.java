

public class Cliente {

    
    private String rs;
    private String rfc;
    private String email;

    
    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }

    
    @Override
public String toString() {
    return "Cliente{" +
            "rs='" + rs + '\'' +
            ", rfc='" + rfc + '\'' +
            ", email='" + email + '\'' +
            '}';
}

}
