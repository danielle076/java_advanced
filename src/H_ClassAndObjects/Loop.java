package H_ClassAndObjects;

public class Loop {

    public void loopCharacters(){
        for(int i = -128; i < 127; i++) {
            char ch = (char) i;
            System.out.println("Karakter op positie: " + i + " is " + ch);
        }
    }

    public String returnData(String data){
        return data;
    }

    public void printData(String data){
        System.out.println(returnData(data));
    }
}
