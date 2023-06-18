<?php

$DB_SERVER = 'localhost';
$DB_USERNAME = 'root';
$DB_PASSWORD = '';
$DB_NAME = 'login_app';

function connect_db() {
  global $DB_SERVER, $DB_USERNAME, $DB_PASSWORD, $DB_NAME;
  $mysqli = new mysqli($DB_SERVER, $DB_USERNAME, $DB_PASSWORD);

  if($mysqli -> connect_error) {
    die("Connection failed: " . $mysqli -> connect_error);
    return false;
  }

  $mysqli -> select_db($DB_NAME);
  return $mysqli;
}

?>