-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `exam`;
USE `exam`;

drop table if exists `exam_catelog`;
CREATE TABLE IF NOT EXISTS `exam_catelog`(
    `exam_catelog_id` bigint(19) NOT NULL COMMENT '考试类目ID',
    `pid` bigint(19) DEFAULT NULL COMMENT '父ID',
    `name` varchar(64) DEFAULT NULL COMMENT '知识类目',
    `code` varchar(64) DEFAULT NULL COMMENT 'code',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `prompt` varchar(64) DEFAULT NULL COMMENT '出题提示词，如多维度[{性格,价值观,心理},{java,mysql,ai}]',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`exam_catelog_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_topic`;
CREATE TABLE IF NOT EXISTS `exam_topic`(
    `exam_topic_id` bigint(19) NOT NULL COMMENT '试题题目ID',
    `exam_catelog_id` bigint(19) DEFAULT NULL COMMENT '考试类目ID',
    `topic` varchar(64) DEFAULT NULL COMMENT '题目名称',
    `description` varchar(64) DEFAULT NULL COMMENT '题目描述',
    `option_json` text DEFAULT NULL COMMENT '题目答案选项',
    `result` varchar(64) DEFAULT NULL COMMENT '题目答案',
    `score` integer(11) DEFAULT NULL COMMENT '题目分值',
    `generate_type` integer(11) DEFAULT NULL COMMENT '生成类型[0:AI,1:人工]',
    `topic_type` integer(11) DEFAULT NULL COMMENT '题型[1:选择题，2:填空题，3:问答题..]',
    `enabled` tinyint(4) DEFAULT NULL COMMENT '是否可用0-可用，1-不可用',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`exam_topic_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_config`;
CREATE TABLE IF NOT EXISTS `exam_config`(
    `exam_config_id` bigint(19) NOT NULL COMMENT '考试配置ID',
    `org_root_id` bigint(19) DEFAULT NULL COMMENT '组织根ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `org_jd_id` bigint(19) DEFAULT NULL COMMENT '岗位描述ID',
    `topic_config` text DEFAULT NULL COMMENT '题目配置[{examCategoryId:11,percent:20%,examTopicIds:[1,2,3]}]',
    `total` integer(11) DEFAULT NULL COMMENT '总题数',
    `data_table` varchar(64) DEFAULT NULL COMMENT '数据来源表',
    `template` varchar(64) DEFAULT NULL COMMENT '试卷模板',
    `score` integer(11) DEFAULT NULL COMMENT '总分',
    `strategy` integer(11) DEFAULT NULL COMMENT '策略[0:顺序，1:随机]',
    `duration` integer(11) DEFAULT NULL COMMENT '考试时长',
    `merged` tinyint(4) DEFAULT NULL COMMENT '是否合并分类',
    `paper_count` integer(11) DEFAULT NULL COMMENT '试卷数量',
    `random` tinyint(4) DEFAULT NULL COMMENT '是否随机出题',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    PRIMARY KEY (`exam_config_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_paper`;
CREATE TABLE IF NOT EXISTS `exam_paper`(
    `exam_paper_id` bigint(19) NOT NULL COMMENT '考试试卷ID',
    `exam_config_id` bigint(19) DEFAULT NULL COMMENT '考试配置ID',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `exam_duration` integer(11) DEFAULT NULL COMMENT '考试时长',
    `content` varchar(64) DEFAULT NULL COMMENT '试卷内容（freemarker渲染生成）',
    `link` varchar(64) DEFAULT NULL COMMENT '试卷链接',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳 ',
    PRIMARY KEY (`exam_paper_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_question`;
CREATE TABLE IF NOT EXISTS `exam_question`(
    `exam_question_id` bigint(19) NOT NULL COMMENT '考试问题ID',
    `exam_paper_id` bigint(19) DEFAULT NULL COMMENT '考试试卷ID',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `exam_topic_id` bigint(19) DEFAULT NULL COMMENT '试题题目ID',
    `seq` integer(11) DEFAULT NULL COMMENT '题目顺序',
    `score` integer(11) DEFAULT NULL COMMENT '分值',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`exam_question_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_instance`;
CREATE TABLE IF NOT EXISTS `exam_instance`(
    `exam_instance_id` bigint(19) NOT NULL COMMENT '考试实例ID',
    `exam_paper_id` bigint(19) DEFAULT NULL COMMENT '考试试卷ID',
    `resume_instance_id` bigint(19) DEFAULT NULL COMMENT '人才简历ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `user_instance_id` bigint(19) DEFAULT NULL COMMENT '用户实例ID',
    `exam_score` decimal DEFAULT NULL COMMENT '考试分值',
    `start_time` datetime DEFAULT NULL COMMENT '开始考试时间',
    `end_time` datetime DEFAULT NULL COMMENT '结束考试时间',
    `finish_time` datetime DEFAULT NULL COMMENT '完成时间',
    `enabled` tinyint(4) DEFAULT NULL COMMENT '是否可用0-可用，1-不可用',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`exam_instance_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `exam_answer`;
CREATE TABLE IF NOT EXISTS `exam_answer`(
    `exam_answer_id` bigint(19) NOT NULL COMMENT '考试答题ID',
    `exam_instance_id` bigint(19) DEFAULT NULL COMMENT '考试实例ID',
    `exam_question_id` bigint(19) DEFAULT NULL COMMENT '考试问题ID',
    `exam_score` integer(11) DEFAULT NULL COMMENT '考得分值',
    `answer_content` varchar(64) DEFAULT NULL COMMENT '答案',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '归属者',
    `operator_id` bigint(19) DEFAULT NULL COMMENT '操作者ID',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用ID',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    PRIMARY KEY (`exam_answer_id`)
) ENGINE=InnoDB COMMENT='';


