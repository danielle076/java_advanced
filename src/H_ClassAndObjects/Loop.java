package H_ClassAndObjects;

public class Loop {

    public void loopCharacters(){
        for(int i = -128; i < 127; i++) {
            char ch = (char) i;
            System.out.println("Karakter op positie: " + i + " is " + ch);
        }
    }
}
