package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_017 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_017 mainClass = new syllables_cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_017();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int LINE_LEN = 22;
    public void exec () throws Exception {
        char[] string = new char[LINE_LEN];
        IntObj i = new IntObj(), count = new IntObj(), len = new IntObj();
        count.value = 0;
        output += (String.format("Please enter a string > "));
        string = (scanner.nextLine() + "\n").toCharArray();
        string[string.length - 1] = '\0';
        len.value = string.length;
        for(i.value = 0; i.value < len.value; i.value++) {
            if(string[i.value] == 'a' || string[i.value] == 'e' || string[i.value] == 'i' || string[i.value] == 'o' || string[i.value] == 'u' || string[i.value] == 'y'){
                count.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", count.value));
        if(true)return;;
    }
}