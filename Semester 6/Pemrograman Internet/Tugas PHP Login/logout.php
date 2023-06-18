<?php

session_start();

if(isset($_SESSION["username"])) {
  echo "Logging out...";
  session_destroy();
  header("refresh:2; url=/login.php");
  exit();
} else {
  echo "You haven't login yet, go back to <a href='login.php'>login page</a>";
}

?>