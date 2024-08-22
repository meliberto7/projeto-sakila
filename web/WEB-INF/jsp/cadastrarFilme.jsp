<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <title>Cadastro de Filme</title>
    </head>
    <body>
        <h1>Cadastre um Filme</h1>

        <a href="./sakila">Voltar</a>

        <br><br>

        <form action="./cadastrarFilme" method="post">

            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" name="titulo" placeholder="Título">
                <label for="floatingInput">Título</label>
              </div>
              <div class="form-floating mb-3">
                  <input type="text" class="form-control" id="floatingPassword" name="descricao" placeholder="Descrição">
                <label for="floatingInput">Descrição</label>
              </div>
              <div class="form-floating mb-3">
                <input type="number" class="form-control" id="floatingPassword" name="ano" placeholder="Ano">
                <label for="floatingInput">Ano</label>
              </div> 
              <div>
                <button type="submit">Salvar</button>
              </div>

        </form>
   

    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>
