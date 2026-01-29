package com.ysj.sogong.global.init.boardClass;

import com.ysj.sogong.domain.board.boardClass.entity.BoardClass;
import com.ysj.sogong.domain.board.boardClass.service.BoardClassService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"test", "dev", "prod"})
@Configuration
public class InitBoardClass
{
  @Bean
  CommandLineRunner commandLineRunnerBoardClass(BoardClassService boardClassService)
  {
    return args -> {
      boardClassService.createBoardClass(new BoardClass("class1"));
    };
  }
}
