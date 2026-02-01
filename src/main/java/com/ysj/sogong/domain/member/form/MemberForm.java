package com.ysj.sogong.domain.member.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MemberForm
{
  @NotEmpty
  private String username;

  @NotEmpty
  private String password;

  @NotEmpty
  private String passwordConfirm;
}
