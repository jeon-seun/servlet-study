<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>
<p>신규 회원으로 가입하기 위해 사용할 아이디와 비밀번호를 입력하십시오.</p>
<form action="/signup" method="post">
    <label for="username">아이디</label>
    <input id="username" type="text" name="username"/>
    <label for="password">비밀번호</label>
    <input id="password" type="password" name="password"/>
    <input type="submit" value="회원가입">
</form>
</body>
</html>
