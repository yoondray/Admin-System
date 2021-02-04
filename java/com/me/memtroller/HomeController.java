package com.me.memtroller;


import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.me.DTO.AdminDTO;
import com.me.Service.AdServiceImpl;
import com.me.Service.MeServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	AdServiceImpl adservice;
	
	@Autowired
	MeServiceImpl mservice;
		
	@GetMapping("/login")
	public void emplogin() {
		
	}
	
	@PostMapping("/loginPost")
	public String epogin(AdminDTO adto, RedirectAttributes rttr,HttpSession session) {
	
		AdminDTO result=adservice.epogin(adto);
		
		//logger.info("Login possibility");
		if(result==null) {

			rttr.addFlashAttribute("check", "fail");
			return "redirect:/home/login";
		}else {
			session.setAttribute("empNo", result.getEmpNo());
			return "redirect:/home/dashboard";
		} 
	}
	
	@GetMapping("/logout")
	public String logout() {
		
		
		
		return "redirect:/home/login";
	}
	
	//employee table
	@GetMapping("/dashboard")
	public String epinfo(Model model,RedirectAttributes rttr, HttpSession session) {
		//System.out.println("show King of this month List");
		int result=mservice.getResult();
		
		model.addAttribute("emplinfo",adservice.epinfo());

		//System.out.println("result="+result);
		model.addAttribute("usrcnt", mservice.getResult());
		
		if(session.getAttribute("empNo") ==null) {
			rttr.addFlashAttribute("admin", "fail");
			return "redirect:/home/login";
			
		}else //{
			//String empNo = (String)session.getAttribute("empNo");
			//rttr.addFlashAttribute("logout","success");
			//return "redirect:/home/logout";
		//}
		
		return "home/dashboard";
	}
	
	/*
	@RequestMapping(value="/{deptNo}", method=RequestMethod.GET)
	public ResponseEntity<ArrayList<DeptDTO>> getDaction(@PathVariable("deptNo")int deptNo){
		System.out.println("show adminList");
		return new ResponseEntity<>(adservice.showDpt(deptNo), HttpStatus.OK);
	}*/
	
	@GetMapping(value="/user")
	public void showUpdate() {
	}
	
	

	
}
