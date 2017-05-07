<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
${message}
<html:form action="/DownloadAdmissionFormSubmit">
<html:hidden property="filename" value="${formName}"/>
<html:submit value="Dowload"></html:submit>
</html:form>
</body>
</html>