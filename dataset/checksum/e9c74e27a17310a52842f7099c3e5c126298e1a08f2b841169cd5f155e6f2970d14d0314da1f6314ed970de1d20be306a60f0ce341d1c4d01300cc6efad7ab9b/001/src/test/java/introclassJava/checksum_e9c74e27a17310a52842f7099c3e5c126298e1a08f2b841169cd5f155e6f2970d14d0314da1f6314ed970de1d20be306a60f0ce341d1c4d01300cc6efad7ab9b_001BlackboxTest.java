package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is -";
		mainClass.scanner = new java.util.Scanner("1234567890");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is I";
		mainClass.scanner = new java.util.Scanner("abcefghi");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is K";
		mainClass.scanner = new java.util.Scanner(")(*&^%$#");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is E";
		mainClass.scanner = new java.util.Scanner("abc 123 %^&");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is 2";
		mainClass.scanner = new java.util.Scanner("~+{\"s1213skane");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001 mainClass = new checksum_e9c74e27a17310a52842f7099c3e5c126298e1a08f2b841169cd5f155e6f2970d14d0314da1f6314ed970de1d20be306a60f0ce341d1c4d01300cc6efad7ab9b_001();
		String expected = "Enter an abitrarily long string, ending with carriage return > Check sum is '";
		mainClass.scanner = new java.util.Scanner("ASDF_1234");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}