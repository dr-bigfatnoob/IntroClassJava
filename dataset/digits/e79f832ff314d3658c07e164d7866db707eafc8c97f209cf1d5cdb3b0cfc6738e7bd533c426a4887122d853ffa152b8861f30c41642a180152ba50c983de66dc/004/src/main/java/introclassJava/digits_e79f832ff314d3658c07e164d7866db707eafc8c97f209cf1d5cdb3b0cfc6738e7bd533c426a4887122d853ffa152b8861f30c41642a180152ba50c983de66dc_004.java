package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004 mainClass = new digits_e79f832ff314d3658c07e164d7866db707eafc8c97f209cf1d5cdb3b0cfc6738e7bd533c426a4887122d853ffa152b8861f30c41642a180152ba50c983de66dc_004();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        IntObj number = new IntObj(), rem = new IntObj();
        output += (String.format("\nEnter an integer > "));
        number.value = scanner.nextInt();
        output += (String.format("\n"));
        if(number.value < 0){
            number.value = Math.abs(number.value);
            while(number.value > 10){
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = number.value / 10;
            }
            number.value = number.value - 2*number.value;
            output += (String.format("%d\nThat's all, have a nice day!\n", number.value));
        } else if(number.value == 0){
            output += (String.format("%d\nThat's all, have a nice day!\n", number.value));
        }         else {
            while(number.value!=0){
                rem.value = number.value % 10;
                output += (String.format("%d\n", rem.value));
                number.value = number.value / 10;
            }
            output += (String.format("That's all, have a nice day!\n"));
        }
        if(true)return;;
    }
}