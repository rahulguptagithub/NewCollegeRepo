
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

/* Change styles for span and cancel button on extra small screens */
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
<body>

<%-- <html:form action="/feeReceiptSubmit">
<html:submit value="Create"></html:submit>
</html:form> --%>
 
 
 
 

<html:form action="/createSubmit">
  <div class="container">
  <table >
  <caption><h2>New User Creation Window</h2></caption>
  <tr>
  <td>Enter User Name</td>
  <td><html:text property="username"></html:text></td>
  <td><font size="3" color="red"><html:errors property="username"/></font></td>
  </tr>
 
  <tr>
   <td>Enter Password</td>
  <td><html:password property="password"></html:password></td>
  <td><font size="3" color="red"><html:errors property="password"/></font></td>
  </tr>
  
   <tr>
   <td>Enter Confirm Password</td>
   <td><html:text property="cpassword"></html:text></td>
   <td><font size="3" color="red"><html:errors property="cpassword"/></font></td>
  </tr>
  
  <tr>
  <td>Enter Mobile No.</td>
  <td><html:text property="mobileno"></html:text></td>
  <td><font size="3" color="red"><html:errors property="mobileno"/></font></td>
  </tr>
  
  <tr>
  <td>Enter Email Id</td>
  <td><html:text property="email"></html:text></td>
  <td><font size="3" color="red"><html:errors property="email"/></font></td>
  </tr>
  
  <tr>
  <td>User Role</td>
  <td><html:select property="role">
  <html:option value="Select"></html:option>
  <html:option value="Admin"></html:option>
  <html:option value="User"></html:option>
  <td><font size="3" color="red"><html:errors property="role"/></font></td>
  </html:select></td>
  </tr>
  
  <tr>
  <td>User Status</td>
  <td ><html:select property="status">
  <html:option value="Select"></html:option>
  <html:option value="Active"></html:option>
  <html:option value="Inactive"></html:option>
  <td><font size="3" color="red"><html:errors property="status"/></font></td>
  </html:select></td>
  </tr>
  
  <tr>
  <td colspan="3"><html:submit value="Create"></html:submit></td>
  </tr>
  </table>
  </div>
</html:form>
 </body>
</html>
