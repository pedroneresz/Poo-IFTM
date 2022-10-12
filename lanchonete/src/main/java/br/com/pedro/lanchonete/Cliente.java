package src.main.java.br.com.pedro.lanchonete;

@Entity

public class Cliente extends Pessoa {
	@id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
