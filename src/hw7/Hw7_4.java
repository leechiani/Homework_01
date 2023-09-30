package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
// 注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
public class Hw7_4 implements Serializable {

    public static void main(String[] args) {
        File dir = new File("C:/data");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "Object.ser");

        Animal[] pet = new Animal[2];
        pet[0] = new Dog("Puppy");
        pet[1] = new Cat("Kitty");

        try {
            ObjectOutputStream ooc = new ObjectOutputStream(new FileOutputStream(file));
            for (int i = 0; i < pet.length; i++) {
                ooc.writeObject(pet[i]);
            }
            ooc.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            for (int j = 0; j < pet.length; j++) {
                ois.readObject();
                pet[j].speak();
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    abstract static class Animal implements Serializable {
        abstract void speak();
    }

    static class Dog extends Animal {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("This is Dog " + name + " speaking.");
        }
    }

    static class Cat extends Animal {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("This is Cat " + name + " speaking!");
        }
    }
}