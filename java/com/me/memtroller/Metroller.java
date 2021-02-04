package com.me.memtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.me.DTO.MbCriteria;
import com.me.DTO.MelistDTO;
import com.me.DTO.MemberDTO;
import com.me.Service.MeServiceImpl;


@Controller
@RequestMapping("/member")
public class Metroller {
	
	private static final Logger logger=LoggerFactory.getLogger(Metroller.class);
	@Autowired
	MeServiceImpl mservice;
	
	@GetMapping("/join")
	public void memberWrite() {
	}
	
	@RequestMapping(value="/writePost", method=RequestMethod.POST)
    public String mwrite(MemberDTO mdto) {
	  mservice.mwrite(mdto); 
	  return "redirect:/home/dashboard";
	}
	
	//membership table
	@GetMapping("/tables")
	public void meinfo(MbCriteria mcri, Model model) {
		int result=mservice.getResult();
		
		model.addAttribute("meminfo", mservice.meinfo(mcri));
		model.addAttribute("pageCreate",new MelistDTO(mcri,result));
		
	}
	
	@GetMapping("/user")
	public void mdetail(Model model, MemberDTO mdto) {
		model.addAttribute("mdetail", mservice.mdetail(mdto));
	}
	
	@GetMapping("/update") 
	public void memberUpdate(Model model, MemberDTO mdto) {

		model.addAttribute("mupdate", mservice.mdetail(mdto));

	}
	
	@PostMapping("/update")
	public String mupdate(MemberDTO mdto) {
		
		mservice.mupdate(mdto);
		return "redirect:/member/read?id=" + mdto.getId();

	}
	 
	@PostMapping("/delete")
	public String mdelete(MemberDTO mdto) {
		mservice.mdelete(mdto);
		return "redirect:/member/tables";
	}


}

