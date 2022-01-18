<?php

    /**
     * @param float $n1
     * @param float $n2
     * 
     * @return [float] Devuelve la suma de 2 numeros
     */
    function sumar(float $n1, float $n2) {
        return $n1 + $n2;
    };

    /**
     * @param float $n1
     * @param float $n2
     * 
     * @return [float] Devuelve la resta de 2 numeros
     */
    function restar(float $n1, float $n2) {
        return $n1 - $n2;
    };

    /**
     * @param float $n1
     * @param float $n2
     * 
     * @return [float] Devuelve la multiplicacion de 2 numeros
     */
    function multiplicar(float $n1, float $n2) {
        return $n1 * $n2;
    };

    /**
     * @param float $n1
     * @param float $n2
     * 
     * @return [float] Devuelve la division de 2 numeros
     */
    function dividir(float $n1, float $n2) {
        if ($n2 == 0) {
            echo "Error, no se puede dividir entre 0";
            return 0;
        } else {
            return $n1 / $n2;
        }
    };


    /**
     * Funcion que muestra un menu de opciones
     */
    function menu(){
        echo "1. Sumar\n";
        echo "2. Restar\n";
        echo "3. Multiplicar\n";
        echo "4. Dividir\n";
    }

    /**
     * @param int $opcion
     * @param float $n1
     * @param float $n2
     * 
     * @return [void] Realiza los calculos segun la opcion elegida
     */
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

    /**
     * Muestra el resultado de la operacion elegida
     */
    function mostrar() {
        $opcion = $_REQUEST['opcion'];
        $num1 = $_REQUEST['num1'];
        $num2 = $_REQUEST['num2'];

        echo "Resultado: ".calcular($opcion, $num1, $num2);
    }

    mostrar();
?>