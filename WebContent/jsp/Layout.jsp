<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<html>
<head>
</head>
<body>
<table width = "100%" height = "100%" >
<tr bgcolor="#ff9933" height = "10%">
<td width = "20%" align="center">
<tiles:insert attribute ="LOGO"/>
</td>
<td  width = "80%" align="center">
<tiles:insert attribute ="NAME"/>
</td>
</tr>

<tr height = "3%">
<td colspan="2" align="left">
<tiles:insert attribute ="HMENU"/>
</td>

</tr>
<tr height = "77%">
<td width ="20%" align="left">
<tiles:insert attribute ="LMENU"/>
</td>
<td width ="80%" align="center">
<tiles:insert attribute ="BODY">  </tiles:insert>
</td>
</tr>

<tr height = "10%">
<td colspan="2" align="center">
<tiles:insert attribute ="FOOTER"/>
</td>
</tr>
</table>
</body>
</html>