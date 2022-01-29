package com.entr.customer.login.entertheship;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SeedDb {

    @Autowired()
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){

        jdbcTemplate.update("insert into ENTPNR (firstName,lastName,email,mobNo,COUNRTYNAME,ROLETYPE) values (?,?,?,?,?,?)",
                new Object[]{
                        "Prasanth","PS","Prasanth@entshp.com","620331943","NL","ADMIN"
                });
        jdbcTemplate.update("insert into ENTPNR (firstName,lastName,email,mobNo,COUNRTYNAME,ROLETYPE) values (?,?,?,?,?,?)",
                new Object[]{
                        "Parvathy","R","Parvathyh@entshp.com","55533221","NL","ADMIN"
                });
        jdbcTemplate.update("insert into ENTPNR (firstName,lastName,email,mobNo,COUNRTYNAME,ROLETYPE) values (?,?,?,?,?,?)",
                new Object[]{
                        "Sidhu","P","Sid@entshp.com","1234","NL","ADMIN"
                });

        jdbcTemplate.update("insert into JRNL (ENT_Id,WHAT_MTR,CO_INC,BRK_THR,IDEAS,FEELING) values (?,?,?,?,?,?)",
                new Object[]{
                        "1","Super","Paru","love with her","Super Ideas1","Love"
                });
        jdbcTemplate.update("insert into JRNL (ENT_Id,WHAT_MTR,CO_INC,BRK_THR,IDEAS,FEELING) values (?,?,?,?,?,?)",
                new Object[]{
                        "1","Today was good","The website","love with her","Super Ideas2","Love"
                });
        
        jdbcTemplate.update("insert into JRNL (ENT_Id,WHAT_MTR,CO_INC,BRK_THR,IDEAS,FEELING) values (?,?,?,?,?,?)",
                new Object[]{
                        "2","Super Girl","Prasa","love with him","Super Ideas22","Love"
                });
       

    }


}
