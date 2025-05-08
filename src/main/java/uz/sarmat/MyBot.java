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
        if (text.equals("/start")){
            try {
                execute(myBotService.sendMessage(chatId));
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
