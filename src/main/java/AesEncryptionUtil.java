// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//




import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;




public class AesEncryptionUtil {
    private static final String AES_MODE = "AES/CBC/PKCS7Padding";
    private static final String CHARSET = "UTF-8";
    public static boolean DEBUG_LOG_ENABLED = false;
    private static final String HASH_ALGORITHM = "SHA-256";
    private static final String TAG = "AESCrypt";
    private static final byte[] ivBytes = "0983506863098336".getBytes();
    private static final String theIV = "0983506863098336";
    private static final String theKEY = "302skfjna443ude5";


    public static void main(String[] args) {
        String aa="d9q9Ipl6Cj5gKhyBuRHZO0fA6ie/SZHwWKSCn0UzT5wcHdfbXHLnHwy/7sP7d2bUUJ1rDdEbVtEPVW8cZF/xslDnkqrlca/z0oQFm8f8f8CqYVpnqKOhY0FCW4Q+3hv5yfQhmldl+aJkCirQcCs0754gcfbZY0dRPSIbQVQ9jrw=";
        System.out.println(AesEncryptionUtil.decrypt(aa));
    }

    private static String bytesToHex(byte[] var0) {
        char[] var3 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] var4 = new char[var0.length * 2];

        for(int var1 = 0; var1 < var0.length; ++var1) {
            int var2 = var0[var1] & 255;
            var4[var1 * 2] = var3[var2 >>> 4];
            var4[var1 * 2 + 1] = var3[var2 & 15];
        }

        return new String(var4);
    }

    public static String decrypt(String var0) {
        try {
            var0 = decrypt(OhKids.kids(), var0);
            return var0;
        } catch (Exception var1) {
            var1.printStackTrace();
            return "";
        }
    }

    public static String decrypt(String var0, String var1) throws GeneralSecurityException {
        try {

            SecretKeySpec var3 = generateKey(var0);
            log("base64EncodedCipherText", var1);
            byte[] var5 = Base64.decode(var1, 2);
            log("decodedCipherText", var5);
            byte[] var4 = decrypt(var3, OhKids.fool().getBytes(), var5);
            log("decryptedBytes", var4);
            var0 = new String(var4, "UTF-8");
            log("message", var0);
            return var0;
        } catch (UnsupportedEncodingException var2) {
            if(DEBUG_LOG_ENABLED) {
//                Log.e("AESCrypt", "UnsupportedEncodingException ", var2);
            }

            throw new GeneralSecurityException(var2);
        }
    }

    public static byte[] decrypt(SecretKeySpec var0, byte[] var1, byte[] var2) throws GeneralSecurityException {
        Cipher var3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        var3.init(2, var0, new IvParameterSpec(var1));
        byte[] var4 = var3.doFinal(var2);
        log("decryptedBytes", var4);
        return var4;
    }

    public static String encrypt(String var0) {
        try {
            var0 = encrypt("302skfjna443ude5", var0);
            return var0;
        } catch (Exception var1) {
            var1.printStackTrace();
            return "";
        }
    }

    public static String encrypt(String var0, String var1) throws GeneralSecurityException {
        try {
            SecretKeySpec var3 = generateKey(var0);
            log("message", var1);
            var0 = Base64.encodeToString(encrypt(var3, ivBytes, var1.getBytes("UTF-8")), 2);
            log("Base64.NO_WRAP", var0);
            return var0;
        } catch (UnsupportedEncodingException var2) {
            if(DEBUG_LOG_ENABLED) {
//                Log.e("AESCrypt", "UnsupportedEncodingException ", var2);
            }

            throw new GeneralSecurityException(var2);
        }
    }

    public static byte[] encrypt(SecretKeySpec var0, byte[] var1, byte[] var2) throws GeneralSecurityException {
        Cipher var3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        var3.init(1, var0, new IvParameterSpec(var1));
        byte[] var4 = var3.doFinal(var2);
        log("cipherText", var4);
        return var4;
    }

    private static SecretKeySpec generateKey(String var0) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest.getInstance("SHA-256");
        byte[] var1 = var0.getBytes("UTF-8");
        log("SHA-256 key ", var1);
        return new SecretKeySpec(var1, "AES");
    }

    private static void log(String var0, String var1) {
        if(DEBUG_LOG_ENABLED) {
//            Log.d("AESCrypt", var0 + "[" + var1.length() + "] [" + var1 + "]");
        }

    }

    private static void log(String var0, byte[] var1) {
        if(DEBUG_LOG_ENABLED) {
//            Log.d("AESCrypt", var0 + "[" + var1.length + "] [" + bytesToHex(var1) + "]");
        }

    }
}
