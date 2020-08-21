<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mediatheque</title>
</head>
<body>
	<h1>Bienvenue dans ma ${mediatheque.type.nom}</h1>
	<h2>Ajout d'un ${mediatheque.type.media}</h2>
	
	<form action = "AjoutServlet" method="post">
		Nom : <input type = "text" name ="nom"> <br>
		Titre : <input type = "text" name ="titre"> <br>
		<input type = "submit" name ="ajout"> <br>
	</form>
	
	<br>
	<a href="MediathequeServlet">Retour</a>
</body>
</html>