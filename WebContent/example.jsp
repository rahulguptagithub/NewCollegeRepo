
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

 Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
 
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
 
</style>
<body>
 
<table width = "100%" height = "100%" >
<tr bgcolor="#ff9933" height = "10%">
<td width = "20%" align="center">
<tiles:insert attribute ="LOGO"/>
</td>
<td  width = "1%" align="center">
<tiles:insert attribute ="NAME"/>
</td>
</tr>

<tr height = "3%">
<td colspan="2" align="left">
<tiles:insert attribute ="HMENU"/>
</td>

</tr>
<tr height = "77%">
			<td width="20%" align="left"><tiles:insert attribute="LMENU" />
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
