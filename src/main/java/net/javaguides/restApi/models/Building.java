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
@Table(name="buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "addressOfBuilding")
    private String AddressOfBuilding;
    @Column(name = "full_name_building_adm")
    private String FullNameBuildingAdmin;
    @Column(name = "email_building_admin")
    private String EmailBuildingAdmin;
    @Column(name = "full_name_technical_authority")
    private String FullNameTechnicalAuthority;
    @Column(name = "email_technical_authority")
    private String EmailTechnicalAuthority;
    @OneToMany(targetEntity = Battery.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "building_id", referencedColumnName = "Id")
    private List<Battery> batteries;

}
