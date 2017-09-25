package cn.you.jk.controller.cargo.contract;



import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.you.jk.controller.BaseController;
import cn.you.jk.domain.Contract;
import cn.you.jk.service.ContractService;
import cn.you.jk.vo.ContractVO;

@Controller
public class ContratController extends BaseController{

	@Resource
	ContractService contractService;
	
	@RequestMapping("/cargo/contract/list.action")
	public String list(Model model){
		List<Contract> datalist=contractService.find(null);
		model.addAttribute("datalist",datalist);
		
		return "/cargo/contract/jContractList.jsp";
	}
	
    //跳到添加编辑页面  
    @RequestMapping("/cargo/contract/tocreate.action")  
    public String tocreate(){  
        return "/cargo/contract/jContractCreate.jsp";  
    }  
      
      
    //添加  
    @RequestMapping("/cargo/contract/insert.action")  
    public String insert(@ModelAttribute("contract")Contract contract,BindingResult bindingResult){  
        contractService.insert(contract);  
          
        return "redirect:/cargo/contract/list.action";  
    }  
	
	@RequestMapping("/cargo/contract/toupdate.action")
	public String toupdate(String id,Model model){
		Contract obj=contractService.get(id);
		model.addAttribute("obj",obj);
		
		return "/cargo/contract/jContractUpdate.jsp";	
	}
	
	@RequestMapping("/cargo/contract/update.action")
	public String update(@ModelAttribute("contract")Contract contract, BindingResult results,
		      Locale local){
		contractService.update(contract);
		
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/delete.action")
	public String delete(@RequestParam("id")String[] ids){
		contractService.delete(ids);
		return "redirect:/cargo/contract/list.action";	
	}
	
	@RequestMapping("/cargo/contract/deleteById.action")
	public String deleteById(String id) {
		contractService.deleteById(id);
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/toview.action")
	public String toview(String id,Model model){
		ContractVO obj=contractService.view(id);
		model.addAttribute("obj",obj);
		
		return "/cargo/contract/jContractView.jsp";
	}
	
	@RequestMapping("/cargo/contract/submit.action")
	public String submit(@RequestParam("id")String[] ids){
		contractService.submit(ids);
		return "redirect:/cargo/contract/list.action";
	}
	
	@RequestMapping("/cargo/contract/cancel.action")
	public String cancel(@RequestParam("id")String[] ids){
		contractService.cancel(ids);
		return "redirect:/cargo/contract/list.action";
	}
}
