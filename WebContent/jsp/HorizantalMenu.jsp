<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html>
<head>
<!-- <style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 25px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style> -->


<style>
body {margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 1000px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 1000px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }

}
</style>

</head>
<body>
<!-- <h3> <a href="index.jsp" class="button">Home</a>   <a href="index.jsp"" class="button">About</a>  <a href="index.jsp"" class="button">Course</a>    <a href="index.jsp" class="button">Result</a>    <a href="index.jsp" class="button">Admission</a>    <a href="index.jsp" class="button">Contact Us</a>    <a href="index.jsp" class="button">Gallery</a>   <a href="index.jsp" class="button">Placement</a>   </h3> -->
<body>

<div class="topnav" id="myTopnav">
  <a href="index.jsp">Home</a>
  <a href="ShowAbout.jsp">About Us</a>
  <a href="index.jsp">Course</a>
  <a href="index.jsp">Result</a>
  <a href="index.jsp">Admission</a>
  <a href="index.jsp">Contact Us</a>
  <a href="index.jsp">Gallery</a>
  <a href="index.jsp">Placement</a>
  <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
</div>

<!-- <div style="padding-left:16px">
  <h2>Responsive Topnav Example</h2>
  <p>Resize the browser window to see how it works.</p>
</div> -->

<script>
function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }
}
</script>





<marquee bgcolor="#66CD00">Result of all stream has been announced kindly visit to Result section..</marquee>
</body>
</html>