<?php
function sequence($iteration) {
    $numbers = array(1);
    if ($iteration == 0) {
        echo implode("", $numbers) . PHP_EOL;
        return;
    }
    for ($i = 0; $i < $iteration; $i++) {
        $new_sequence = array();
        $prev_number = $numbers[0];
        $count = 1;

        for ($j = 1; $j < count($numbers); $j++) {
            if ($numbers[$j] == $prev_number) {
                $count++;
            } else {
                array_push($new_sequence, $count);
                array_push($new_sequence, $prev_number);
                $prev_number = $numbers[$j];
                $count = 1;
            }
        }

        array_push($new_sequence, $count);
        array_push($new_sequence, $prev_number);
        
        echo implode("", $new_sequence) . PHP_EOL;
        $numbers = $new_sequence;
    }
}

?>