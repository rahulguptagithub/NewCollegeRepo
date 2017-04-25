
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


/*Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
</head>
<body>

<html:form action="/feeStructureSubmit">
  <div class="container">
  <table >
  <caption><h2>Fee Structure Setting Window</h2></caption>
  
  
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
  <td><font size="3" color="red"><html:errors property="session"/></font></td>
  <td>Select Trade</td>
  <td ><html:select property="trade">
  <html:option value="Select"></html:option>
  <html:option value="Fitter"></html:option>
  <html:option value="Electrical"></html:option>
  </html:select>
  </td>
  <td><font size="3" color="red"><html:errors property="trade"/></font></td>
 </tr>
  <%-- <tr>
  <td>Enter Session</td>
  <td><html:text property="session"></html:text></td>
  <td><font size="3" color="red"><html:errors property="session"/></font></td>
  <td>Enter Trade</td>
  <td><html:text property="trade"></html:text></td>
  <td><font size="3" color="red"><html:errors property="trade"/></font></td>
  </tr> --%>
  
  <tr>
  <td>Select Duration</td>
  <td ><html:select property="duration">
  <html:option value="Select"></html:option>
  <html:option value="1 year"></html:option>
  <html:option value="2 year"></html:option>
  <html:option value="3 year"></html:option>
  <html:option value="4 year"></html:option>
  </html:select>
  <td><font size="3" color="red"><html:errors property="duration"/></font></td>
  </td>
  <td>Enter Admission Fee</td>
  <td><html:text property="admission_fee"></html:text></td>
  <td><font size="3" color="red"><html:errors property="admission_fee"/></font></td>
  </tr> 
  
 
 
  <tr>
  <td>Enter Examination Fee</td>
  <td><html:text property="exam_fee"></html:text></td>
  <td><font size="3" color="red"><html:errors property="exam_fee"/></font></td>
  <td>Enter Full Course/Tuition Fee</td>
   <td><html:text property="tution_fee"></html:text></td>
   <td><font size="3" color="red"><html:errors property="tution_fee"/></font></td>
  </tr>
  
  <tr>
  <td>Enter Development Charge</td>
  <td><html:text property="development_fee"></html:text></td>
  <td><font size="3" color="red"><html:errors property="development_fee"/></font></td>
   <td>Enter Caution Money </td>
  <td><html:text property="caution_money"></html:text></td>
  <td><font size="3" color="red"><html:errors property="caution_money"/></font></td>
  </tr>
  
   <tr>
  <td>Enter Miscellaneous Charge</td>
  <td><html:text property="misc_fee"></html:text></td>
  <td><font size="3" color="red"><html:errors property="misc_fee"/></font></td>
  <td>Enter Poor Boy fund</td>
  <td><html:text property="poor_boy_fund"></html:text></td>
  <td><font size="3" color="red"><html:errors property="poor_boy_fund"/></font></td>
  </tr>
 
  <tr>
  <td colspan="4" align="center"><html:submit value="Submit"></html:submit></td>
  </tr>
  </table>
  </div>
</html:form>
 </body>
</html>
