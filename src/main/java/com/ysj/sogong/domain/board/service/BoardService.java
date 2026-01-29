package com.ysj.sogong.domain.board.service;

import com.ysj.sogong.domain.board.entity.Board;
import com.ysj.sogong.domain.board.repository.BoardRepository;
import com.ysj.sogong.global.security.dto.LoginedMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Principal;

@RequiredArgsConstructor
@Service
public class BoardService
{
  private final BoardRepository boardRepository;

  public Board createBoard(Board board, LoginedMember loginedMember)
  {
    board = Board.builder()
        .title(board.getTitle())
        .boardClassId(board.getBoardClassId())
        .username(loginedMember.getUsername())
        .build();

    return boardRepository.save(board);
  }
}
