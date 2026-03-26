package codigojose;
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean
        int ageInt = (int)1000000L; //Casting 
        long longNumber = 1000000L;
        double doubleSalary = 2000.0D;
        float salaryFloat = 2500.0F;
        byte ageByte = -128;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'A';
        String name = "Gugu";
        System.out.println(ageInt);
        System.out.println("A idade é: " + ageInt + " anos");
        System.out.println(longNumber);
        System.out.println(doubleSalary);
        System.out.println(salaryFloat);
        System.out.println(ageByte);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(ageShort);
        System.out.println(character);
        System.out.println("Faro chorando pelo " + name);
    }
}
