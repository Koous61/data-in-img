import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

public class Main {

    private static OutputStream txt;

    private static void menu() {
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
    }

    private static void encrypt() {
        try {
            byte[] imageInByte;
            BufferedImage originalImage = ImageIO.read(new File("e:/1.jpg"));

            // конвертация изображения в массив байтов
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", baos);
            baos.flush();
            imageInByte = baos.toByteArray();

            // конвертация массива байтов в изображение
            InputStream in = new ByteArrayInputStream(imageInByte);
            BufferedImage bImageFromConvert = ImageIO.read(in);
            txt = new FileOutputStream("e:/2.img"); //запись массива байтов в файл1
            txt.write(imageInByte);
            ImageIO.write(bImageFromConvert, "jpg", new File("e:/3.img"));//запись массива байтов в файл2

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void decrypt() {
    }

    public static void main(String[] args) {
      menu();
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1: {
                encrypt();
            }
            case 2: {
                decrypt();
            }
        }

    }
}
