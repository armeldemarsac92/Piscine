<?php
    function whoami () {
        $name = $_POST["name"];
        $age = $_POST["age"];

        if (ctype_alpha($name) && ctype_digit($age)) {
            echo "Hi, my name is $name and I’m $age years old.";
        }
        else if (ctype_alpha($name) && !ctype_digit($age)) {
            echo "Hi, my name is $name.";
        }
        else if (!ctype_alpha($name) && ctype_digit($age)) {
            echo "Hi, I have no name and I’m $age years old.";
        } 
        else {
            echo "I don't know who I am";
        } 
    }

?>