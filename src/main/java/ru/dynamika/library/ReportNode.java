package ru.dynamika.library;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@RequiredArgsConstructor
public class ReportNode {

    private String fio;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;

    private String nameBook;

    private String authorBook;

    private String isbnBook;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date startDate;

}
