package com.bignerdranch.android.hometrainer2;

/**
 * Created by ricky on 4/18/2018.
 */

public class MemberDbsSchema {
    public static final class MemberTable{
        public static final String Name = "members";

        public static final String UUID = "uuid";
        public static final String Password = "Password";
        public static final String Email = "Email";
        public static final String Address = "address";
        public static final String PhoneNumber = "phonenumber";

        public static String getName() {
            return Name;
        }

        public static String getUUID() {
            return UUID;
        }

        public static String getEmail() {
            return Email;
        }

        public static String getAddress() {
            return Address;
        }

        public static String getPhoneNumber() {
            return PhoneNumber;
        }
    }

}
