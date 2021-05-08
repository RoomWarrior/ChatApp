package com.hfad.chatapp.Fragments;

import com.hfad.chatapp.Notification.MyResponse;
import com.hfad.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAJrkvj5U:APA91bH3zMACChGYhW5rC5cuv_L94LTbFotvC574hNXYa6uutPw_325ln2VB2I3HaISTTxULUEcRw0pkNwQ5AJRhrYpCi6Fvn5EHJsNWdH1aZTl74zndQP-1byEyDbnU5aJkdyCa86iF"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
