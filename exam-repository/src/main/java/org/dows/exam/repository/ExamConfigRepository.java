package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.dows.rongz.dao.TaskConfigDao;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamConfigEntity;
import org.dows.exam.dao.ExamConfigDao;

@Component
public class ExamConfigRepository  extends CrudRepository<ExamConfigDao,ExamConfigEntity> {

}