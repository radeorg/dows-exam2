package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamCatalogEntity;
import org.dows.exam.dao.ExamCatalogDao;

@Component
public class ExamCatalogRepository  extends CrudRepository<ExamCatalogDao,ExamCatalogEntity> {

}