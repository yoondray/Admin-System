package com.me.Service;

import java.util.ArrayList;

import com.me.DTO.MbCriteria;
import com.me.DTO.MemberDTO;

public interface MeService {
	
	public void mwrite(MemberDTO mdto);
	
	public ArrayList<MemberDTO> meinfo(MbCriteria mcri);
	
	public MemberDTO mdetail(MemberDTO mdto);
	
	public void mupdate(MemberDTO mdto);
	
	public void mdelete(MemberDTO mdto);
	
	public int getResult();
	
}
