package com.me.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.DTO.MbCriteria;
import com.me.DTO.MemberDTO;
import com.me.Mapper.MemberDAO;

@Service
public class MeServiceImpl implements MeService {

	@Autowired
	MemberDAO mdao;
	
	public void mwrite(MemberDTO mdto) {
		System.out.println("serviceImpl check=" + mdto);
		mdao.mwrite(mdto);
	}

	public ArrayList<MemberDTO> meinfo(MbCriteria mcri) {
		
		return mdao.meinfo(mcri);
	}

	public MemberDTO mdetail(MemberDTO mdto) {

		return mdao.mdetail(mdto);
	}

	public void mupdate(MemberDTO mdto) {

		mdao.mupdate(mdto);
		
	}

	public void mdelete(MemberDTO mdto) {
		
		mdao.mdelete(mdto);
		
	}

	public int getResult() {
		return mdao.getResult();
	}
}




