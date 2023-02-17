package com.example.service;

import com.example.dto.MemberDto;

import java.util.List;

public interface MemberService {

    public List<MemberDto> memberList(MemberDto param) throws Exception;
    public MemberDto memberDetail(String memberId) throws Exception;
    public int memberDupCheck(String memberId) throws Exception;
    public int memberInsert(MemberDto param) throws Exception;
    public int memberUpdate(MemberDto param) throws Exception;
    public int memberDelete(MemberDto param) throws Exception;

}
