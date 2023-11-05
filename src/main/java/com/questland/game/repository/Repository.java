package com.questland.game.repository;

import com.questland.game.question.Question;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private static Repository instance;
    private final Map<Integer, Question> questions;
    private final Question firstQuestion;


    private Repository() {
        Question question = new Question(1, "You've been washed ashore on an island after a terrifying shipwreck. You feel tired and disoriented. In front of you are unfamiliar jungles, and in the distance, wild animals are calling. In your hands is a broken sword and a few salvaged items from the ship. What will be your next steps?", "Тебе викинуло на берег острова після страшного кораблекрушіння. Ти відчуваєш себе втомленим і розгубленим. Перед тобою - невідомі джунглі, а вдалеку гукають дикі звірі. В твоїх руках обламаний меч та кілька збережених предметів з корабля. Які будуть твої наступні дії?", "", "", 2, 3);
        questions = new HashMap<>() {
            {
                put(1, question);
                put(2, new Question(2, "You ventured into the jungle but encountered wild animals. What will you do?", "Ти вирушив в джунглі, але зустрів дикі звірі. Твої дії?", "Head into the jungle, try to find a source of water and food.", "Вирушити в джунглі, спробувати знайти джерело води і їжі.", 4, 5));
                put(3, new Question(3, "You choose to examine the remnants of the ship. You find several useful items, but then you hear voices of the island's inhabitants. What will you do?", "Ти обираєш розглядати залишки корабля. Знаходиш кілька корисних предметів, але тут чуєш голоси аборигенів. Твої дії?", "Examine the remnants of the ship; perhaps there's something else useful left.", "Розглядати залишки корабля, можливо, щось ще залишилося корисне.", 6, 7));

                put(4, new Question(4, "You escaped from the animals but are now hungry. What will you do?", "Ти втік від звірів, але голодний. Що ти будеш робити?", "Try to avoid them and escape.", "Спробувати уникнути їх і втекти.", 8, 101));
                put(5, new Question(5, "You decided to fend off the animals. They retreat, but you are injured. What will be your next actions?", "Ти вирішив вивести звірів з рівноваги. Вони відступають, але ти поранений. Твої наступні дії?", "Attempt to fend them off using the broken sword.", "Спробувати вивести їх з рівноваги, використовуючи обламаний меч.", 8, 102));

                put(6, new Question(6, "You decided to listen to the conversation of the islanders. It turns out they also ended up here due to a shipwreck and know some secrets of the island. What will you do?", "Ти вирішив слухати розмову аборигенів. З'ясовується, що вони теж потрапили сюди в результаті кораблекрушіння і знають деякі таємниці острова. Твої дії?", "Hide and listen to what they're saying.", "Сховатися і слухати, що вони говорять", 9, 103));
                put(7, new Question(7, "You approached the islanders, and they greeted you warmly. They offer you a gift - a map of the island. What will you do?", "Ти вийшов на зустріч аборигенам, вони дружелюбно вітають тебе. Вони пропонують подарунок - карту острова. Твої дії?", "Approach them and express friendliness.", "Вийти на зустріч і виразити свою дружелюбність", 9, 104));

                put(8, new Question(8, "You find plants to treat your wounds. The injuries are not too severe, and you can continue your journey. You see islanders in a remote part of the jungle. What will you do?", "Ти знаходиш рослини для лікування поранень. Поранення не так важливі, і ти можеш продовжити свій шлях. Ти бачиш аборигенів у віддаленій ділянці джунглів. Твої дії?", "Search for food in the jungle.", "Шукати їжу у джунглях.", 10, 105));
                put(101, new Question(101, "You search for food in the jungle, discovering new types of fruits and finding a water source. You decide to settle in the jungles, enjoying the simplicity and natural beauty of the island.", "Ти шукаєш їжу у джунглях, виявляєш нові види фруктів і знаходиш джерело води. Ти вирішуєш оселитися в джунглях, насолоджуючись простотою і природною красою острова.", "Wait, perhaps the animals will leave, and you can continue your journey.", "Почекати, можливо, звірі відійдуть, і ти зможеш продовжити свій шлях."));

                put(102, new Question(102, "You continue your journey and come across other survivors. Together, you establish a small settlement, collectively addressing challenges and building a new life on the island.", "Ти продовжуєш свій шлях і натрапляєш на інших виживших. Разом ви засновуєте маленьке поселення, спільно вирішуючи проблеми та будуючи нове життя на острові.", "Continue your journey despite the injuries", "Продовжити свій шлях, незважаючи на поранення"));

                put(9, new Question(9, "You accept the map or offer your help or treat their injuries. The islanders thank you and invite you to their camp. What will you do?", "Ти приймаєш карту або пропонуєш свою допомогу або лікуючи поранення. Аборигени дякують тобі і запрошують вас в свій табір. Твої дії?", "Offer your help in exchange for their knowledge", "Пропонувати свою допомогу в обмін на їхні знання", 106, 107));
                put(103, new Question(103, "You and the islanders join forces in the search for the island's secrets. With each new discovery, you get closer to unraveling the mysteries. Ultimately, you find the way off the island and return home.", "Ти і аборигени об'єднуєте свої зусилля в пошуках таємниць острова. З кожним новим відкриттям ви все ближче до розгадки. Остаточно ви знаходите вихід з острова та повертаєтеся додому.", "Continue your journey without engaging in conversation.", "Продовжити свій шлях, не вдаючись до розмов."));

                put(104, new Question(104, "You continue your exploration of the island on your own. You discover wild places and mysterious ruins, revealing the true nature of the island.", "Ти продовжуєш своє дослідження острова самостійно. Знаходиш дикі місця та таємничі руїни, розкриваючи його справжню природу.", "Decline the map and thank them, continuing your exploration", "Відмовитися від карты і подякувати, продовжуючи дослідження"));

                put(105, new Question(105, "You bypass the islanders and embark on distant adventures. You discover the ruins of an ancient civilization and learn from their wisdom.", "Ти обходиш аборигенів і вирушаєш у далекі пригоди. Знаходиш руїни давньої цивілізації та навчаєшся від їхньої мудрості.", "Choose a different direction, avoiding interaction", "Обираєш інший напрямок, не вдаючись до спілкування"));

                put(106, new Question(106, "You choose a new path in life with the islanders. Together, you become a true family and develop your own tribe on the island.", "Ти обираєш новий шлях життя разом з аборигенами. Разом ви стаєте справжньою родиною та розвиваєте власне плем'я на острові.", "Accept the invitation and join their tribe", "Приймаєш запрошення і долучаєшся до їхнього племені"));
                put(107, new Question(107, "You decide to continue your adventures independently. In your heart, the love for free travel and the unknown always remains.", "Ти вирішуєш продовжувати свої пригоди самостійно. В твоєму серці завжди залишається та любов до вільної подорожі та невідомості.", "Decline the invitation and embark on further adventures", "Відмовляєшся від запрошення і вирушаєш у далекі пригоди"));

                put(10, new Question(10, "You decide to listen to the islanders' story about the island's mystery. It turns out to be connected to an ancient legend. You find it intriguing and decide to help solve the puzzle. What will you do?", "Ти вирішуєш слухати розповідь аборигенів про таємницю острова. Виявляється, що це пов'язано з давньою легендою. Ти вважаєш це цікавим і рішаєш допомогти вирішити загадку. Твої дії?", "Approach them and ask for help", "Підходити до них і просити допомоги", 11, 108));

                put(11, new Question(11, "You assist the islanders in solving the puzzle of the legend. They are impressed by your determination and dedication. What will you do?", "Ти допомагаєш аборигенам вирішити загадку легенди. Вони вражені твоєю рішучістю і відданістю. Твої дії?", "Ask how you can help solve the puzzle", "Питаєш, як можна допомогти вирішити загадку", 106, 107));
                put(108, new Question(108, "With your knowledge, you unravel the island's mystery, gaining access to its hidden resources, allowing you to establish a new civilization on this island.", "За допомогою своїх знань ти розгадуєш загадку острова та відкриваєш доступ до його прихованих ресурсів, що дозволяє вам створити нову цивілізацію на цьому острові.", "Consider it just a tale and embark on your own adventures", "Вважаєш, що це лише казки і вирушаєш в свої пригоди"));
            }
        };
        this.firstQuestion = question;
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public Map<Integer, Question> getQuestions() {
        return questions;
    }

    public Question getFirstQuestion() {
        return firstQuestion;
    }
}