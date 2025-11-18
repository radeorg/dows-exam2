package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.dows.rongz.dao.TaskConfigDao;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamAnswerEntity;
import org.dows.exam.dao.ExamAnswerDao;

@Component
public class ExamAnswerRepository  extends CrudRepository<ExamAnswerDao,ExamAnswerEntity> {

}