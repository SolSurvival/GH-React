<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>Suzys Grocer!!!</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="masthead mb-auto">
			<div class="inner">
				<h3 class="masthead-brand">View our great Listings</h3>
			</div>
		</header>

		<main role="main" class="inner cover">
			<table>
			  <tr>
			    <th>Name</th>
			    <th>Cost</th>
			    <th>Category</th>
			    <th>Quantity</th>
			    <th>Add to Cart</th>
			  </tr>
				<c:forEach var="product" items="${listOfProducts}">
		          <tr>
				    <td>${product.name}</td>
				    <td>${product.cost}</td>
				    <td>${product.category}</td>
				    <td>${product.quantity}</td>
				    <c:choose>
					  <c:when test="${loggedInUser != null}">
							<td>
					    		<a class="nav-link active" href="/addItemToCart/${loggedInUser.id}/${product.id}">Add</a>
						    </td>
					  </c:when>
					  <c:otherwise>
						<td>
							Must be Logged In
						</td>
					  </c:otherwise>
					</c:choose>
				    <td>
				    	
				    </td>
				  </tr> 
	            </c:forEach>
			</table>
		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>,
					by <a href="https://twitter.com/mdo">@mdo</a>.
				</p>
			</div>
		</footer>
	</div>


</body>

</html>
