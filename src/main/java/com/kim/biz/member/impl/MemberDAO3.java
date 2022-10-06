package com.kim.biz.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kim.biz.member.MemberVO;
@Repository("memberDAO")
public class MemberDAO3 {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVO vo) {
		System.out.println("마이바티스 insert");
		mybatis.insert("MemberDAO.insertMember",vo);
	}
	public void deleteMember(MemberVO vo) {
		System.out.println("마이바티스 delete");
		mybatis.delete("MemberDAO.deleteMember",vo);
	}
	public void updateMember(MemberVO vo) {
		System.out.println("마이바티스 update");
		mybatis.update("MemberDAO.updateMember",vo);
	}
	MemberVO selectOneMember(MemberVO vo) {
		System.out.println("마이바티스 selectOne");
		return mybatis.selectOne("MemberDAO.selectOneMember",vo);
	}
	public List<MemberVO> selectAllMember(MemberVO vo) {
		System.out.println("마이바티스 selectAll");
		return mybatis.selectList("MemberDAO.selectAllBoard",vo);
	}
}

