//import ...
import java.io.File;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Initialize gradebook with specified name and generate a key.
 */
public class setup {

  /* test whether the file exists */
  private static boolean file_exists(String filename) {
    File f = new File(filename);
    return f.exists();
  }

  public static void main(String[] args) throws NoSuchAlgorithmException {
    // String key;

    if (args.length < 2) {
      System.out.println("Usage: setup <logfile pathname>");
      System.exit(1);
    }

    /* add your code here */

    /* Exit if file invalid */ 
    if (file_exists(args[1])) {
      System.out.println("invalid");
      System.exit(255);
    }

    /* Initialize Gradebook */
    Gradebook gradebook = new Gradebook(args[1]);

    /* Create KeyGen and SecureRandom */ 
    KeyGenerator keyGen = KeyGenerator.getInstance("DES");
    SecureRandom sRandom = new SecureRandom();

    /* Initialize KeyGen and generate key */
    keyGen.init(sRandom);
    Key key = keyGen.generateKey();

    System.out.println("Key is: " + key);
    return;
  }
}
