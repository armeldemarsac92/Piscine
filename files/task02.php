<?php
    header("Content-Type: application/json");
    $name = $_GET["name"];
    $email = $_GET["email"];
    $data_array = array("name" => $name);
    if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $data_array["email"] = true;
        echo json_encode($data_array);
    } else {
        http_response_code(400);
        $data_array["email"] = false;
        echo json_encode($data_array);
    }

?>