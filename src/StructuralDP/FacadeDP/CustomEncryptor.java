package StructuralDP.FacadeDP;

public class CustomEncryptor {
    public static void main(String[] args) {

        String text = "Content";

        // tercih edilmeyen yol
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor mdEncryptor = new MD5Encryptor();
        mdEncryptor.encrypt(text, "KEY");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "KEY", true);
        // tercih edilmeyen yol bitti


        // tercih edilen yol
        EncryptorFacade encryptorFacade = new EncryptorFacade();

        encryptorFacade.encrypt(text, EncryptorFacade.EncType.MD5);
        // tercih edilen yol bitti


    }

}
