/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */
package com.shishuo.cms.action.blog;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.shishuo.cms.service.ArticleService;
import com.shishuo.cms.service.CommentService;
import com.shishuo.cms.service.ConfigService;
import com.shishuo.cms.service.FolderService;
import com.shishuo.cms.service.HeadlineService;
import com.shishuo.cms.service.TemplateService;

/**
 * 
 * @author Herbert
 * 
 */
public class BaseAction {

	@Autowired
	protected FolderService folderService;

	@Autowired
	protected ArticleService fileService;

	@Autowired
	protected CommentService commentService;

	@Autowired
	protected ConfigService configService;

	@Autowired
	protected TemplateService themeService;

	@Autowired
	protected HeadlineService headlineService;

	protected final Logger logger = Logger.getLogger(this.getClass());
}
