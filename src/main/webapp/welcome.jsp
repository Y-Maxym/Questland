<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome To Quest</title>
    <link rel="icon" href="image/quest.png" type="image/png">
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
</head>
<body>
<div>
    <h1 id="header" class="header">
        Lost at Sea: Escape from the Island of Mysteries
    </h1>
</div>
<div class="story-container">
    <div class="story-box active eng">
        <p>After a horrifying shipwreck, you find yourself the sole survivor on a mysterious island. Unfamiliar jungles
            flourish around you, and in the distance, wild beasts roar. In your hands, only a broken sword and a few
            salvaged items from the ship. To survive, you must master the skills of hunting, gather useful plants, and
            interact with the indigenous people watching you from the shadows.</p>
        <p>With every decision you make, you shape your destiny - will you seek a way home, or choose a new life on this
            enigmatic island? Welcome to a world where every solved mystery brings you closer to unraveling your own
            purpose.</p>
    </div>

    <div class="story-box ukr">
        <p>Після страхітливого кораблекрушіння ти залишаєшся єдиним вижившим на таємничому острові. Навколо тебе
            невідомі джунглі, а вдалеку гукають дикі звірі. У твоїх руках лише обламаний меч та кілька збережених
            предметів
            з корабля. Щоб вижити, тобі потрібно оволодіти навичками полювання, збирати корисні рослини та взаємодіяти з
            аборигенами, які спостерігають за тобою з тіні.</p>
        <p> З кожним рішенням, яке ти приймаєш, ти впливаєш на свою долю -
            будеш ти шукати шлях додому, чи обереш нове життя на цьому загадковому острові. Знайомся із світом, де кожне
            вирішене загадкове завдання призводить тебе ближче до розгадки та власного призначення. </p>
    </div>
</div>

<div class="button-container">
    <button id="translate-button" class="translate-button" onclick="toggleTranslation()">Translate</button>
    <button id="start-button" class="start-button" onclick="redirectToStart()">Start</button>
</div>
<br/>
</body>
</html>