<?php
    function form_is_submitted(){
        if (isset($_POST['submit'])) { 
            return true; 
        } 
    }

    function whoami () {
        $name = $_POST["name"];
        $age = $_POST["age"];
        $curriculum = $_POST["curriculum"];

        if (ctype_alpha($name) && ctype_digit($age)) {
            echo "Hi, my name is $name and I’m $age years old.";
            if (ctype_alpha($curriculum)) {
                echo " I'm a student of $curriculum.";
            }
        }
        else if (ctype_alpha($name) && !ctype_digit($age)) {
            echo "Hi, my name is $name.";
            if (ctype_alpha($curriculum)) {
                echo " I'm a student of $curriculum.";
            }

        }
        else if (!ctype_alpha($name) && ctype_digit($age)) {
            echo "Hi, I have no name and I’m $age years old.";
            if (ctype_alpha($curriculum)) {
                echo " I'm a student of $curriculum.";
            }
        } 
        else {
            echo "I don't know who I am.";
        } 
    }

?>