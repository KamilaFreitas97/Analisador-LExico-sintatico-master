
package lip.anasin;


public class AnasinPrincipal {
        public static void main(String[] args) {
		String exp = "$x = 2*(soma2 + #";
		Anasin anasin = new Anasin(exp);
		anasin.anasint();
	}
}
