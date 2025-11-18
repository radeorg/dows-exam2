package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamCatelogEntity;
import org.dows.exam.mapper.ExamCatelogMapper;

@Component
public class ExamCatelogDao extends CrudDaoImpl<ExamCatelogMapper,ExamCatelogEntity>{

}