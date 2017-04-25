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


<html:form action="/creditSubmit" method="post" >

<div class="container">
<table>
<caption ><h1>Credit Window</h1></caption>
<tr><td colspan="2"><html:errors/></td></tr>
<tr>
<td><label for="fname">In Account Of</label></td>
<td>
<html:select property="inAccount" >
<html:option value="0">Select Account</html:option>
<html:optionsCollection name="creditForm" property="accountOptions" />
</html:select></td>
</tr>

<tr>
<td><label for="fname">Enter Credit Amount (Rs.)</label></td>
<td colspan="2"><html:text property="amount" ></html:text></td>
</tr>

<tr>
<td><label for="fname">Credit Against</label></td>
<td colspan="2"><html:text property="note"></html:text></td>
</tr>

<tr>
<td><label for="fname">Credit Date</label></td>
<td colspan="2"><html:text property="date"></html:text></td>
</tr>

<tr>
  <td colspan="2" align="center"><html:submit value="Credit"></html:submit></td>
  </tr>
</table>
</div>

</html:form>
</body>

</html>