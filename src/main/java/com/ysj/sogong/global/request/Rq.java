package com.ysj.sogong.global.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Rq
{
  private HttpServletRequest req;
  private HttpServletResponse resp;

  public Rq(HttpServletResponse resp)
  {
    this.resp = resp;
    this.resp.setContentType("text/html; charset=UTF-8");
    this.resp.setCharacterEncoding("UTF-8");

    // 뒤로가기 시 캐시된 페이지를 보여주지 않도록 설정
    this.resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    this.resp.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    this.resp.setHeader("Expires", "0"); // Proxies.
  }

  /* html 관련 */

  private boolean print(String html)
  {
    try
    {
      resp.getWriter().print(html);
      return true;
    }
    catch (IOException e)
    {
      return false;
    }
  }

  public boolean printAlert(String content)
  {
    return print("""
        <script>
            alert('%s');
        </script>
        """.formatted(content));
  }
  
  public boolean replace(String url)
  {
    return print("""
        <script>
            location.replace('%s');
        </script>
        """.formatted(url));
  }
}
