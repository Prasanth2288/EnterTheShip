package com.entr.customer.login.entertheship.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="JRNL")
public class Journal {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Jrnl_Id = -1;

    private String WHAT_MTR;
    private String CO_INC;
    private String BRK_THR;
    private String IDEAS;
    private String FEELING;

    public Journal() {
    }

    public long getJrnl_Id() {
        return Jrnl_Id;
    }

    public void setJrnl_Id(long jrnl_Id) {
        Jrnl_Id = jrnl_Id;
    }

    public String getWHAT_MTR() {
        return WHAT_MTR;
    }

    public void setWHAT_MTR(String WHAT_MTR) {
        this.WHAT_MTR = WHAT_MTR;
    }

    public String getCO_INC() {
        return CO_INC;
    }

    public void setCO_INC(String CO_INC) {
        this.CO_INC = CO_INC;
    }

    public String getBRK_THR() {
        return BRK_THR;
    }

    public void setBRK_THR(String BRK_THR) {
        this.BRK_THR = BRK_THR;
    }

    public String getIDEAS() {
        return IDEAS;
    }

    public void setIDEAS(String IDEAS) {
        this.IDEAS = IDEAS;
    }

    public String getFEELING() {
        return FEELING;
    }

    public void setFEELING(String FEELING) {
        this.FEELING = FEELING;
    }

   

    @Override
    public boolean equals(Object other) {
        if (other instanceof Journal){
            return Jrnl_Id == ((Journal) other).Jrnl_Id;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return (int) Jrnl_Id;
    }
}
