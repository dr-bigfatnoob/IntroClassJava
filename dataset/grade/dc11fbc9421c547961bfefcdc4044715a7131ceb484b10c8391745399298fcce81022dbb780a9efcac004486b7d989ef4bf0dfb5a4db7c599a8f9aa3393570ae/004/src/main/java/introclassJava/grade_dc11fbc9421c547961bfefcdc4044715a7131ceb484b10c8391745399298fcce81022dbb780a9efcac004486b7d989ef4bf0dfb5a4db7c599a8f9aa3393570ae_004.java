package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class grade_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_004 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		grade_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_004 mainClass = new grade_dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_004();
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
        DoubleObj a = new DoubleObj(), b = new DoubleObj(), c = new DoubleObj(), d = new DoubleObj();
        DoubleObj score = new DoubleObj();
        output += (String.format("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextDouble();
        b.value = scanner.nextDouble();
        c.value = scanner.nextDouble();
        d.value = scanner.nextDouble();
        output += (String.format("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextDouble();
        if(score.value >= a.value){
            output += (String.format("Student has an A grade\n"));
        } else if(score.value >= b.value){
            output += (String.format("Student has an B grade\n"));
        }         else if(score.value >= c.value){
            output += (String.format("Student has an C grade\n"));
        }         else if(score.value >= d.value){
            output += (String.format("Student has an D grade\n"));
        }         else {
            output += (String.format("Student has failed the course\n"));
        }
        if(true)return;;
    }
}