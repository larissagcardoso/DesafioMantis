package support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import core.BasePage; 

public class Generator extends BasePage {
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts); // vai retornar uma String no formato parametrizado
	}
}
