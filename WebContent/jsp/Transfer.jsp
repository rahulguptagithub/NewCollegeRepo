<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html>
<head>

<style>
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


</head>


<body>



<html:form action="/transferSubmit" method="post" >
<div class="container">
<table>
<caption ><h1>Money Transfer Window</h1></caption>
<tr><td colspan="4" align="center"><html:errors/></td></tr>
<tr>
<td><label for="fname">From</label></td>
<td>
<html:select property="fromAccount" >
<html:option value="0">Account From</html:option>
<html:optionsCollection name="transferForm" property="accountOptions" />
</html:select></td>

<td align="center"><label for="fname">To</label></td>
<td>
<html:select property="toAccount" >
<html:option value="0">Select Account</html:option>
<html:optionsCollection name="transferForm" property="accountOptions" />
</html:select></td>

</tr>
<!-- label="countryName" value="countryId" --> 
<tr>
<td><label for="fname">Enter Amount To Transfer (Rs.)</label></td>
<td ><html:text property="trsfrAmount"></html:text></td>

<td><label for="fname">Transfer Against</label></td>
<td ><html:text property="note"></html:text></td>
</tr>

<tr>
  <td colspan="4" align="center"><html:submit value="Transfer"></html:submit></td>
  </tr>
</table>
</div>

</html:form>
</body>

</html>