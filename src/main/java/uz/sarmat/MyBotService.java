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


        KeyboardButton button = new KeyboardButton();
        button.setText("WIUT");
        row.add(button);
        rows.add(row);


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


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Saint Petersburg State University");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Moscow State University");
        row.add(button2);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Higher School of Economics");
        row.add(button3);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Tomsk State University");
        row.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Orqaga");
        row.add(button5);


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
                "Yonsei International Summer School (YISS): Har yili yozda o‘tkaziladigan 6-haftalik dastur, 30 dan ortiq mamlakatdan talabalarni jalb etadi .\n" +
                "\n" +
                "Winter Abroad at Yonsei (WAY): Qisqa muddatli qishki dastur, dekabr-yanvar oylarida o‘tkaziladi.\n" +
                "\n" +
                "Yonsei Korean Language Institute (KLI): 1959-yilda tashkil etilgan, koreys tilini o‘rganmoqchi bo‘lgan xalqaro talabalar uchun 6 darajali intensiv kurslar taklif etadi .\n" +
                "Vikipediya\n" +
                "\n" +
                "\uD83C\uDFE5 Tibbiyot va sog‘liqni saqlash\n" +
                "Severance Hospital: 1885-yilda tashkil etilgan, Janubiy Koreyadagi eng qadimiy va yirik universitet klinikalaridan biri. Har yili 2,5 milliondan ortiq bemorga xizmat ko‘rsatadi .\n" +
                "\n" +
                "Yonsei University Health System tarkibida bir nechta tibbiy muassasalar mavjud.\n" +
                "Vikipediya\n"
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
                "\uD83D\uDCCA Reytinglar\n" +
                "QS World University Rankings 2025: #123-o‘rin\n" +
                "\n" +
                "Times Higher Education (THE) 2025: #102-o‘rin\n" +
                "\n" +
                "US News Best Global Universities 2025: #275-o‘rin\n" +
                "\n" +
                "Janubiy Koreyada: 4-o‘rin\n" +
                "Edujourney\n" +
                "US News\n" +
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

}









