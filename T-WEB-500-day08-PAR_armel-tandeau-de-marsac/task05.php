<?php
    function calc_average ($array) {
        $value = 0;
        foreach ($array as $number) {
            $value = $value + $number;
        }
        $value = $value / count($array);
        return round($value,1);
    }
?>