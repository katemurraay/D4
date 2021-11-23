package com.complex.entity;

public class User {


        private int userID;
        private String email;
        private String password;
        private String firstName;
        private String lastName;
        private String userType;
        private String strUserID;

    public User(int id, String email, String password, String firstName, String lastName, String userType) {
        this.userID = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }
        public User(){
        this.userID=0;
        this.email="";
        this.password="";
        this.firstName="";
        this.lastName="";
        this.userType="";

    }

// <editor-fold defaultstate="collapsed" desc="Getters and Setters">
        /**
         * @return the id
         */


        /**
         * @return the email
         */
        public String getEmail() {
        return email;
    }

        /**
         * @param email the email to set
         */
        public void setEmail(String email) {
        this.email = email;
    }

        /**
         * @return the password
         */
        public String getPassword() {
        return password;
    }

        /**
         * @param password the password to set
         */
        public void setPassword(String password) {
        this.password = password;
    }

        /**
         * @return the firstName
         */
        public String getFirstName() {
        return firstName;
    }

        /**
         * @param firstName the firstName to set
         */
        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

        /**
         * @return the lastName
         */
        public String getLastName() {
        return lastName;
    }

        /**
         * @param lastName the lastName to set
         */
        public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        /**
         * @return the userType
         */
        public String getUserType() {
        return userType;
    }

        /**
         * @param userType the userType to set
         */
        public void setUserType(String userType) {
        this.userType = userType;
    }
        /**
         * @return the userID
         */
        public int getUserID() {
        return userID;
    }

        /**
         * @param userID the userID to set
         */
        public void setUserID(int userID) {
        this.userID = userID;
    }

        /**
         * @return the strUserID
         */
        public String getStrUserID() {
        return strUserID;
    }

        /**
         * @param strUserID the strUserID to set
         */
        public void setStrUserID(String strUserID) {
        this.strUserID = strUserID;
    }
        // </editor-fold>



    }
