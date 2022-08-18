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
@Table(name="columns")
public class Colum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "typs")
    private String Types;
    @Column(name = "model")
    private String Model;
    @Column(name = "numberFloorServed")
    private String NumberFloorServed;
    @Column(name = "status")
    private String Status;
    @Column(name = "information")
    private String Information;
    @Column(name = "notes")
    private String Notes;
    @Column(name = "batterie_id")
    private String BatterieId;
    @OneToMany(targetEntity = Elevator.class,cascade = CascadeType.ALL)
    @JoinColumn(name= "column_id",referencedColumnName = "Id")
    private List <Elevator> elevators;




}
