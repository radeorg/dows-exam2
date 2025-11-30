package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamInstanceEntity;
import org.dows.exam.dao.ExamInstanceDao;

@Component
public class ExamInstanceRepository  extends CrudRepository<ExamInstanceDao,ExamInstanceEntity> {

}