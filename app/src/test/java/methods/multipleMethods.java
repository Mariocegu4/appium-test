package methods;

import java.util.concurrent.ThreadLocalRandom;

public class multipleMethods {



    public static String email = null;
    public static String password = null;

    public  String getEmail() {
        return email;
    }

    public static void setEmail(String email){
        multipleMethods.email =email;
    }

    public String getPassword() {
        return password;

    }

    public static void setPassword(String password) {
        multipleMethods.password = password;
    }


    //Generate random characters according to  ASCII
    // '0' to '9' = 48 to 57 in ASCII = number
    // '10' to '35' = 65 to 90 in ASCII = uppercase letter
    // '36' to '61' = 97 to 122 in ASCII = lowercase letter
    // Extra special symbols
    // '62' to '68' = 91 to 96 in ASCII = Symbols
    public static char genCharacter(int min, int max){

//        int random = (int) (Math.random()*62);
        int random = ThreadLocalRandom.current().nextInt(min,max +1);



        if(random <=9){
            //Number
            int ascii = random+48;
//            System.out.println("Generating Ascii: "+ascii);
            return (char) (ascii);
        }else if(random<=35){
            //Uppercase
            int ascii = random+55;
//            System.out.println("Generating Ascii: "+ascii);
            return (char) (ascii);
        }else if(random<=61){
            //Lowercase
            int ascii = random+61;
//            System.out.println("Generating Ascii: "+ascii);
            return (char) (ascii);
        }else{
            //Symbols
            int ascii = random+30;
//            System.out.println("Generating Ascii: "+ascii);
            return (char) (ascii);
        }

    }

    //Generate passwords with random characters
    public static void genPassword(String type){

        multipleMethods.password= "";
        int ranChar;
        //Determine if valid or invalid password
        //range 0 to 5 for invalid
        //range 6 to 8 for valid
        int length = ThreadLocalRandom.current().nextInt(6,8 +1);
        if (type.contains("IV")){
            length =   ThreadLocalRandom.current().nextInt(1,4 +1);

        }

        //'type' will determine type of password
        // '0' to '9' = 48 to 57 in ASCII = number
        // '10' to '35' = 65 to 90 in ASCII = uppercase letter
        // '36' to '61' = 97 to 122 in ASCII = lowercase letter
        // Extra special symbols
        // '62' to '68' = 91 to 96 in ASCII = Symbols
        for(int i = 0; i <= length; i++) {
            if (type.contains("Any")) {
                password += genCharacter(0, 68);
            }
            else if (type.contains("Alpha")) {

                password += genCharacter(10, 61);
            }
            else if (type.contains("AlfaNum")) {

                ranChar = (int) (Math.random()*3+1);

                switch (ranChar){
//                    Number
                    case 1: password += genCharacter(0, 9);
                        break;
//                     Upper
                    case 2: password += genCharacter(10, 35);
                         break;
//                      Lower
                    case 3: password += genCharacter(36, 61);
                         break;
                }

            }

        }


    }

    public static void genEmail(){

        //Generation of the Email would be similar to generation of password it would include @hotmail.com, @live.com, @yahoo.com
    }


}
