package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001 mainClass = new syllables_b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_001();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}