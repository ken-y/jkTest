package cn.you.jk.controller.basicinfo.factory;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.you.jk.controller.BaseController;
import cn.you.jk.domain.Factory;
import cn.you.jk.service.FactoryService;

@Controller
public class FactoryController extends BaseController{
	
	@Resource
	FactoryService factoryService;
	//列表
	@RequestMapping("/baseinfo/factory/list.action")
	public String list(Model model){
		List<Factory> dataList=factoryService.find(null);
		model.addAttribute("dataList",dataList);
		
		return "/baseinfo/factory/jFactoryList.jsp";
	}
	
	//转向新增页面
	@RequestMapping("/baseinfo/factory/tocreate.action")
	public String tocreate(){
		return "/baseinfo/factory/jFactoryCreate.jsp";
	}

	//新增保存
	@RequestMapping("/baseinfo/factory/insert.action")
	public String insert(Factory factory){
		factoryService.insert(factory);
		return "redirect:/baseinfo/factory/list.action";//转向列表action
	}
	
	//转向修改页面
	@RequestMapping("/baseinfo/factory/toupdate.action")
	public String toupdate(String id,Model model){
		Factory obj=factoryService.get(id);
		model.addAttribute("obj", obj);
		return "/baseinfo/factory/jFactoryUpdate.jsp";
	}
	@RequestMapping("/baseinfo/factory/update.action")
	public String update(Factory factory){
		factoryService.update(factory);
		return "redirect:/baseinfo/factory/list.action";
	}
	
	//删除一条
	@RequestMapping("/baseinfo/factory/deleteById.action")
	public String deleteById(String id){
		factoryService.deleteById(id);
		return "redirect:/baseinfo/factory/list.action";
	}
	
	//删除多条
	@RequestMapping("/baseinfo/factory/delete.action")
	public String delete(@RequestParam("id")String[] ids){
		factoryService.delete(ids);
		return "redirect:/baseinfo/factory/list.action";
		
	}
	
	//查看
	@RequestMapping("/baseinfo/factory/toview.action")
	public String toview(String id,Model model){
		Factory obj=factoryService.get(id);
		model.addAttribute("obj",obj);
		return "/baseinfo/factory/jFactoryView.jsp";
	}
	
	//批量启用
	@RequestMapping("/baseinfo/factory/start.action")
	public String start(@RequestParam("id")String[] ids){
		factoryService.start(ids);
		return "redirect:/baseinfo/factory/list.action";		
	}
	//批量停用
	@RequestMapping("/baseinfo/factory/stop.action")
	public String stop(@RequestParam("id")String[] ids){
		factoryService.stop(ids);
		return "redirect:/baseinfo/factory/list.action";		
	}
}
