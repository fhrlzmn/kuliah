<?php

require ("./layout.php");

session_start();

$css = "./css/style.css";

if(isset($_SESSION["username"])) {
  render("<p>Logging out...</p>", $css);
  session_destroy();
  header("refresh:1; url=/login.php");
  exit();
} else {
  render("<p>You haven't login yet, go back to <a href='login.php'>login page</a></p>", $css);
}

?>

