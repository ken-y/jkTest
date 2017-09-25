package cn.you.jk.controller.cargo.contract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.you.jk.controller.BaseController;
import cn.you.jk.domain.ContractProduct;
import cn.you.jk.domain.Factory;
import cn.you.jk.service.ContractProductService;
import cn.you.jk.service.FactoryService;

@Controller
public class ContractProductController extends BaseController{
	
	@Resource
	ContractProductService contractProductService;
	@Resource
	FactoryService factoryService;
	
	//转向新增页面
	@RequestMapping("/cargo/contractproduct/tocreate.action")
	public String toCreate(String contractId,Model model){
		
		model.addAttribute("contractId",contractId);
		//准备生产厂家的下拉列表
		List<Factory> factoryList=factoryService.getFactoryList();
		model.addAttribute("factoryList", factoryList);
		
		
		//某个合同下的货物
		Map paraMap=new HashMap<>();
		paraMap.put("contractId", contractId);
		List<ContractProduct> dataList=contractProductService.find(paraMap);
		model.addAttribute("dataList",dataList);
		return "/cargo/contract/jContractProductCreate.jsp";//货物新增
	}
	
	//新增
	@RequestMapping("/cargo/contractproduct/insert.action")
	public String insert(ContractProduct contractProduct,Model model){
		contractProductService.insert(contractProduct);
		model.addAttribute("contractId",contractProduct.getContractId());
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
	
	//专项修改也迷上你
	@RequestMapping("/cargo/contractproduct/toupdate.action")
	public String toupdate(String id,Model model){
		ContractProduct obj=contractProductService.get(id);
		model.addAttribute("obj",obj);
		//准备生产厂家的下拉列表
		List<Factory> factoryList=factoryService.getFactoryList();
		model.addAttribute("factoryList", factoryList);
		return "/cargo/contract/jContractProductUpdate.jsp";//货物修改页面
	}
	
	//修改
	@RequestMapping("/cargo/contractproduct/update.action")
	public String toupdate(ContractProduct contractProduct,Model model){
		contractProductService.update(contractProduct);
		
		model.addAttribute("contractId",contractProduct.getContractId());
		
		return "redirect:/cargo/contractproduct/tocreate.action";
	}

	@RequestMapping("/cargo/contractproduct/deleteById.action")
	public String delete(String contractId,String id ,Model model){
		contractProductService.deleteById(id);
		
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
}
