package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamQuestionEntity;
import org.dows.exam.mapper.ExamQuestionMapper;

@Component
public class ExamQuestionDao extends CrudDaoImpl<ExamQuestionMapper,ExamQuestionEntity>{

}