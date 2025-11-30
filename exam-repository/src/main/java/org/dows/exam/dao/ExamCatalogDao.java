package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamCatalogEntity;
import org.dows.exam.mapper.ExamCatalogMapper;

@Component
public class ExamCatalogDao extends CrudDaoImpl<ExamCatalogMapper,ExamCatalogEntity>{

}