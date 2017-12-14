package com.example.tharani.testing;

/**
 * Created by Tharani on 12/12/2017.
 */
//created interface LoginView
interface LoginView {
        //interface is a abstract type that is used to specify a behaviour that classes must implement
        String getUsername();//by using get method providing access to username

        String getPassword();//by using get method providing access to password

        void startSecondActivity();
        void showUsernameError(int resId);
        void showPasswordError(int resId);
        void showLoginError(int resId);
        /*void wont return any value
        * here it initializing resId for showUsernameError,showPasswordError,showLoginError*/
}
