package com.Viorel.Book_Network.email;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activation_account.html");

    private final String name;

}
