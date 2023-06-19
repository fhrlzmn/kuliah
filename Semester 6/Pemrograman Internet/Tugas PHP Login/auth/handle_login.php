<?php

require ("../layout.php");

session_start();

$css = "../css/style.css";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  require ("../config/connect_db.php");

  try {
    $conn = connect_db();
  } catch (Exception $e) {
    echo "Connection failed: " . $e -> getMessage();;
  }

  $username = $_POST["username"];
  $password = $_POST["password"];

  
  $sql = "SELECT * FROM users WHERE username = '$username' AND password = '$password'";
  $result = mysqli_query($conn, $sql);
  $row = mysqli_fetch_assoc($result);

  if (mysqli_num_rows($result) == 1) {
    $_SESSION["username"] = $row["name"];
    render("<p>You have successfully logged in!</p>", $css);
    header("refresh:1; url=/index.php");
  } else {
    render("<p>Username or password is incorrect!</p>", $css);
    header("refresh:1; url=/login.php");
  }
} else {
  render("<p>You are not allowed to access this page!</p>", $css);
  header("refresh:1; url=/login.php");
}

?>
