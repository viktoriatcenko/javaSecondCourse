package lesson18;

import java.io.*;

public class IOFilesCopy implements UtilCopy{
    @Override
    public void copy(String from, String to) {
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(from));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(to));

            int c = 0;
            while (true) {
                c = inputStream.read();
                if (c != -1) {
                    outputStream.write(c);
                } else {
                    break;
                }
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
