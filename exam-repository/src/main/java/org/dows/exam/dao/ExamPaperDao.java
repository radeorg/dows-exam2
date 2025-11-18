package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamPaperEntity;
import org.dows.exam.mapper.ExamPaperMapper;

@Component
public class ExamPaperDao extends CrudDaoImpl<ExamPaperMapper,ExamPaperEntity>{

}