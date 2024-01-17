package ru.dynamika.library.repository.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bookcrossing")
@Data
public class Bookcrossing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "ID")
    private long id;

    @Column (name = "start_date")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date startdate;

    @OneToOne
    private Book book;

    @OneToOne
    private Client client;

}
