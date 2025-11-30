package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamPaperEntity;
import org.dows.exam.dao.ExamPaperDao;

@Component
public class ExamPaperRepository  extends CrudRepository<ExamPaperDao,ExamPaperEntity> {

}