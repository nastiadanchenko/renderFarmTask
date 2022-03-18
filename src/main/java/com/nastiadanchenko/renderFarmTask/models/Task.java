package com.nastiadanchenko.renderFarmTask.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "task_status")
    private TaskStatus status;
    @Column(name = "time")
    private LocalDate startTimeStatus;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "task")
    private List<TaskHistory> history = new ArrayList<>();


    public Task() {
        this.startTimeStatus = LocalDate.now();
        this.status = TaskStatus.RENDERING;
        this.history.add(new TaskHistory(this.startTimeStatus, this.status));
    }
}