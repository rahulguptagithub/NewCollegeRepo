<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="common/commonHeader.jsp"></jsp:include>
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
	
	
	<%-- 	<div class="col-md-12">
		<tiles:insert attribute="FOOTER" />
	</div> --%>
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