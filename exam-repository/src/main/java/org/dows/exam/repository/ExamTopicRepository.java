package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamTopicEntity;
import org.dows.exam.dao.ExamTopicDao;

@Component
public class ExamTopicRepository  extends CrudRepository<ExamTopicDao,ExamTopicEntity> {

}