package uz.sarmat;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        Long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        if (text.equals("/start")) {
            try {
                execute(myBotService.sendMessage(chatId));
                execute(myBotService.tiltanlash(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        
        if (text.equals("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili")) {
            try {
                execute(myBotService.Davlatnitanlang(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        if (text.equals("\uD83C\uDDFA\uD83C\uDDF8America")) {
            try {
                execute(myBotService.Amerika(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        if (text.equals("\uD83C\uDDF0\uD83C\uDDF7Korea")) {
            try {
                execute(myBotService.Korea(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("\uD83C\uDDF7\uD83C\uDDFARussia")) {
            try {
                execute(myBotService.Rassiya(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("\uD83C\uDDEC\uD83C\uDDE7Buyuk Britaniya")) {
            try {
                execute(myBotService.BuyukBritaniya(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


        if (text.equals("Orqaga")) {
            try {
                execute(myBotService.tiltanlash(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        if (text.equals("Harvard")) {
            try {
                execute(myBotService.harvard(chatId));
                //execute(myBotService.sendMessageharvard(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Oxford")) {
            try {
                execute(myBotService.Oxford(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Seoul National University")) {
            try {
                execute(myBotService.SeoulNationalUniversity(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Yonsei University")) {
            try {
                execute(myBotService.YonseiUniversity(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Pohang University of Science and Technology")) {
            try {
                execute(myBotService.PohangUniversityofScienceandTechnology(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Hanyang University")) {
            try {
                execute(myBotService.HanyangUniversity(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (text.equals("Sungkyunkwan University")) {
            try {
                execute(myBotService.SungkyunkwanUniversity(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }



    }

    @Override
    public String getBotUsername() {
        return "InfoUniversityBot";
    }

    @Override
    public String getBotToken() {
        return "7865786833:AAEkF6M6MMG5f5wTPKfInBXMr-HaYlQ6PP8";
    }
}


