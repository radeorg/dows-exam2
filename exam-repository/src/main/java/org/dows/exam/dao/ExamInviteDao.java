package org.dows.exam.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.exam.entity.ExamInviteEntity;
import org.dows.exam.mapper.ExamInviteMapper;

@Component
public class ExamInviteDao extends CrudDaoImpl<ExamInviteMapper,ExamInviteEntity>{

}