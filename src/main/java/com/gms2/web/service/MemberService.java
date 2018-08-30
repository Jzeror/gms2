package com.gms2.web.service;

import java.util.List;
import java.util.Map;
import com.gms2.web.domain.MemberDTO;

public interface MemberService {
	public void add(MemberDTO p);
	public List<?> list(Map<?,?> p);
	public List<?> search(Map<?,?> p);
	public MemberDTO retrieve(MemberDTO p);
	public int count(Map<?,?> p);
	public void modify(MemberDTO member);
	public void remove(MemberDTO member);
	public MemberDTO login(MemberDTO p);
}
