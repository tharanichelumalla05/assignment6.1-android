package com.example.tharani.testing;

/**
 * Created by Tharani on 12/12/2017.
 */
//created class LoginService
class LoginService {
    public boolean login(String username, String password) {
        /*boolean returns true or false
        taking username and password by using string
        * string is a sequence of characters  */
        return "TharaniChelumalla".equals(username) && "1234".equals(password);
        //here returns true if username and password is equal as given above or else gets error message
    }
}
