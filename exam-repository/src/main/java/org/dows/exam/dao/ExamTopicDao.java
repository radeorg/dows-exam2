package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamTopicEntity;
import org.dows.exam.mapper.ExamTopicMapper;

@Component
public class ExamTopicDao extends CrudDaoImpl<ExamTopicMapper,ExamTopicEntity>{

}