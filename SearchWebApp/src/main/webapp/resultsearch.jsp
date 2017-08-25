<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="/struts-tags" prefix="form"%>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta name="viewport" content="user-scalable=0, width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<title>Search Engine</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<link rel="stylesheet" type="text/css" href="css/mobile.css">
		<script type='text/javascript' src='js/mobile.js'></script>
	</head>
	<div id="header">
		<h1><a href="home">Search Engine</a></h1>
		<ul id="navigation">
			<li class="current">
				<a href="home">Home</a>
			</li>
			<li>
				<a href="loadaction">Load Data</a>
			</li>
		</ul>
	</div>
	<div id="body">
		<div id="tagline">
			<h1>Records found</h1>
			 <br/>
			 <s:textarea name="results" col="200" rows="1000" style="width: 400px; height: 300px;overflow-y: auto;" />
			 <br/>
			 <a href="home">BACK</a>
		</div>
		<img src="images/lady-in-yoga.jpg" alt="lady doing yoga" class="figure">
	</div>
	<div id="footer">
		<div>
			<span>123 St. Edmonton, AB | 780-999-9999</span>
			<p>
				&copy; Jorge Zavala
			</p>
		</div>
	</div>
	</body>
</html>
