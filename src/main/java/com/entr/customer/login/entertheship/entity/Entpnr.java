package com.entr.customer.login.entertheship.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ENTPNR")
public class Entpnr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ENT_Id = -1;

    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "MOBNO")
    private String mobNo;
    @Column(name = "COUNRTYNAME")
    private String countryName;
    @Column(name = "ROLETYPE")
    private String roleType;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "ENT_Id")
    private List<Journal> journals;


    public Entpnr() {
    }

    public long getENT_Id() {
        return ENT_Id;
    }

    public void setENT_Id(long ENT_Id) {
        this.ENT_Id = ENT_Id;
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

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }


    public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public List<Journal> getJournals() {
        return journals;
    }

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Entpnr){
            return ENT_Id == ((Entpnr) other).ENT_Id;
        }else{
           return false;
        }

    }

    public int hashcode(){
        return (int) ENT_Id;
    }

}
