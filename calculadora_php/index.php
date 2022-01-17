<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora PHP</title>
</head>
<body>
    <h1>Calculadora</h1>
    Escoge una opcion:
    <br>
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    
    <br><br>
    <form action="proceso.php" method="post">
        <label>Opcion: </label>
        <input type="text" name="opcion"><br>

        <label>Numero1: </label>
        <input type="text" name="num1"><br>

        <label>Numero2: </label>
        <input type="text" name="num2"><br><br>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>