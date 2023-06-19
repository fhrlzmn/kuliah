<?php

function render($message, $css) {
    echo "
<!DOCTYPE html>
<html lang='en'>
<head>
  <meta charset='UTF-8'>
  <meta name='viewport' content='width=device-width, initial-scale=1.0'>
  <title>Processing...</title>
  <link rel='stylesheet' href='$css'>
  <style>
    p {
      text-align: center;
    }
  </style>
</head>
<body>
  <main>
    <div class='wrapper'>
      $message
    </div>
  </main>
</body>
</html>
";
};

?>