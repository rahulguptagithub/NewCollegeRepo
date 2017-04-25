<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
${message}
<html:form action="/feeReceiptSubmit">
<html:hidden property="filename" value="${file}"/>
<html:submit value="Dowload"></html:submit>
</html:form>
</body>
</html>