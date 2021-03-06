package com.gms2.web.mapper;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.gms2.web.domain.MemberDTO;

@Repository
public interface MemberMapper {
	public void insert(MemberDTO p) ;
	public List<?> selectList(Map<?,?> p) ;
	public List<?> selectSome(Map<?,?> p) ;
	public MemberDTO selectOne(MemberDTO p) ;
	public int count(Map<?,?> p) ;
	public void update(Map<?,?> p) ;
	public void delete(MemberDTO member) ;
	public MemberDTO login(MemberDTO member) ; 
}
