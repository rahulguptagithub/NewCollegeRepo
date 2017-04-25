<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<title>Fee Structure</title>
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

<html:form action="/generateFeeStructureSubmit" method="post" enctype="multipart/form-data">

<div class="container">
<table>
<caption ><h1>Fee Structure Creation Window</h1></caption>
<tr><td colspan="4"><hr color="#ff9933"></td></tr>
<tr><td colspan="4" align="center">Basic Information</td></tr>
<tr><td colspan="4"><hr color="green"></td></tr>
<tr>
<td><label for="fname">Select Trade</label></td>
<td ><html:select property="trade">
  <html:option value="Select Trade"></html:option>
  <html:option value="Fitter"></html:option>
  <html:option value="Electrical"></html:option>
  </html:select>
</tr>

<tr>
<td><label for="fname">Select Session</label></td>
<td ><html:select property="session">
  <html:option value="Select"></html:option>
  <html:option value="2017-2019"></html:option>
  <html:option value="2019-2021"></html:option>
  <html:option value="2021-2023"></html:option>
  <html:option value="2023-2025"></html:option>
  <html:option value="2025-2027"></html:option>
  <html:option value="2027-2029"></html:option>
  <html:option value="2029-2031"></html:option>
  <html:option value="2031-2033"></html:option>
  <html:option value="2033-2035"></html:option>
  <html:option value="2035-2037"></html:option>
  <html:option value="2037-2039"></html:option>
  <html:option value="2039-2041"></html:option>
  <html:option value="2041-2043"></html:option>
  <html:option value="2043-2045"></html:option>
  </html:select>
  </td>
</tr>
<tr>
  <td colspan="4" align="center"><html:submit value="Create"></html:submit></td>
  </tr>
</table>
</div>

</html:form>


</body>
</html>
