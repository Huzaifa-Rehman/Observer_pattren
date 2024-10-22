/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventsmanagement_refactoring_guru.observer.example;

/**
 *
 * @author rehma
 */

public interface SMSSupportListener {
    void onSendSMS(String message, String phoneNumber);
}


public class DefaultSMSSupportListener implements SMSSupportListener {
    private static final int MAX_SMS_LENGTH = 160;

    @Override
    public void onSendSMS(String message, String phoneNumber) {
        
        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: The default SMS length exceeds " + MAX_SMS_LENGTH + " characters. Please define a valid default SMS.");
        } else {
            sendSMS(message, phoneNumber);
        }
    }

    private void sendSMS(String message, String phoneNumber) {

        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}


public class Main {
    public static void main(String[] args) {
        DefaultSMSSupportListener smsListener = new DefaultSMSSupportListener();
        
        
        smsListener.onSendSMS("This is a test message that exceeds the default SMS limit of 160 characters. " +
                "This message is intentionally made long to trigger the warning for exceeding the character limit.", 
                "1234567890");
        
        
        smsListener.onSendSMS("This is a valid short message.", "1234567890");
    }
}