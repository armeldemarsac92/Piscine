<?php
    header("Content-Type: application/json");
    $name = $_GET["name"];
    $name_array = array("name" => $name);
    echo json_encode($name_array);
?>