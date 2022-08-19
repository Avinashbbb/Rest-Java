package net.javaguides.restApi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "companeyName")
    private String CompaneyName;
    @Column(name = "fullName")
    private String FullName;
    @Column(name = "email")
    private String Email;
    @Column(name = "description")
    private String Description;
    @Column(name = "fullNameTechnicalAuthority")
    private String FullNameTechnicalAuthority;
    @Column(name = "technicalAuthorityEmail")
    private String TechnicalAuthorityEmail;
    @Column(name = "usr_id")
    private String UserId;
    @OneToMany(targetEntity = Building.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",referencedColumnName = "Id")
    private List<Building> buildings;
}
