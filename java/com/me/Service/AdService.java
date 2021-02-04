package com.me.Service;

import java.util.ArrayList;

import com.me.DTO.AdminDTO;
import com.me.DTO.DeptDTO;

public interface AdService {
	
	public AdminDTO epogin(AdminDTO adto);

	public ArrayList<AdminDTO> epinfo();
}
