package com.huiyou.sup.controller;

import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.service.index.IndexPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>类描述:默认页<br/>
 * 创建时间：2017/11/24 10:51<br/>
 * 文件名称：IndexController<br/>
 * 类路径：com.gome.mobile.platform.controller.base<br/>
 * 修改记录：<br/>
 * YYYY/MM/DD zxs：修改内容<br/>
 * </p>
 *
 * @author zhangxusheng
 * @version V1.0
 */
@Controller
public class IndexController {

	@Autowired
	private IndexPService indexPService;

	/**
	 * 处理根目录请求
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value={"/"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String indexPage(HttpServletRequest request, HttpServletResponse response) {
		return "redirect:/index.html";
	}

	/**
	 * 获取精品推荐
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/product/bestproduct", method = {RequestMethod.GET})
	@ResponseBody
	public BaseResponse recomBestProducts(HttpServletRequest request, HttpServletResponse response){
		BaseResponse baseResponse = indexPService.allBestProducts();
		return baseResponse;
	}

	/**
	 * 获取大图主推荐
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/product/mainproduct", method = {RequestMethod.GET})
	@ResponseBody
	public BaseResponse recomMainProducts(HttpServletRequest request, HttpServletResponse response){
		BaseResponse baseResponse = indexPService.allMainProducts();
		return baseResponse;
	}

}
