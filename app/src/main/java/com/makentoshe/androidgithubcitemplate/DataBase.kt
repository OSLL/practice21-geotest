package com.makentoshe.androidgithubcitemplate

class DataBase {

    private val dataRaw = """1,Австралия,Канберра
2,Австрия,Вена
3,Азербайджан,Баку
4,Албания,Тирана
5,Алжир,Алжир
6,Ангола,Луанда
7,Андорра,Андорра-ла-Велья
8,Антигуа и Барбуда,Сент-Джонс
9,Аргентина,Буэнос-Айрес
10,Армения,Ереван
11,Афганистан,Кабул
12,Багамские Острова,Нассау
13,Бангладеш,Дакка
14,Барбадос,Бриджтаун
15,Бахрейн,Манама
16,Белоруссия,Минск
17,Белиз,Бельмопан
18,Бельгия,Брюссель
19,Бенин,Порто-Ново
20,Болгария,София
21,Боливия,Сукре
22,Босния и Герцеговина,Сараево
23,Ботсвана,Габороне
24,Бразилия,Бразилиа
25,Бруней,Бандар-Сери-Бегаван
26,Буркина-Фасо,Уагадугу
27,Бурунди,Гитега
28,Бутан,Тхимпху
29,Вануату,Порт-Вила
30,Ватикан,Ватикан
31,Великобритания,Лондон
32,Венгрия,Будапешт
33,Венесуэла,Каракас
34,Восточный Тимор,Дили
35,Вьетнам,Ханой
36,Габон,Либревиль
37,Гаити,Порт-о-Пренс
38,Гайана,Джорджтаун
39,Гамбия,Банжул
40,Гана,Аккра
41,Гватемала,Гватемала
42,Гвинея,Конакри
43,Гвинея-Бисау,Бисау
44,Германия,Берлин
45,Гондурас,Тегусигальпа
46,Гренада,Сент-Джорджес
47,Греция,Афины
48,Грузия,Тбилиси
49,Дания,Копенгаген
50,Джибути,Джибути
51,Доминика,Розо
52,Доминиканская Республика,Санто-Доминго
53,Египет,Каир
54,Замбия,Лусака
55,Зимбабве,Хараре
56,Израиль,Иерусалим
57,Индия,Нью-Дели
58,Индонезия,Джакарта
59,Иордания,Амман
60,Ирак,Багдад
61,Иран,Тегеран
62,Ирландия,Дублин
63,Исландия,Рейкьявик
64,Испания,Мадрид
65,Италия,Рим
66,Йемен,Сана
67,Кабо-Верде,Прая
68,Казахстан,Нур-Султан
69,Камбоджа,Пномпень
70,Камерун,Яунде
71,Канада,Оттава
72,Катар,Доха
73,Кения,Найроби
74,Кипр,Никосия
75,Киргизия,Бишкек
76,Кирибати,Южная Тарава
77,Китай,Пекин
78,Колумбия,Богота
79,Коморские Острова,Морони
80,Демократическая Республика Конго,Киншаса
81,Республика Конго,Браззавиль
82,КНДР,Пхеньян
83,Республика Корея,Сеул
84,Коста-Рика,Сан-Хосе
85,Кот-д’Ивуар,Ямусукро
86,Куба,Гавана
87,Кувейт,Эль-Кувейт
88,Лаос,Вьентьян
89,Латвия,Рига
90,Лесото,Масеру
91,Либерия,Монровия
92,Ливан,Бейрут
93,Ливия,Триполи
94,Литва,Вильнюс
95,Лихтенштейн,Вадуц
96,Люксембург,Люксембург
97,Маврикий,Порт-Луи
98,Мавритания,Нуакшот
99,Мадагаскар,Антананариву
100,Малави,Лилонгве
101,Малайзия,Куала-Лумпур
102,Мали,Бамако
103,Мальдивы,Мале
104,Мальта,Валлетта
105,Марокко,Рабат
106,Маршалловы Острова,Маджуро
107,Мексика,Мехико
108,Федеративные Штаты Микронезии,Паликир
109,Мозамбик,Мапуту
110,Молдавия,Кишинёв
111,Монако,Монако
112,Монголия,Улан-Батор
113,Мьянма,Нейпьидо
114,Намибия,Виндхук
115,Науру,Ярен
116,Непал,Катманду
117,Нигер,Ниамей
118,Нигерия,Абуджа
119,Нидерланды,Амстердам
120,Никарагуа,Манагуа
121,Новая Зеландия,Веллингтон
122,Норвегия,Осло
123,Объединённые Арабские Эмираты,Абу-Даби
124,Оман,Маскат
125,Пакистан,Исламабад
126,Палау,Нгерулмуд
127,Панама,Панама
128,Папуа — Новая Гвинея,Порт-Морсби
129,Парагвай,Асунсьон
131,Перу,Лима
132,Польша,Варшава
133,Португалия,Лиссабон
134,Россия,Москва
135,Руанда,Кигали
136,Румыния,Бухарест
137,Сальвадор,Сан-Сальвадор
138,Самоа,Апиа
139,Сан-Марино,Сан-Марино
140,Сан-Томе и Принсипи,Сан-Томе
141,Саудовская Аравия,Эр-Рияд
142,Северная Македония,Скопье
143,Сейшельские Острова,Виктория
144,Сенегал,Дакар
145,Сент-Винсент и Гренадины,Кингстаун
146,Сент-Китс и Невис,Бастер
147,Сент-Люсия,Кастри
148,Сербия,Белград
149,Сингапур,Сингапур
150,Сирия,Дамаск
151,Словакия,Братислава
152,Словения,Любляна
153,Соединённые Штаты Америки,Вашингтон
154,Соломоновы Острова,Хониара
155,Сомали,Могадишо
156,Судан,Хартум
157,Суринам,Парамарибо
158,Сьерра-Леоне,Фритаун
159,Таджикистан,Душанбе
160,Таиланд,Бангкок
161,Танзания,Додома
162,Того,Ломе
163,Тонга,Нукуалофа
164,Тринидад и Тобаго,Порт-оф-Спейн
165,Тувалу,Фунафути
166,Тунис,Тунис
167,Туркмения,Ашхабад
168,Турция,Анкара
169,Уганда,Кампала
170,Узбекистан,Ташкент
171,Украина,Киев
172,Уругвай,Монтевидео
173,Фиджи,Сува
174,Филиппины,Манила
175,Финляндия,Хельсинки
176,Франция,Париж
177,Хорватия,Загреб
178,Центральноафриканская Республика,Банги
179,Чад,Нджамена
180,Черногория,Подгорица
181,Чехия,Прага
182,Чили,Сантьяго
183,Швейцария,Берн
184,Швеция,Стокгольм
185,Шри-Ланка,Шри-Джаяварденепура-Котте
186,Эквадор,Кито
187,Экваториальная Гвинея,Малабо
188,Эритрея,Асмэра
189,Эсватини,Мбабане
190,Эстония,Таллин
191,Эфиопия,Аддис-Абеба
192,Южно-Африканская Республика,Претория
193,Южный Судан,Джуба
194,Ямайка,Кингстон
195,Япония,Токио"""
    private var data: List<CountryRow> = listOf()

    init {
        val lines = dataRaw.split("\n")

        for (i in 0 until lines.size) {
            val row = lines[i].split(",")
            val countryRow = CountryRow(row[0], row[1], row[2])

            data = data.plus(countryRow)
        }


    }

    fun getCountries (num: Int) : List<CountryRow> {
        var count = num
        if (num > data.size)
            count = data.size

        val dataShuffled = data.shuffled()

        var resData: List<CountryRow> = listOf()

        for (i in 0..count) {
            resData = resData.plus(dataShuffled[i])
        }
        return resData

    }

}

data class CountryRow (
    val id: String,
    val country: String,
    val capital: String)