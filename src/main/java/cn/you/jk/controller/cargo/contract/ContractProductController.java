package cn.you.jk.controller.cargo.contract;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.you.jk.controller.BaseController;
import cn.you.jk.domain.ContractProduct;
import cn.you.jk.service.ContractProductService;

@Controller
public class ContractProductController extends BaseController{
	
	@Resource
	ContractProductService contractProductService;
	
	//转向新增页面
	@RequestMapping("/cargo/contractproduct/tocreate.action")
	public String toCreate(String contractId,Model model){
		
		model.addAttribute("contractId",contractId);
		return "/cargo/contract/jContractProductCreate.jsp";//货物新增
	}
	
	//新增
	@RequestMapping("/cargo/contractproduct/insert.action")
	public String insert(ContractProduct contractProduct,Model model){
		contractProductService.insert(contractProduct);
		model.addAttribute("contractId",contractProduct.getContractId());
		return "redirect:/cargo/contractproduct/tocreate.action";
	}
	

}
