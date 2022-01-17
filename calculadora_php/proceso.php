<?php
    function sumar(float $n1, float $n2) {
        return $n1 + $n2;
    };

    function restar(float $n1, float $n2) {
        return $n1 - $n2;
    };

    function multiplicar(float $n1, float $n2) {
        return $n1 * $n2;
    };

    function dividir(float $n1, float $n2) {
        if ($n2 == 0) {
            echo "Error, no se puede dividir entre 0";
            return 0;
        } else {
            return $n1 / $n2;
        }
    };


    function menu(){
        echo "1. Sumar\n";
        echo "2. Restar\n";
        echo "3. Multiplicar\n";
        echo "4. Dividir\n";
    }

    function calcular($opcion, float $n1, float $n2) {
        switch ($opcion) {
            case 1:
                return sumar($n1, $n2);
                break;
            case 2:
                return restar($n1, $n2);
                break;
            case 3:
                return multiplicar($n1, $n2);
                break;
            case 4:
                return dividir($n1, $n2);
                break;
            default:
                return "Opcion no valida";
                break;
        }
    }

    function mostrar() {
        $opcion = $_REQUEST['opcion'];
        $num1 = $_REQUEST['num1'];
        $num2 = $_REQUEST['num2'];

        echo "Resultado: ".calcular($opcion, $num1, $num2);
    }

    mostrar();
?>