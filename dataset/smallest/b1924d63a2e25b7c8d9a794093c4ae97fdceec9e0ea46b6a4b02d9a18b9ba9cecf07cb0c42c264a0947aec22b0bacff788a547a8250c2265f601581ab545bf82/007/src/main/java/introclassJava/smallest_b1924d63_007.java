package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class smallest_b1924d63_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_b1924d63_007 mainClass = new smallest_b1924d63_007 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        IntObj num1 = new IntObj (), num2 = new IntObj (), num3 =
            new IntObj (), num4 = new IntObj (), smallest = new IntObj ();
        output +=
            (String.format (" Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt ();
        num2.value = scanner.nextInt ();
        num3.value = scanner.nextInt ();
        num4.value = scanner.nextInt ();
        if (num1.value <= num2.value) {
            smallest.value = num1.value;
        } else {
            smallest.value = num2.value;
        }
        if (num3.value <= smallest.value) {
            smallest.value = num3.value;
        }
        if (num4.value <= smallest.value) {
            smallest.value = num4.value;
        }
        output += (String.format ("%d is the smallest\n", smallest.value));
        if (true)
            return;;
    }
}