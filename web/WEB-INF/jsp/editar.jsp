

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Editar filme</title>
    </head>
    <body>
        <form action="./editar?filme=${filme}" method="post" class="container">
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Título</span>
                <input type="text" class="form-control" value="${titulo}" name="titulo" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
              </div>
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Descrição</span>
                <input type="text" class="form-control" value="${descricao}" name="descricao" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
              </div>
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Ano</span>
                <input type="text" class="form-control" value="${ano}" name="ano" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
              </div>
              <button type="submit">Salvar</button>
        </form>
        
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
