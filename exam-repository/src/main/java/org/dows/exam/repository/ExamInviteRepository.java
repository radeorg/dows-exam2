package org.dows.exam.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.exam.entity.ExamInviteEntity;
import org.dows.exam.dao.ExamInviteDao;

@Component
public class ExamInviteRepository  extends CrudRepository<ExamInviteDao,ExamInviteEntity> {

}