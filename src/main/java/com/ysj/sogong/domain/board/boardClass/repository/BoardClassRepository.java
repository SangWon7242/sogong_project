package com.ysj.sogong.domain.board.boardClass.repository;

import com.ysj.sogong.domain.board.boardClass.entity.BoardClass;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardClassRepository extends JpaRepository<BoardClass, Integer>
{
  BoardClass findById(int id);
}
