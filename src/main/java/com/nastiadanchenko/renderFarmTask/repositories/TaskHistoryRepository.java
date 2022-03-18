package com.nastiadanchenko.renderFarmTask.repositories;

import com.nastiadanchenko.renderFarmTask.models.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Long> {
}