package com.example.service.impl;

import com.example.dao2.MemberDao;
import com.example.dto.MemberDto;
import org.springframework.stereotype.Service;
import com.example.service.MemberService;

import javax.annotation.Resource;
import java.util.List;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

    @Resource(name = "memberDao") MemberDao memberDao;

    @Override
    public List<MemberDto> memberList(MemberDto param) throws Exception {
        List<MemberDto> lists = memberDao.memberList(param);
        return memberDao.memberList(param);
    }

    @Override
    public MemberDto memberDetail(String memberId) throws Exception {
        return memberDao.memberDetail(memberId);
    }

    @Override
    public int memberInsert(MemberDto param) throws Exception {
        return memberDao.memberInsert(param);
    }

    @Override
    public int memberUpdate(MemberDto param) throws Exception {
        return memberDao.memberUpdate(param);
    }

    @Override
    public int memberDelete(MemberDto param) throws Exception {
        return memberDao.memberDelete(param);
    }
}
