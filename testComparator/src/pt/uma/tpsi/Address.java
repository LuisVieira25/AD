package pt.uma.tpsi;

/**
 * This class represents an address
 */
public class Address implements Comparable<Address>{
    private String street;
    private int number;
    private String postalCode;
    private String city;
    private String country;

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Address(){
        this.street = "";
        this.number = 0;
        this.postalCode = "";
        this.city = "";
        this.country = "";
    }

    /**
     * CONSTRUCTOR BY PARAMS
     * @param street represents street name
     * @param number represents door number
     * @param postalCode
     * @param city represents city name
     * @param country represents country name
     */
    public Address(String street, int number, String postalCode, String city, String country){
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        return this.number - o.number;
    }
}
