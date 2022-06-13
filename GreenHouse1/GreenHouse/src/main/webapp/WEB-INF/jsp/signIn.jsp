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
					<a class="nav-link active" href="/signUp">Sign Up</a>
				</nav>
			</div>
		</header>

		<main role="main" class="inner cover">
			<h1 class="cover-heading">Welcome to Suzys Grocer!!!</h1>
			<form:form modelAttribute="user" action="signIn" method="post">
				<div class="form-group col-md-6">
					<label for="inputName">Email</label>
					<form:input path="email" type="text" class="form-control" id="intputMake" />
				</div>
				<div class="form-group col-md-6">
					<label for="inputName">Password</label>
					<form:input path="password" type="password" class="form-control" id="intputMake" />
				</div>
				<form:button type="submit" class="btn btn-primary">Submit</form:button>
				<c:if test="${error != null}">
					<p style="color:red">${error}</p>
				</c:if>
			</form:form>
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
