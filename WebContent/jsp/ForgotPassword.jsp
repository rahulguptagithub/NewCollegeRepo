<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html>
<head>
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

</head>
<body>

<h2>Password Recovery Window</h2>
<html:form action="/forgotPwdSubmit">

  <div class="container">
  <table >
  
   <tr>
  <td colspan="3"><html:errors/></td>
  </tr>
  <tr>
  <td>Enter register mobile no.</td>
  <td><html:text property="mobileno"></html:text></td>
  <td><html:errors property="mobileno"/></td>
  </tr>
 
   <tr>
   <td colspan="3" align="center">OR</td>
   </tr>
 
  <tr>
  <td>Enter register email id</td>
  <td><html:text property="email"></html:text></td>
  <td><html:errors property="email"/></td>
  </tr>
  
  <tr>
  <td colspan="3" align="center"><html:submit value="Submit"></html:submit></td>
  </tr>
  </table>
  </div>
</html:form>



</body>
</html>