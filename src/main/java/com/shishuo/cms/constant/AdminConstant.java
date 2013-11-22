/*
 * 
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	 
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.shishuo.cms.constant;

/**
 * 管理员表的常量
 * 
 * @author Herbert
 * 
 */
public class AdminConstant {

	/**
	 * 初始化，需要修改密码
	 */
	public static int STATUS_INIT = 0;

	/**
	 * 正常，可以使用
	 */
	public static int STATUS_NORMAL = 1;

	/**
	 * 冻结，禁止使用
	 */
	public static int STATUS_FREEZE = -1;
}
