<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css"> -->

<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-1.9.1.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">


<!-- <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen"> -->
<link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet"
	media="screen">
<script src="js/bootstrap-datetimepicker.min.js"></script>

</head>
<body>
	<div class="navbar-inverse">
		<div class="col-md-12"></div>
		<tiles:insert attribute="LOGO" />
	</div>
	<tiles:insert attribute="HMENU" />
	<div class="col-md-12">
		<div class="col-md-2">
			<tiles:insert attribute="LMENU" />
		</div>
		<div class="col-md-10">
			<tiles:insert attribute="BODY">
			</tiles:insert>
		</div>
	</div>
	
	
		<div class="col-md-12">
		<tiles:insert attribute="FOOTER" />
	</div>
	<script type="text/javascript">
		$('ul.nav li.dropdown').hover(
				function() {
					$(this).find('.dropdown-menu').stop(true, true).delay(200)
							.fadeIn(500);
				},
				function() {
					$(this).find('.dropdown-menu').stop(true, true).delay(200)
							.fadeOut(500);
				});
		
		$('.form_date').datetimepicker({

			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	
		
	</script>
</body>
</html>