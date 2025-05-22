package uz.sarmat;

import org.telegram.telegrambots.meta.api.methods.send.SendMediaBotMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {


    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xush kelibsiz");
        return sendMessage;

    }

    // til tanlash

    public SendMessage tiltanlash(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Tilni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDDF7\uD83C\uDDFARus tili");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDDFA\uD83C\uDDF8English");
        row.add(button2);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    // davlatlar

    public SendMessage Davlatnitanlang(Long chatid) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText("Qaysi davlatdagi universititut haqida ma'lumot olmoqchi bo'lsangiz davlatni tanlang ?");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDF8America");
        row.add(button);
        rows.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDDF0\uD83C\uDDF7Korea");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDDF7\uD83C\uDDFARussia");
        row1.add(button2);
        rows.add(row1);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDDFA\uD83C\uDDFFUzbekistan");
        row1.add(button3);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83C\uDDF8\uD83C\uDDECSingapore");
        row2.add(button4);
        rows.add(row2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83C\uDDEC\uD83C\uDDE7Buyuk Britaniya");
        row1.add(button5);

        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Orqaga");
        row2.add(button6);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage Amerika(Long chatid) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText(" Universititutlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Harvard");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Orqaga");
        row.add(button2);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendMessage BuyukBritaniya(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Universitetlar");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("Oxford");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Orqaga");
        row.add(button1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage Korea(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Universitetlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button = new KeyboardButton();
        button.setText("Seoul National University");
        row.add(button);
        rows.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Yonsei University");
        row.add(button1);
        //rows.add(row1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Pohang University of Science and Technology");
        row1.add(button2);
        rows.add(row1);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Hanyang University");
        row1.add(button3);
        //rows.add(row2);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Sungkyunkwan University");
        row2.add(button4);
        rows.add(row2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Orqaga");
        row2.add(button5);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }


    public SendMessage Rassiya(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Universititutlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button = new KeyboardButton();
        button.setText("Moscow Institute of Physics and Technology");
        row.add(button);
        rows.add(row);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Saint Petersburg State University");
        row2.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Moscow State University");
        row2.add(button2);
        rows.add(row2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Higher School of Economics");
        row1.add(button3);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Tomsk State University");
        row1.add(button4);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Orqaga");
        row1.add(button5);
        rows.add(row1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }


    public SendMessage Uzbekistan(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Universititutlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button = new KeyboardButton();
        button.setText("O‘zbekiston Davlat Jahon Tillari Universiteti");
        row.add(button);
        rows.add(row);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Toshkent Moliya Instituti");
        row2.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Toshkent Arxitektura va Qurilish Instituti");
        row2.add(button2);
        rows.add(row2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Toshkent Davlat Texnika Universiteti");
        row1.add(button3);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Orqaga");
        row1.add(button4);
        rows.add(row1);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    public SendPhoto harvard(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/5sY6DN7uetCkJyqe6"));
        sendPhoto.setCaption("Bakalavr bosqichi uchun talablar (Harvard College):\n" +
                "\uD83D\uDCCC SAT yoki ACT:\n" +
                "Harvard test-opsional siyosatini qo‘llaydi (ya'ni, topshirmasa ham bo‘ladi), ammo berilgan bo‘lsa " +
                "— katta afzallik.\n" +
                "\n" +
                "SAT uchun ideal ballar:\n" +
                "\n" +
                "Reading + Writing: 730 – 800\n" +
                "\n" +
                "Math: 750 – 800\n" +
                "\n" +
                "Umumiy SAT: 1450 – 1600 (raqobatbardoshlar odatda 1550+)\n" +
                "\n" +
                "ACT: 33 – 36 (maksimal 36)\n" +
                "\n" +
                "\uD83D\uDCCC IELTS yoki TOEFL (xalqaro talabalar uchun):\n" +
                "Agar o'qish tili ingliz tili bo‘lmagan davlatdan bo‘lsangiz, bu talab qilinadi.\n" +
                "\n" +
                "IELTS: kamida 7.5, ideal — 8.0 yoki 8.5\n" +
                "\n" +
                "TOEFL iBT: kamida 100, ideal — 105 – 110+\n" +
                "\n" +
                "Harvardda rasmiy minimal chegaralar ko‘rsatilmagan, lekin yuqori ball bo'lishi kutiladi, " +
                "chunki raqobat juda kuchli.\n" +
                "http://www.harvard.edu\n" +
                "\n" +
                "\n");
        return sendPhoto;

    }

    public SendPhoto Oxford(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ox.ac.uk/sites/files/oxford/styles/ow_large_feature/s3/field/fie" +
                "ld_image_main/b_AllSoulsquad.jpg?itok=tTcH-5ix"));
        sendPhoto.setCaption("IELTS / TOEFL (xalqaro talabalar uchun):\n" +
                "Agar siz ingliz tilida ta’lim bermaydigan davlatdan bo‘lsangiz, quyidagi testlar talab qilinadi:\n" +
                "\n" +
                "IELTS:\n" +
                "Umumiy ball: 7.0 yoki 7.5\n" +
                "\n" +
                "Har bir bo‘limdan 6.5 yoki 7.0 dan kam bo‘lmasligi kerak\n" +
                "\n" +
                "Ba’zi yo‘nalishlar (masalan, huquq, adabiyot) uchun 8.0 talab qilinishi mumkin\n" +
                "\n" +
                "TOEFL iBT:\n" +
                "Umumiy ball: 100 yoki undan yuqori\n" +
                "\n" +
                "Har bir bo‘limdan 22–25 dan kam bo‘lmasligi kerak\n" +
                "\n" +
                "\uD83D\uDCCC 2. SAT va ACT (Faqat AQShda o‘qiganlar uchun)\n" +
                "Oxford odatda SAT yoki ACT balllarini AQSh tizimida o‘qigan talabalar uchun so‘raydi.\n" +
                "\n" +
                "SAT:\n" +
                "Umumiy ball: 1460–1600\n" +
                "\n" +
                "Har bir bo‘limda kamida 700 bo‘lishi kerak\n" +
                "\n" +
                "ACT:\n" +
                "Kamida 32–36 oralig‘ida bo‘lishi kerak\n" +
                "\n" +
                "‼\uFE0F Eslatma: Agar siz O‘zbekiston yoki boshqa mamlakatda inglizdan boshqa tilda " +
                "ta’lim olgan bo‘lsangiz, IELTS yoki TOEFL yetarli.");
        return sendPhoto;

    }

    //korea

    public SendPhoto SeoulNationalUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://medtour.help/wp-content/uploads/201" +
                "9/09/bolnicza-seulskogo-naczionalnogo-universiteta1.jpg"));
        sendPhoto.setCaption("Asosiy ma’lumotlar\n" +
                "Joylashuvi: Seul shahri, Gwanak tumanidagi Gwanak kampusi asosiy kampus hisoblanadi .\n" +
                "\n" +
                "Talabalar soni: Taxminan 31,500 nafar talaba tahsil oladi, shundan 2,000 dan ortig‘i xalqaro talabalar .\n" +
                "\n" +
                "Professor-o‘qituvchilar: 6,397 nafar professor-o‘qituvchi faoliyat yuritadi .\n" +
                "\n" +
                "Kutubxona fondi: 5 milliondan ortiq kitob va boshqa materiallar mavjud .\n" +
                "Top Universities\n" +
                "+10\n" +
                "US News\n" +
                "+10\n" +
                "Monash University\n" +
                "+10\n" +
                "Seoul National University\n" +
                "\n" +
                "Akademik tuzilma\n" +
                "SNU 16 ta kollej va 11 ta professional magistratura maktabiga ega:\n" +
                "Monash University\n" +
                "\n" +
                "Kollejlar: Gumanitar fanlar, Ijtimoiy fanlar, Biznes boshqaruvi, Ta’lim, Muhandislik, Tabiiy fanlar, Tibbiyot, Farmatsiya, Musiqa, Tasviriy san’at, Qishloq xo‘jaligi va hayot fanlari, Veterinariya va boshqalar .\n" +
                "\n" +
                "Professional magistratura maktablari: Huquq, Tibbiyot, Stomatologiya, Xalqaro tadqiqotlar, Davlat boshqaruvi, Ma’lumotlar fanlari va boshqalar .\n" +
                "Vikipediya\n" +
                "\n"
        );
        return sendPhoto;


    }

    public SendPhoto YonseiUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://live.staticflickr.com/65535/53181987326_5865b70533_o_d.jpg"));
        sendPhoto.setCaption(" Asosiy ma’lumotlar\n" +
                "Joylashuvi: Asosiy kampus Seul shahrining Seodaemun tumanida, qo‘shimcha kampuslar esa Songdo (Xalqaro kampus) va Wonju (MIRAE kampusi)da joylashgan .\n" +
                "\n" +
                "Talabalar soni: Taxminan 38,000 nafar talaba tahsil oladi, shundan 5,466 nafari xalqaro talabalar .\n" +
                "\n" +
                "Professor-o‘qituvchilar: 3,500 dan ortiq professor-o‘qituvchi faoliyat yuritadi .\n" +
                "\n" +
                "\uD83C\uDF10 Xalqaro dasturlar va til kurslari\n" +
                "Yonsei International Summer School (YISS): Har yili yozda o‘tkaziladigan " +
                "6-haftalik dastur, 30 dan ortiq mamlakatdan talabalarni jalb etadi .\n" +
                "\n" +
                "Winter Abroad at Yonsei (WAY): Qisqa muddatli qishki dastur, dekabr-yanvar oylarida o‘tkaziladi.\n" +
                "\n" +
                "Yonsei Korean Language Institute (KLI): 1959-yilda tashkil etilgan, koreys tilini o‘rganmoqchi bo‘lgan xalqaro talabalar uchun 6 darajali intensiv kurslar taklif etadi .\n" +
                "Vikipediya\n" +
                "\n"
        );
        return sendPhoto;
    }

    public SendPhoto PohangUniversityofScienceandTechnology(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.postech.ac.kr/_res/postech/eng/img/main/img_guide_4.png"));
        sendPhoto.setCaption("\uD83C\uDFEB Asosiy ma'lumotlar\n" +
                "Joylashuvi: Pohang shahri, Gyeongsangbuk-do viloyati, Janubiy Koreya\n" +
                "\n" +
                "Tashkil etilgan yili: 1986\n" +
                "\n" +
                "Talabalar soni: 3,310 nafar (39% bakalavriat, 61% magistratura va doktorantura)\n" +
                "\n" +
                "Xalqaro talabalar: 108 nafar (asosan magistratura bosqichida)\n" +
                "\n" +
                "Professor-o‘qituvchilar: 768 nafar, shundan 15% xalqaro mutaxassislar\n" +
                "\n" +
                "\uD83D\uDCCA Reytinglar va e'tiroflar\n" +
                "QS World University Rankings 2025: #98-o‘rin\n" +
                "\n" +
                "THE World University Rankings 2025: #151-o‘rin\n" +
                "\n" +
                "THE Young University Rankings 2024: 9-o‘rin (50 yoshgacha bo‘lgan universitetlar orasida)\n" +
                "\n" +
                "THE World’s Best Small Universities 2024: 2-o‘rin \n" +
                "Top Universities\n" +
                "+4\n" +
                "QSChina\n" +
                "+4\n" +
                "sites.postech.ac.kr\n" +
                "+4\n" +
                "\n" +
                "\uD83D\uDD2C Ilmiy-tadqiqot va innovatsiyalar\n" +
                "POSTECH ilmiy-tadqiqot sohasida quyidagi yo‘nalishlarga alohida e'tibor qaratadi:\n" +
                "US News\n" +
                "\n" +
                "Sun'iy intellekt va axborot texnologiyalari\n" +
                "\n" +
                "Energetika va materialshunoslik\n" +
                "\n" +
                "Biotexnologiya va sog‘liqni saqlash\n" +
                "\n" +
                "Smart texnologiyalar\n"
        );


        return sendPhoto;
    }

    public SendPhoto HanyangUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://gogohanguk.com/wp-content/upload" +
                "s/2023/07/Hanyang-University-1024x576.jpg"));
        sendPhoto.setCaption("\uD83C\uDFEB Asosiy ma'lumotlar\n" +
                "Rasmiy nomi: Hanyang University (한양대학교)\n" +
                "\n" +
                "Tashkil etilgan yili: 1939\n" +
                "\n" +
                "Talabalar soni: 20,388 nafar (2025-yil holatiga ko‘ra)\n" +
                "\n" +
                "Xalqaro talabalar: 4,804 nafar\n" +
                "\n" +
                "Professor-o‘qituvchilar: 2,937 nafar\n" +
                "\n" +
                "Shiori: \"Love in Deed and Truth\" (Amalda va haqiqatda sevgi)\n" +
                "\n" +
                "\uD83D\uDCCA Reytinglar va e'tiroflar\n" +
                "QS World University Rankings 2025: #162-o‘rin\n" +
                "\n" +
                "Times Higher Education (THE) World University Rankings 2025: 251–300-o‘rinlar oralig‘ida\n" +
                "\n" +
                "US News Best Global Universities 2025: #445-o‘rin\n" +
                "\n" +
                "\n" +
                "Universitetda ingliz tilida olib boriladigan dasturlar mavjud bo‘lib, xalqaro talabalar " +
                "uchun qulay ta'lim muhitini ta'minlaydi.\n" +
                "\n" +
                "\uD83C\uDF10 Xalqaro hamkorlik va dasturlar\n" +
                "Hanyang University 820 dan ortiq universitetlar bilan hamkorlik qiladi, jumladan:\n" +
                "\n" +
                "Massachusetts Institute of Technology (MIT)\n" +
                "\n" +
                "Cambridge University\n" +
                "\n" +
                "Tsinghua University\n" +
                "Universitet har yili 7,400 dan ortiq xalqaro talabalarni qabul qiladi va 3,000 da" +
                "n ortiq talabalarni xorijga yuboradi.");

        return sendPhoto;


    }


    public SendPhoto SungkyunkwanUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://i.ytimg.com/vi/_rbwN6NCD8Q/maxresdefault.jpg"));
        sendPhoto.setCaption("\uD83C\uDFEB Asosiy ma'lumotlar\n" +
                "Joylashuvi: Seul (Gumanitar va ijtimoiy fanlar kampusi) va Suvon (Tabiiy fanlar kampusi)\n" +
                "\n" +
                "Talabalar soni: 23,402 nafar\n" +
                "\n" +
                "Xalqaro talabalar: 4,333 nafar\n" +
                "\n" +
                "Professor-o‘qituvchilar: 1,200 nafar\n" +
                "\n" +
                "\uD83C\uDF93 Fakultetlar va dasturlar\n" +
                "SKKU keng qamrovli akademik dasturlarni taklif etadi, jumladan:\n" +
                "\n" +
                "Muhandislik: Elektr va elektronika, sun'iy intellekt, kompyuter muhandisligi, kimyo " +
                "muhandisligi, mexanika muhandisligi, qurilish muhandisligi\n" +
                "\n" +
                "Biotexnologiya va bioinjiniring: Biotibbiyot injiniringi, nano/bio texnologiyalar\n" +
                "\n" +
                "Tibbiyot: Tibbiyot fakulteti va biotibbiyot tadqiqot markazlari\n" +
                "\n" +
                "Biznes va iqtisodiyot: Global biznes boshqaruvi, global iqtisodiyot\n" +
                "\n" +
                "Gumanitar fanlar: Konfutsiylik tadqiqotlari, sharq falsafasi, tarix, adabiyot\n" +
                "US News\n" +
                "\n" +
                "Ko‘plab dasturlar ingliz tilida olib boriladi, xususan, global iqtisodi" +
                "yot, global biznes boshqaruvi, dasturiy ta'minot, global biotibbiyot injiniringi kabi " +
                "yo‘nalishlarda 100% ingliz tilida ta'lim beriladi."
        );

        return sendPhoto;
    }

    //russia



    public SendPhoto MoscowInstituteofPhysicsandTechnology(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.rusvuz.com/wp-content/uploads/2019/04/RUSVUZ_MIPT2.jpg"));
        sendPhoto.setCaption("\uD83C\uDFDB Asosiy ma'lumotlar\n" +
                "Rasmiy nomi: Moscow Institute of Physics and Technology (MIPT)\n" +
                "\n" +
                "Tashkil etilgan yili: 1951\n" +
                "\n" +
                "Joylashuvi: Dolgoprudniy, Moskva viloyati, Rossiya\n" +
                "\n" +
                "Talabalar soni: 6,431 nafar\n" +
                "\n" +
                "Xalqaro talabalar: 1,323 nafar\n" +
                "\n" +
                "Professor-o‘qituvchilar: 1,138 nafar\n" +
                "\n" +
                "Rasmiy veb-sayti: mipt.ru\n" +
                "pk.mipt.ru\n" +
                "+2\n" +
                "educom.net\n" +
                "+2\n" +
                "shanghairanking.com\n" +
                "+2\n" +
                "\n" +
                "\uD83C\uDF10 Xalqaro hamkorlik va tadqiqotlar\n" +
                "MIPT xalqaro miqyosda faol hamkorlik qiladi va quyidagi sohalarda yetakchi hisoblanadi:\n" +
                "\n" +
                "Sun'iy intellekt: 2018-yilda MIPT Rossiyada Sun'iy intellekt bo‘yicha Milliy Tadqiqot Markazi sifatida tan olingan.\n" +
                "\n" +
                "Genomika: 2019-yildan boshlab Kurchatov Genomika Markazi konsorsiumining a'zosi.\n" +
                "\n" +
                "Nanooptika va plazmonika: So‘nggi besh yilda 50 dan ortiq yangi laboratoriyalar ochilgan.\n" +
                "\n" +
                "Universitetda 92 ta ilmiy laboratoriya mavjud bo‘lib, ularning ko‘pchiligi so‘nggi yillarda tashkil etilgan.");

        return sendPhoto;
    }


    public SendPhoto SaintPetersburgStateUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://welcometostudy.com/sites/default/files/higher-education/150" +
                "/glavnayaspbguglobaleducation.jpg"));
        sendPhoto.setCaption("\uD83C\uDFDB Asosiy ma'lumotlar\n" +
                "Joylashuvi: Sankt-Peterburg, Rossiya\n" +
                "\n" +
                "Talabalar soni: 32,400 nafar (bakalavr va magistratura bosqichlarida)\n" +
                "\n" +
                "Xalqaro talabalar: 100 dan ortiq mamlakatlardan 3,000 dan ziyod\n" +
                "\n" +
                "Rasmiy veb-sayti: english.spbu.ru\n" +
                "\n" +
                "Asosiy kampuslar:\n" +
                "\n" +
                "Vasilievskiy oroli: Twelve Collegia binosi — boshqaruv va gumanitar fakultetlar joylashgan\n" +
                "\n" +
                "Peterhof: Tabiiy fanlar va texnik yo‘nalishlar uchun zamonaviy kampus\n" +
                "Study Abroad Exams\n" +
                "+2\n" +
                "\uD83C\uDF93 Ta'lim yo‘nalishlari\n" +
                "SPbU 24 ta fakultet va institutdan iborat bo‘lib, quyidagi sohalarda ta'lim beradi:\n" +
                "\n" +
                "Tabiiy fanlar: Fizika, matematika, kimyo, biologiya, geologiya\n" +
                "\n" +
                "Gumanitar fanlar: Tarix, falsafa, adabiyot, tilshunoslik, san'atshunoslik\n" +
                "\n" +
                "Ijtimoiy fanlar: Huquq, siyosatshunoslik, iqtisodiyot, sotsiologiya\n" +
                "\n" +
                "Texnik yo‘nalishlar: Kompyuter fanlari, muhandislik, axborot texnologiyalari\n" +
                "\n" +
                "Biznes va boshqaruv: Biznes boshqaruvi, moliya, marketing\n" +
                "\n" +
                "Ko‘plab magistratura dasturlari ingliz, nemis, fransuz, ispan va italyan tillarida olib boriladi.");


        return sendPhoto;
    }

    public SendPhoto MoscowStateUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.shiksha.com/mediadata/images/1423632114phpSVpSVi_g.jpg"));
        sendPhoto.setCaption("\uD83C\uDFDB Asosiy ma'lumotlar\n" +
                "Rasmiy nomi: Lomonosov nomidagi Moskva Davlat Universiteti (MSU)\n" +
                "\n" +
                "Tashkil etilgan yili: 1755-yil\n" +
                "\n" +
                "Joylashuvi: Moskva, Rossiya\n" +
                "\n" +
                "Talabalar soni: Taxminan 47,000 nafar\n" +
                "\n" +
                "Xalqaro talabalar: 10,784 nafar\n" +
                "\n" +
                "Professor-o‘qituvchilar: 6,755 nafar\n" +
                "\n" +
                "Rasmiy veb-sayti: msu.ru\n" +
                "QSChina\n" +
                "Vikipediya\n" +
                "\n" +
                "\uD83C\uDF93 Ta'lim tizimi va yo‘nalishlar\n" +
                "MSU 43 ta fakultet va 15 ta ilmiy-tadqiqot institutiga ega bo‘lib, quyidagi sohalarda ta'lim beradi:\n" +
                "\n" +
                "Tabiiy fanlar: Fizika, matematika, kimyo, biologiya, geologiya\n" +
                "\n" +
                "Gumanitar fanlar: Tarix, falsafa, adabiyot, tilshunoslik, san'atshunoslik\n" +
                "\n" +
                "Ijtimoiy fanlar: Huquq, siyosatshunoslik, iqtisodiyot, sotsiologiya\n" +
                "\n" +
                "Texnik yo‘nalishlar: Kompyuter fanlari, muhandislik, axborot texnologiyalari\n" +
                "\n" +
                "Biznes va boshqaruv: Biznes boshqaruvi, moliya, marketing\n" +
                "\n" +
                "Universitetda 300 dan ortiq kafedra mavjud bo‘lib, talabalar uchun keng ko‘lamli ta'lim imkoniyatlari mavjud.");


        return sendPhoto;
    }


    public SendPhoto TomskStateUniversity(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://blog.rmgoe.org/wp-content/uploads/2022/06/Tomsk-State-University-Russia.webp"));
        sendPhoto.setCaption("\uD83C\uDFDB Umumiy ma'lumotlar\n" +
                "Rasmiy nomi: Milliy tadqiqot Tomsk Davlat Universiteti (TSU)\n" +
                "\n" +
                "Tashkil etilgan yili: 1878-yil\n" +
                "\n" +
                "Joylashuvi: Tomsk shahri, Rossiya\n" +
                "\n" +
                "Talabalar soni: taxminan 23,000 nafar\n" +
                "\n" +
                "Xalqaro talabalar: 3,000 dan ortiq, 70 dan ortiq mamlakatlardan\n" +
                "\n" +
                "Rasmiy veb-sayti: en.tsu.ru\n" +
                "en.cjiap.tsu.ru\n" +
                "+4\n" +
                "Vikipediya\n" +
                "+4\n" +
                "en.viu.tsu.ru\n" +
                "+4\n" +
                "\n" +
                "\uD83D\uDCCA Reytinglar\n" +
                "QS World University Rankings 2025: #431\n" +
                "\n" +
                "Times Higher Education (THE) 2025: 501–600 oralig‘i\n" +
                "\n" +
                "U.S. News Best Global Universities: #789 (Rossiyada 11-o‘rin)\n" +
                "\n" +
                "Three University Missions (MosIUR) 2023: #211 (Rossiyada 7-o‘rin)\n" +
                "\n" +
                "Shanghai ARWU: Fizika bo‘yicha 201–300 o‘rinlar oralig‘i \n" +
                "uniplusglobal.com\n" +
                "US News\n" +
                "\n");


        return sendPhoto;
    }

    public SendPhoto HigherSchoolofEconomics(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://img.freepik.com/premium-photo/higher-school-economics-myasnitskaya-" +
                "street-moscow_248906-2005.jpg"));
        sendPhoto.setCaption("\uD83C\uDFDB Umumiy ma'lumotlar\n" +
                "Rasmiy nomi: Milliy tadqiqot universiteti — Higher School of Economics (HSE University)\n" +
                "\n" +
                "Tashkil etilgan yili: 1992-yil\n" +
                "Asosiy kampus: Moskva, Rossiya\n" +
                "\uD83C\uDF93 Ta'lim va dasturlar\n" +
                "HSE University 98 ta bakalavriat va 182 ta magistratura dasturlarini taklif etadi," +
                " ularning ba'zilari to‘liq ingliz tilida olib boriladi. Shuningdek, universitetda doktorantura," +
                " qisqa muddatli kurslar, yozgi maktablar va onlayn dasturlar mavjud .\n" +
                "hse.ru\n" +
                "HSE quyidagi fakultetlarga ega:\n" +
                "Vikipediya\n" +
                "Iqtisodiyot fakulteti\n" +
                "Dunyo iqtisodiyoti va xalqaro munosabatlar fakulteti\n" +
                "Kompyuter fanlari fakulteti\n" +
                "Matematika fakulteti\n" +
                "Shuningdek, HSE va London School of Economics (LSE) hamkorligida tashkil etilgan International " +
                "College of Economics and Finance (ICEF) mavjud bo‘lib, bu yerda talabalar HSE va University of " +
                "London diplomlarini olish imkoniyatiga ega .\n" +
                "Cumulus Association\n"
        );


        return sendPhoto;

    }


    //uzb


    public SendPhoto ToshkentDavlatTexnikaUniversiteti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://upload.wikimedia.org/wikipedia/commons/5/57/TDTU.png"));
        sendPhoto.setCaption("\uD83C\uDFDB Umumiy ma’lumotlar\n" +
                "Tashkil etilgan yili: 1918\n" +
                "\n" +
                "Rasmiy nomi: Islom Karimov nomidagi Toshkent Davlat Texnika Universiteti\n" +
                "\n" +
                "Rektor: Sadriddin Turabjonov\n" +
                "\n" +
                "Talabalar soni: 23 268 nafardan ortiq\n" +
                "\n" +
                "Ta’lim tili: o‘zbek va rus tillari\n" +
                "\n" +
                "Ta’lim shakllari: kunduzgi, sirtqi va kechki\n" +
                "\n" +
                "Rasmiy sayt: tdtu.uz\n" +
                "Vikipediya\n" +
                "TDTU Qo'qon filiali\n" +
                "\n" +
                "\uD83C\uDF93 Fakultetlar va ta’lim yo‘nalishlari\n" +
                "TDTU tarkibida 8 ta fakultet va 62 ta kafedra mavjud bo‘lib, 50 dan ortiq bakalavriat va 71 ta magistratura yo‘nalishlari bo‘yicha ta’lim beriladi. Asosiy fakultetlar:\n" +
                "TDTU Qo'qon filiali\n" +
                "+2\n" +
                "blog.mentalaba.uz\n" +
                "+2\n" +
                "Mentalaba\n" +
                "+2\n" +
                "Oliygoh\n" +
                "+2\n" +
                "Kun.uz\n" +
                "+2\n" +
                "Imtihonlar\n" +
                "+2\n" +
                "\n" +
                "Energetika fakulteti\n" +
                "\n" +
                "Elektronika va avtomatika fakulteti\n" +
                "\n" +
                "Geologiya va konchilik ishi fakulteti\n" +
                "\n" +
                "Mexanika-mashinasozlik fakulteti\n" +
                "\n" +
                "Neft va gaz fakulteti\n" +
                "\n" +
                "Muhandislik texnologiyalari fakulteti");


        return sendPhoto;
    }


    public SendPhoto UzbekistonDavlatJahonTillariUniversiteti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/pXogpfH9ichKfRmi9"));
        sendPhoto.setCaption("\uD83C\uDFDB Tarixi va umumiy ma’lumotlar\n" +
                "Tashkil etilgan yili: 1949-yilda Toshkent chet tillari pedagogika instituti sifatida tashkil etilgan. 1992-yilda Respublika Rus tili va adabiyoti instituti bilan birlashib, universitet maqomini oldi. \n" +
                "UzSWLU.Uz\n" +
                "Talabalar soni: 23 000 dan ortiq. \n" +
                "UzSWLU.Uz\n" +
                "Akademik xodimlar: 1 100 dan ortiq professor-o‘qituvchilar. \n" +
                "italian-uzswlu.uz\n" +
                "Fakultetlar soni: 10 ta. \n" +
                "Vikipediya\n" +
                "Ta’lim dasturlari: 27 ta bakalavriat va 19 ta magistratura yo‘nalishlari mavjud. \n" +
                "UzSWLU.Uz\n" +
                "Rasmiy sayt: uzswlu.uz\n" +
                "UzSWLU.Uz\n" +
                "\uD83D\uDCDA Fakultetlar va yo‘nalishlar\n" +
                "Universitet quyidagi fakultetlar orqali ta’lim beradi:\n" +
                "Ingliz tili fakultetlari (1-, 2-, 3-). \n" +
                "Oliygoh\n" +
                "Akadem\n" +
                "Ingliz filologiyasi fakulteti.\n" +
                "Roman-german filologiyasi fakulteti. \n" +
                "Rus filologiyasi fakulteti.\n" +
                "Sharq filologiyasi fakulteti. \n" +
                "Oliygoh\n"
        );


        return sendPhoto;
    }



    public SendPhoto ToshkentMoliyaInstituti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://smapse.com/storage/2019/09/v1-2.jpg"));
        sendPhoto.setCaption("\uD83C\uDFDB Umumiy ma’lumotlar\n" +
                "Talabalar soni: 15 000 dan ortiq\n" +
                "\n" +
                "Professor-o‘qituvchilar: 500 dan ortiq\n" +
                "\n" +
                "Ilmiy salohiyat: 60% atrofida\n" +
                "\n" +
                "Bitiruvchilarning ish bilan ta’minlanish darajasi: 98% dan yuqori\n" +
                "\n" +
                "Ta’lim shakllari: kunduzgi, kechki va sirtqi\n" +
                "\n" +
                "Rasmiy sayt: tfi.uz\n" +
                "Tashkent Institute of Finance\n" +
                "+1\n" +
                "Rank.uz\n" +
                "+1\n" +
                "Tashkent Institute of Finance\n" +
                "\n" +
                "\uD83C\uDF93 Fakultetlar va ta’lim yo‘nalishlari\n" +
                "TMI quyidagi asosiy fakultetlarga ega:\n" +
                "\n" +
                "Iqtisodiyot fakulteti\n" +
                "\n" +
                "Soliqlar va sug‘urta fakulteti\n" +
                "\n" +
                "Buxgalteriya hisobi va audit fakulteti\n" +
                "\n" +
                "Byudjet hisobi va g‘aznachilik fakulteti\n" +
                "\n" +
                "Bank ishi fakulteti\n" +
                "\n" +
                "Moliya fakulteti\n" +
                "Oliygoh\n" +
                "+2\n" +
                "Oliygoh\n" +
                "+2\n" +
                "Rank.uz\n" +
                "+2\n" +
                "Tashkent Institute of Finance\n" +
                "Bundan tashqari, sirtqi ta’lim bo‘limi mavjud bo‘lib, u yerda quyidagi yo‘nalishlar" +
                " bo‘yicha kadrlar tayyorlanadi:\n" +
                "sirtqi.tfi.uz\n" +
                "+1\n" +
                "sirtqi.tfi.uz\n" +
                "+1");


        return sendPhoto;
    }

    public SendPhoto ToshkentArxitekturavaQurilishInstituti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://api.mentalaba.uz/logo/92e19862-cf08-4bc7-ad37-846ac2c60530.jpg"));
        sendPhoto.setCaption("\uD83C\uDF93 Asosiy ma’lumotlar\n" +
                "Rasmiy nomi: Toshkent Arxitektura-Qurilish Universiteti (TAQU)\n" +
                "\n" +
                "Tashkil topgan yili: 1991-yil\n" +
                "\n" +
                "Talabalar soni: 8 772 nafar\n" +
                "\n" +
                "Professor-o‘qituvchilar: 381 nafar, shundan 18 nafari fan doktori, 96 nafari fan nomzodi\n" +
                "\n" +
                "Fakultetlar:\n" +
                "\n" +
                "Arxitektura fakulteti\n" +
                "\n" +
                "Menejment fakulteti\n" +
                "\n" +
                "Ta’lim yo‘nalishlari: 22 ta bakalavriat, 23 ta magistratura mutaxassisliklari\n" +
                "\n" +
                "Ta’lim tillari: o‘zbek, rus, ingliz\n" +
                "\n" +
                "\uD83C\uDF10 Xalqaro hamkorlik\n" +
                "TAQU Germaniya, Italiya, Polsha, Rossiya, Belarus, Koreya, Xitoy va boshqa mamlakatlarning 95 ta nufuzli oliy ta’lim muassasalari bilan hamkorlik qiladi. Universitetda Erasmus+ va DAAD kabi xalqaro dasturlar doirasida qo‘shma ta’lim loyihalari amalga oshirilmoqda. \n" +
                "Taqu\n" +
                "\uD83C\uDFD7 Amaliyot va infratuzilma\n" +
                "Talabalar uchun zamonaviy axborot-resurs markazi mavjud bo‘lib, 247 958 dona elektron kitob fondiga ega.\n" +
                "\n" +
                "Universitet huzurida texnopark tashkil etilgan bo‘lib, bu yerda talabalar amaliy loyihalar ustida ishlash imkoniyatiga ega. \n" +
                "talimtelekanali.uz\n" +
                "Gazeta.Uz\n");


        return sendPhoto;
    }


}









