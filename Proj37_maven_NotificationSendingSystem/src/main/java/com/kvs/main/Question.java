package com.kvs.main;

public class Question 
{
    public static void main( String[] args )
    {
        /*🎯 Task 3 — Notification Sending System
Objective:

Showcase use of Strategy Pattern to send notifications using Email, SMS, or WhatsApp dynamically in a Spring Core application.

Class-wise Design:

NotificationStrategy (Interface)

Method: void send(String message)

EmailNotification (Concrete Strategy)

Implements: NotificationStrategy

Sends message via Email.

SMSNotification (Concrete Strategy)

Implements: NotificationStrategy

Sends message via SMS.

WhatsAppNotification (Concrete Strategy)

Implements: NotificationStrategy

Sends message via WhatsApp.

NotificationService (Context Class)

Holds a reference to NotificationStrategy.

Method: notifyUser(String message)

AppConfig (Configuration Class)

Declares beans for all notification types.

NotificationApp (Main Class)

User chooses channel (email/sms/whatsapp).

Spring injects appropriate strategy and executes it.

🧾 Expected Console Output:
Enter notification type (email/sms/whatsapp): whatsapp
Enter message: "Your order has been shipped!"

Notification sent successfully via WhatsApp:
Your order has been shipped!
*/
    }
}
