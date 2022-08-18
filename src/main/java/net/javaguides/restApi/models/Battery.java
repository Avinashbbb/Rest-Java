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
@Table(name="batteries")
public class Battery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "types")
    private String Types;
    @Column(name = "status")
    private String Status;
    @Column(name = "certificate_of_operations")
    private String CertificateOfOperations;
    @Column(name = "information")
    private String Information;
    @Column(name = "notes")
    private String Notes;
    @Column(name = "building_id")
    private String BuildingId;
    @OneToMany(targetEntity = Colum.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "batterie_id",referencedColumnName = "Id")
    private List<Colum> colums;
}
