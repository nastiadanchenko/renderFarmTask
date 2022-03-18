package com.nastiadanchenko.renderFarmTask.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "task_history")
public class TaskHistory {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
@Column(name = "status")
    private TaskStatus taskStatus;
@Column(name = "start_time")
    private LocalDate startStatus;

    public TaskHistory(LocalDate startStatus,TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        this.startStatus = startStatus;
    }
}