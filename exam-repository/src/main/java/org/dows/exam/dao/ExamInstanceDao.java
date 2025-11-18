package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamInstanceEntity;
import org.dows.exam.mapper.ExamInstanceMapper;

@Component
public class ExamInstanceDao extends CrudDaoImpl<ExamInstanceMapper,ExamInstanceEntity>{

}