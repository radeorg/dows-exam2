package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamQuestionEntity;
import org.dows.exam.dao.ExamQuestionDao;

@Component
public class ExamQuestionRepository  extends CrudRepository<ExamQuestionDao,ExamQuestionEntity> {

}