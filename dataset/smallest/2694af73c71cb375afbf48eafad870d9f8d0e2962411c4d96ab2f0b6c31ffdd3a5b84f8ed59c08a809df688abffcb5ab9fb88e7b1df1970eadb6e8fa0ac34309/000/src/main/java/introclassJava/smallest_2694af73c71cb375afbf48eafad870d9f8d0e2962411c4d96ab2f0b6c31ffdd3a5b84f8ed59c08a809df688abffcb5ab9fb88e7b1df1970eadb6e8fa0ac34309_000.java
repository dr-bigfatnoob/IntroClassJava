package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_2694af73c71cb375afbf48eafad870d9f8d0e2962411c4d96ab2f0b6c31ffdd3a5b84f8ed59c08a809df688abffcb5ab9fb88e7b1df1970eadb6e8fa0ac34309_000 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_2694af73c71cb375afbf48eafad870d9f8d0e2962411c4d96ab2f0b6c31ffdd3a5b84f8ed59c08a809df688abffcb5ab9fb88e7b1df1970eadb6e8fa0ac34309_000 mainClass = new smallest_2694af73c71cb375afbf48eafad870d9f8d0e2962411c4d96ab2f0b6c31ffdd3a5b84f8ed59c08a809df688abffcb5ab9fb88e7b1df1970eadb6e8fa0ac34309_000();
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
        IntObj a = new IntObj(), b = new IntObj(), c = new IntObj(), d = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt();
        b.value = scanner.nextInt();
        c.value = scanner.nextInt();
        d.value = scanner.nextInt();
        if(a.value < b.value && a.value < c.value && a.value < d.value){
            output += (String.format("%d is the smallest\n", a.value));
        } else if(b.value < a.value && b.value < c.value && b.value < d.value){
            output += (String.format("%d is the smallest\n", b.value));
        }         else if(c.value < a.value && c.value < b.value && c.value < d.value){
            output += (String.format("%d is the smallest\n", c.value));
        }         else if(d.value < a.value && d.value < b.value && d.value < c.value){
            output += (String.format("%d is the smallest\n", d.value));
        }
        if(true)return;;
    }
}