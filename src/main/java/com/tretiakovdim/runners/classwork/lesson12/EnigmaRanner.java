package com.tretiakovdim.runners.classwork.lesson12;

/**
 * Created by DmitryTretiakov on 10.11.2016.
 */
public class EnigmaRanner {


    public static void main(String[] args) {
        Enigma myEnigma =new Enigma();
        System.out.printf(myEnigma.EncryptionEnigmaString("Ss12 eS5 334611",Enigma.KEY));
        System.out.println(" "+myEnigma.DecryptionEnigmaString(myEnigma.EncryptionEnigmaString("Ss12 eS5 334611",Enigma.KEY),Enigma.KEY));

    }
}
