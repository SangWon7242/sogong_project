package com.ysj.sogong.domain.member.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MemberForm
{
  @Size(min = 2, max = 30)
  @NotEmpty(message = "아이디를 입력해주세요")
  private String username;

  @Size(min = 4, max = 30)
  @NotEmpty(message = "비밀번호를 입력해주세요")
  private String password;

  @Size(min = 4, max = 30)
  @NotEmpty(message = "확인 비밀번호를 입력해주세요")
  private String passwordConfirm;

  private boolean checkUsername;
}
