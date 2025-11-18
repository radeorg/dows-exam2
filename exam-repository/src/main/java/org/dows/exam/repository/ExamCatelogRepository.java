package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.dows.rongz.dao.TaskConfigDao;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamCatelogEntity;
import org.dows.exam.dao.ExamCatelogDao;

@Component
public class ExamCatelogRepository  extends CrudRepository<ExamCatelogDao,ExamCatelogEntity> {

}