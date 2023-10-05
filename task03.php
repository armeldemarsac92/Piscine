<?php
    function get_shortest(array $arr1) {
        $length = 5000000;
        $to_print = "";
        foreach ($arr1 as $word) {
            if (strlen($word) < $length) {
                $length = strlen($word);
                $to_print = $word;
            }
        }
        return($to_print);
    }
?>