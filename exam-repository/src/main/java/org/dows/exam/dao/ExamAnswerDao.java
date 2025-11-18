package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamAnswerEntity;
import org.dows.exam.mapper.ExamAnswerMapper;

@Component
public class ExamAnswerDao extends CrudDaoImpl<ExamAnswerMapper,ExamAnswerEntity>{

}