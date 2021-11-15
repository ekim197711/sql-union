package com.example.sqlunion.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Table(name="spaceship_captain")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceShipCaptain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int experience;
    private int noCrashes;
    private String planetOrigin;
}
