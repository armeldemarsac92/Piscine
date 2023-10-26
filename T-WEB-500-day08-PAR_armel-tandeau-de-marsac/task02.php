<?php
    function dog_bark (int $woof_nb) {
        $woofs = array();
        for ($i = 0; $i < $woof_nb;$i++){
            array_push($woofs,"woof"," ");
        }
        array_push($woofs,"\n");
        return(implode("",$woofs));
}
?>