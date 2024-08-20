
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista dos Filmes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="./Styles/style.css">

    </head>
    <body>

        <h1>Listagem dos Filmes</h1>

        <a href="./sakila">Voltar</a>
        <br>
        <br>
        
            <table border="1px">
            <thead>
                <th>
                    <td>Id</td>
                    <td>Título</td>
                    <td>Descrição</td>
                    <td>Ano</td>
                    <td>Ações</td>
                </th>
            </thead>
            <tbody>
                <c:forEach begin="1000" var="filme" items="${filmes}">
                <tr>
                    <td></td>
                    <td>${filme.id_filme}</td>
                    <td>${filme.titulo}</td>
                    <td>${filme.descricao}</td>
                    <td>${filme.ano}</td>
                    <td>
                        <a class="apadrao" href="./editar?filme=${filme.id_filme}">
                            <button class="buttonEditar">Editar</button>
                        </a>
                        <button class="buttonExcluir">Excluir</button>
                        
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
