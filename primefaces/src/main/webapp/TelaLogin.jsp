
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>

<title>Sucata Zero</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="css/styles.css" rel="stylesheet" />

<script>
	function focar() {
		document.getElementById("usuario").focus();
	}
</script>

</head>
<body>
	<form action="j_spring_security_check" method="post">
		<section class="login-block">
		<div class="container">
			<div class="row">
				<div class="col-md-4 login-sec">

					<div class="SignupForm">
						<h2 class="text-center">Login</h2>

						<div class="form-group">
							<label for="exampleInputEmail1" class="text-uppercase">Usuário</label>
							<input type="text" id="usuario" name="j_username" class="form-control"  />
							

						</div>
						<div class="form-group">
							<label for="exampleInputPassword1" class="text-uppercase">Senha</label>
							<input name="j_password" type="password" class="form-control" /> 
							
						</div>


						<div class="form-check">
							<label class="form-check-label"> <input type="checkbox"
								class="form-check-input"> <small>Lembra-Me</small>
								<p></p>
							</label>

						</div>
						<input class="btn btn-primary" type="submit" value="Entrar" />
						

					</div>
				</div>
				<div class="col-md-8 banner-sec">
					<div id="carouselExampleIndicators" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#carouselExampleIndicators" data-slide-to="0"
								class="active"></li>
							<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
							<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
						</ol>
						<div class="carousel-inner" role="listbox">
							<div class="carousel-item active">
								<img class="d-block img-fluid"
									src="https://www.siembra.com.br/img/noticias/grande/41de3e9555d987c82fd1e12e3c750718.png"
									alt="First slide">
								<div class="carousel-caption d-none d-md-block">
									<div class="banner-text">
										<h2>Bem Vindo ao Sucata Zero</h2>
										<p></p>
									</div>
								</div>
							</div>
							<div class="carousel-item">
								<img class="d-block img-fluid"
									src="http://jorgequadros.com.br/wp-content/uploads/2017/08/maxresdefault-9.jpg"
									alt="First slide">
								<div class="carousel-caption d-none d-md-block">
									<div class="banner-text">
										<h2>Faça doações e ganhe descontos</h2>
										<p>Com o Sucata Zero você pode acumular descontos no seu
											IPTU</p>
									</div>
								</div>
							</div>
							<div class="carousel-item">
								<img class="d-block img-fluid"
									src="https://www.multpainel.com.br/blog/wp-content/uploads/2018/05/Multpainel-logistica-reversa-reciclagem.jpg"
									alt="First slide">
								<div class="carousel-caption d-none d-md-block">
									<div class="banner-text">
										<h2>Cadastre o que você não usa mais</h2>
										<p>Acompanhe o andamento de suas doações</p>
									</div>
								</div>
							</div>
						</div>

					</div>

				</div>
			</div>
		</section>
</body>
</html>