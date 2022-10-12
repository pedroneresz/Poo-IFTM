package src.main.java.br.com.pedro.lanchonete;

@controller
public class MeuPrimeiroControler {
@GEtMapping("/oi")
@ResponseBody
public String hello() {
	return "Oi, Tudo bem?";
}
}
