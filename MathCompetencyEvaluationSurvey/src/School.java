

public class School {
    // attributes
    private String name;

    private Address address;

    private Principal principal;


    // setter and getter
    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName( ) {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal){
        this.principal = principal;
    }


}
