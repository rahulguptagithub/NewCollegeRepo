<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<div class="body-wrap">
    <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href=/CollegeProject>Home</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Results</a></li>
            <li><a href="/CollegeProject/jsp/ShowImageGallery.jsp">Image Gallery</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Procedure <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="/CollegeProject/jsp/ShowAdmissionProcedure.jsp">Admission</a></li>
                <li><a href="/CollegeProject/jsp/ShowLabs.jsp">Labs</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>
                <li class="divider"></li>
                <li><a href="#">One more separated link</a></li>
              </ul>
            </li>
          </ul>

          <ul class="nav navbar-nav navbar-right">
            <li><a href="/CollegeProject/jsp/ShowAbout.jsp">About Us</a></li>
            <li><a href="/CollegeProject/jsp/ShowLogin.jsp">Login</a></li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>
              </ul>
            </li>
          </ul>
        </div>
        
      </div>
    </nav>
  </div>
  <div style="margin-top: -20px;margin-bottom: 10px;">
		<marquee bgcolor="#66CD00">Admission of current session
			2017-2019 is going on..Kindly visit us</marquee>
	</div>
