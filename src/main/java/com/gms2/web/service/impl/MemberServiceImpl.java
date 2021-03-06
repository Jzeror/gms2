package com.gms2.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms2.web.domain.MemberDTO;
import com.gms2.web.mapper.MemberMapper;
import com.gms2.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper memberDAO;
	@Override
	public void add(MemberDTO p) {
        p.setAge(String.valueOf(Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()).substring(2,4))-Integer.parseInt(p.getSsn().substring(0,2))+101));
		p.setGender((p.getSsn().substring(7).equals("1")||p.getSsn().split("-")[1].equals("3"))?"남자":"여자");
        memberDAO.insert(p);
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		return memberDAO.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MemberDTO member) {
		memberDAO.delete(member);
		
	}

	@Override
	public MemberDTO login(MemberDTO member) {
		return memberDAO.login(member);
	}
}
