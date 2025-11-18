package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamConfigEntity;
import org.dows.exam.mapper.ExamConfigMapper;

@Component
public class ExamConfigDao extends CrudDaoImpl<ExamConfigMapper,ExamConfigEntity>{

}