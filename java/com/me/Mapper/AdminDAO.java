package com.me.Mapper;

import java.util.ArrayList;

import com.me.DTO.AdminDTO;

public interface AdminDAO {
	
	public AdminDTO epogin(AdminDTO adto);
	
	public ArrayList<AdminDTO> epinfo();
}
