package StructuralDP.FacadeDP;

public class EncryptorFacade {

    // EncryptorFacade class'indan sadece o methoda ulasim istedik
    private AESEncryptor aesEncryptor = new AESEncryptor();
    public SHAEncryptor shaEncryptor = new SHAEncryptor();
    public MD5Encryptor md5Encryptor = new MD5Encryptor();

    public void encrypt(String text, EncType encType){
        switch (encType){
            case AES: aesEncryptor.encrypt(text);
                break;
            case MD5: md5Encryptor.encrypt(text,"KEY");
                break;
            case SHA: shaEncryptor.encrypt(text,"KEY",true);
                break;
        }
    }

    public enum EncType{
        SHA,
        MD5,
        AES
    }


}
