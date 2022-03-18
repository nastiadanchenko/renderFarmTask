package com.nastiadanchenko.renderFarmTask.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Long id;
@Column
@NonNull
    private String name;
@Column
@NonNull
    private String password;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Task> tasks = new java.util.ArrayList<>();
}
