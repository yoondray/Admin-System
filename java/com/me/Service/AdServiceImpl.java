package com.me.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.me.DTO.AdminDTO;
import com.me.Mapper.AdminDAO;

@Service
public class AdServiceImpl implements AdService {

	@Autowired
	AdminDAO adao;
	
	/*AdminDTO-DeptDTO
	@Transactional
	public void dptinfo(AdminDTO adto) {
		adao.dptinfo(adto);
		if(adto.getDeptList()!=null) {
			adto.getDeptList().forEach(dpt->{
				dpt.setDeptNo(adto.getDeptNo());
				dptto.select(dpt);
			});
		}
	}*/
	

	public AdminDTO epogin(AdminDTO adto) {
		return adao.epogin(adto);
	}

	public ArrayList<AdminDTO> epinfo() {
		return adao.epinfo();
	}







}
