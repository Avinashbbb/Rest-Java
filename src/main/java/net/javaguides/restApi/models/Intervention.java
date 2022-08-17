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
@Table(name="interventions")

public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "author")
    private String author;
    @Column(name = "interventionDateStart")
    private String interventionDateStart;
    @Column(name = "interventionDateEnd")
    private String interventionDateEnd;
    @Column(name = "result")
    private String result;
    @Column(name = "report")
    private String report;
    @Column(name = "status")
    private String status;
    @Column(name = "customer_id")
    private int customer_id;
    @Column(name = "employee_id")
    private int employee_id;
    @Column(name = "building_id")
    private int building_id;
    @Column(name = "batterie_id")
    private int batterie_id;
    @Column(name = "column_id")
    private int column_id;
    @Column(name = "elevator_id")
    private int elevator_id;

}
