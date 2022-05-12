package com.alterra.cicdjacoco.domain.dao;


import com.alterra.cicdjacoco.domain.common.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;



@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "choose_team")

public class ChooseTeamDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Id
    @ManyToOne
    @JoinColumn(name = "child_id")
    private ChildDao childs;

    //    @Id
    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamDao teams;
}
