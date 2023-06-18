<?php

// database connection

session_start();

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  require ("../config/connect_db.php");

  try {
    $conn = connect_db();
  } catch (Exception $e) {
    echo "Connection failed: " . $e -> getMessage();
  }

  $username = $_POST["username"];
  $password = $_POST["password"];

  
  $sql = "SELECT * FROM users WHERE username = '$username' AND password = '$password'";
  $result = mysqli_query($conn, $sql);
  $row = mysqli_fetch_assoc($result);

  if (mysqli_num_rows($result) == 1) {
    $_SESSION["username"] = $row["name"];
    echo "You have successfully logged in!";
    header("refresh:2; url=/index.php");
  } else {
    echo "Username or password is incorrect!";
    header("refresh:2; url=/login.php");
  }
} else {
  echo "You are not allowed to access this page!";
  header("refresh:2; url=/login.php");
}

?>