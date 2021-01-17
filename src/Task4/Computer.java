package Task4;

public class Computer {

    Computer(){
    }

    public static void main(String[] args) {
        Computer [] computers  = new Computer[5];
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        Computer computer4 = new Computer();
        Computer computer5 = new Computer();

        for (int i = 0; i < computers.length; i++){
            switch (i){
                case 0: computers [i] = computer1;
                case 1: computers [i] = computer2;
                case 2: computers [i] = computer3;
                case 3: computers [i] = computer4;
                case 4: computers [i] = computer5;
            }
        }

    }
}
