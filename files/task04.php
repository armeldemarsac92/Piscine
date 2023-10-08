<?php
    error_reporting(E_ALL);
    ini_set('display_errors', 1); 
    header("Content-Type: application/json");
    if (isset($_GET["brand"],$_GET["type"],$_GET["action"])){
        $brand = $_GET["brand"];
        $type = $_GET["type"];
        $action = $_GET["action"];
        $credentials_file = file_get_contents("credentials.json");
        $credentials = json_decode($credentials_file, true);
    }


    switch($action) {
        case "add_element" : {
            $sql_connection = new mysqli($credentials["servername"],$credentials["username"],$credentials["password"],$credentials["database"]);
            if ($sql_connection->connect_error) {
                $response = array("status" => "failed");
                echo json_encode($response);
                die("Connection failed: " . $conn->connect_error);
              } else {
                $sql = "INSERT INTO products (`type`, `brand`,`price`) VALUES ('$type', '$brand', '0')";
                if ($sql_connection->query($sql) === TRUE) {
                    $response = array("status" => "success");
                    echo json_encode($response);
                } else {
                    $error_message = $sql_connection->error;
                    $response = array("status" => "error", "message" => $error_message);
                    echo json_encode($response);
                }

              } 
              
        }
        break;
    }

?>