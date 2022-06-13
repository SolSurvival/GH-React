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
				<h3 class="masthead-brand">Welcome to Suzys!</h3>
				<nav class="nav nav-masthead justify-content-center">
					<a class="nav-link active" href="/">Home</a>
				</nav>
			</div>
		</header>

		<main role="main" class="inner cover">
			<h1 class="cover-heading">Add Item to your Cart!!!</h1>
			<table>
				<tr>
				    <th>Name</th>
				    <th>Cost</th>
				    <th>Category</th>
				    <th>Quantity in Stock</th>
				    <th>Amount adding to Cart</th>
				</tr>
			
				<form:form modelAttribute="cartItem" action="/addItemToCart/${loggedInUser.id}/${productId}" method="post">
					<tr>
					    <td>${product.name}</td>
					    <td>${product.cost}</td>
					    <td>${product.category}</td>
					    <td>${product.quantity}</td>
					    <td>
						    <label for="inputName">Quantity Needed</label>
							<form:input path="quantityOfProduct" type="number" class="form-control" id="intputMake" />
					    </td>
					</tr>
					<form:button type="submit" class="btn btn-primary">Submit</form:button>
				</form:form>
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
