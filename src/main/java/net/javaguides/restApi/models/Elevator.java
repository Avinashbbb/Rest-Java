package net.javaguides.restApi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="elevators")
public class Elevator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "serial_number")
    private String SerialNumber;
    @Column(name = "companyName")
    private String CompanyName;
    @Column(name = "model")
    private String Model;
    @Column(name = "fullName")
    private String FullName;
    @Column(name = "email")
    private String Email;
    @Column(name = "types")
    private String Types;
    @Column(name = "status")
    private String Status;
    @Column(name = "certificateOperations")
    private String CertificateOperations;
    @Column(name = "information")
    private String Information;
    @Column(name = "notes")
    private String Notes;
    @Column(name = "column_id")
    private String ColumnId;
}
