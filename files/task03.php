<?php
    error_reporting(E_ALL);
    ini_set('display_errors', 1); 
    header("Content-Type: application/json");
    if (isset($_GET["name"],$_GET["email"])){
        $name = $_GET["name"];
        $email = $_GET["email"];
        $data_array = array("name" => $name);
    }
    $action = $_GET["action"];

    switch($action) {
        case "get_countries" : {
            $json_file = file_get_contents("countries.json");
            $countries_data = json_decode($json_file,true);
            echo json_encode($countries_data);
            break;
        }
        case "get_personnal_infos" : {
            if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
                $data_array["email"] = true;
                echo json_encode($data_array);
            } else {
                http_response_code(400);
                $data_array["email"] = false;
                echo json_encode($data_array);
            }
        break;
        }
    }

?>