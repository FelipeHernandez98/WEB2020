<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Registro de Tienda</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/registro.css">
</head>
<body>
   <div class="container-fluid">
  <div class="row no-gutter">
    <div class="d-none d-md-flex col-md-4 col-lg-6 bg-image"></div>
    <div class="col-md-8 col-lg-6">
      <div class="login d-flex align-items-center py-5">
        <div class="container">
          <div class="row">
            <div class="col-md-9 col-lg-8 mx-auto">
              <h3 class="login-heading mb-4">Registro de Tienda</h3>
              <form action="register_shop" method="post">
              
                <div class="form-label-group">
                  <input type="text" id="inputNombre" name="nombre" class="form-control" placeholder="Nombre" required autofocus>
                  <label for="inputNombre">Nombre</label>
                </div>
                
                <div class="form-label-group">
                  <input type="text" id="inputLema" class="form-control" name="lema" placeholder="Lema" required autofocus>
                  <label for="inputLema">Lema</label>
                </div>

                <div class="form-label-group">
                  <input type="text" id="inputDescripcion" class="form-control" name="descripcion" placeholder="Descripcion" required>
                  <label for="inputDescripcion">Descripcion</label>
                </div>
                
                <div class="form-label-group">
                  <input type="text" id="inputEmail" class="form-control" name="email" placeholder="Email" required>
                  <label for="inputEmail">Email</label>
                </div>
                
                <div class="form-label-group">
                  <input type="text" id="inputClave" class="form-control" name="clave" placeholder="Clave" required>
                  <label for="inputClave">Clave</label>
                </div>
                
                 <div class="form-label-group">
                  <input type="text" id="inputPropietario" class="form-control" name="propietario" placeholder="Propietario" required>
                  <label for="inputPropietario">Propietario</label>
                </div>
                
                <div class="form-label-group">
                  <input type="text" id="inputFacebook" class="form-control" name="facebook" placeholder="Facebook" required>
                  <label for="inputFacebook">Facebook</label>
                </div>
                
                 <div class="form-label-group">
                  <input type="text" id="inputWeb" class="form-control" name="web" placeholder="Pagina Web" required>
                  <label for="inputWeb">Pagina Web</label>
                </div>
                
                 <div class="form-label-group">
                  <input type="text" id="inputImagen" class="form-control" name="imagen" placeholder="URL Imagen" required>
                  <label for="inputImagen">Imagen</label>
                </div>

              
               
                
                <button class="btn btn-lg btn-primary btn-block btn-login text-uppercase font-weight-bold mb-2" type="submit">Registrar</button>

              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>