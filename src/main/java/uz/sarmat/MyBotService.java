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
        button.setText("");
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

    public SendMessage BuyukBritaniya(Long chatId){
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
        button.setText("Seoul National Universituti");
        row.add(button);
        rows.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Yonsei Universitituti");
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
        row.add(button5);

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
}








