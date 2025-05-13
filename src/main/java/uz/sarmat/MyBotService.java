package uz.sarmat;

import org.telegram.telegrambots.meta.api.methods.send.SendMediaBotMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {


    public SendMessage sendMessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xush kelibsiz");
        return sendMessage;

    }

    // til tanlash

    public SendMessage tiltanlash(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Tilni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("O'zbek tili");
        row.add(button);
        rows.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Rus tili");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("English");
        row.add(button2);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    // davlatlar

    public SendMessage Davlatnitanlang (Long chatid){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText("Qaysi davlatdagi universititut haqida ma'lumot olmoqchi bo'lsangiz davlatni tanlang ?");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        button.setText("Amerika");
        row.add(button);
        rows.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Korea");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Rassiya");
        row.add(button2);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Uzbekiston");
        row.add(button3);



        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Sengapur");
        row.add(button4);


        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage Amerika (Long chatid){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText("Universititutlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button = new KeyboardButton();
        button.setText("Oxford");
        row.add(button);
        rows.add(row);


        KeyboardButton button1 =new KeyboardButton();
        button1.setText("Harvard");
        row.add(button1);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;




    }

    public SendMessage Korea (Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Universititutlar");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<KeyboardRow>();
        KeyboardRow row = new KeyboardRow();


        KeyboardButton button = new KeyboardButton();
        button.setText("Seoul National Universituti");
        row.add(button);
        rows.add(row);


        KeyboardButton button1 =new KeyboardButton();
        button1.setText(" Yonsei Universitituti");
        row.add(button1);



        KeyboardButton button2 =new KeyboardButton();
        button2.setText("Pohang University of Science and Technology");
        row.add(button2);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Hanyang University");
        row.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Sungkyunkwan University");
        row.add(button4);

        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }





}
