<?php

require_once("Uberx.php");
require_once("Car.php");
require_once("Account.php");


$uberx = new Uberx("cvb123", new Account("andres herreraz","and345"),"chebrolet","spark");
$uberx->printDataCar();


?>