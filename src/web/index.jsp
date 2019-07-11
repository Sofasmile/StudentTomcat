<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
  <%--String isValid = (String) request.getAttribute("isValid");--%>
  <%--if (isValid != null) {--%>
    <%--response.getWriter().write("<div align=\"center\">");--%>
    <%--response.getWriter().print(isValid);--%>
    <%--response.getWriter().write("<div/>");--%>
  <%--}--%>
<%--%>--%>
<html>
  <head>
    <title>Registration</title>
  </head>
  <body>
  <div align="center">
    <form action="register" method="post">
      Email <input name="email" type="email" placeholder="Enter your email..."
                   value="<%= request.getParameter("email") == null ? "" : request.getParameter("email")%>"> <br>
      Password <input name="password" type="password"><br>
      Repeat password <input name="repeatPassword" type="password"><br>
      <button type="submit"> Register</button>
      <%--<button type="submit" formaction="users">Back to all users list</button>--%>
    </form>
  </div>
  </body>
</html>
