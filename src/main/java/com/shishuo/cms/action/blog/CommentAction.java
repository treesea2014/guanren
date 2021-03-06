/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.shishuo.cms.action.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shishuo.cms.constant.CommentConstant;
import com.shishuo.cms.entity.vo.CommentVo;
import com.shishuo.cms.entity.vo.JsonVo;

/**
 * @author Herbert
 * 
 */
@Controller
@RequestMapping("/blog/comment")
public class CommentAction extends BaseAction {

	@ResponseBody
	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
	public JsonVo<CommentVo> add(@RequestParam("userId") long userId,
			@RequestParam("fatherId") long fatherId,
			@RequestParam("name") String name, @RequestParam("url") String url,
			@RequestParam("content") String content, ModelMap modelMap,
			HttpServletRequest request) {
		JsonVo<CommentVo> json = new JsonVo<CommentVo>();
		String ip = request.getRemoteAddr();
		try {
			if (configService.getStringByKey("allow_comment").equals("false")) {
				json.setResult(false);
				json.setMsg("本站目前禁止评论");
				return json;
			}

			if (configService.getStringByKey("need_auditing").equals("false"))
				commentService.addComment(userId, fatherId, name, url, content,
						ip, CommentConstant.Status.display, null);
			else
				commentService.addComment(userId, fatherId, name, url, content,
						ip, CommentConstant.Status.hidden, null);

			json.setResult(true);
			return json;
		} catch (Exception e) {
			json.setResult(false);
			json.setMsg("出现错误");
			return json;
		}
	}
}
