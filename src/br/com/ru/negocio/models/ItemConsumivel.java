package br.com.ru.negocio.models;

public class ItemConsumivel {
	
	public enum TipoCardapio
	{
		TRIVIAL, VEGANO, SUCO, SOBREMESA;
	}
	
	private String nome;
	private TipoCardapio tipoItemConsumivel;
	//private boolean vegano;
	private boolean gluten;
	private boolean lactose;
	//private boolean suco;
	//private boolean sobremesa;
	private boolean visivel;	
	
	public ItemConsumivel(String nome, boolean gluten, boolean lactose, 
			TipoCardapio tipoItemConsumivel, boolean visivel) {
		this.nome = nome;
		this.tipoItemConsumivel = tipoItemConsumivel;
		//this.vegano = vegano;
		this.gluten = gluten;
		this.lactose = lactose;
		//this.suco = suco;
		//this.sobremesa = sobremesa;
		this.visivel = visivel;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
//	public boolean isVegano() {
//		return vegano;
//	}
//	
//	public void setVegano(boolean vegano) {
//		this.vegano = vegano;
//	}
	
	public TipoCardapio getTipoItemConsumivel() {
		return tipoItemConsumivel;
	}

	public void setTipoItemConsumivel(TipoCardapio tipoItemConsumivel) {
		this.tipoItemConsumivel = tipoItemConsumivel;
	}

	public boolean isGluten() {
		return gluten;
	}
	
	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
	
	public boolean isLactose() {
		return lactose;
	}
	
	public void setLactose(boolean lactose) {
		this.lactose = lactose;
	}
	
//	public boolean isSuco() {
//		return suco;
//	}
//	
//	public void setSuco(boolean suco) {
//		this.suco = suco;
//	}
//	
//	public boolean isSobremesa() {
//		return sobremesa;
//	}
//
//	public void setSobremesa(boolean sobremesa) {
//		this.sobremesa = sobremesa;
//	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	@Override
	public String toString() {
		return "ItemConsumivel [nome=" + nome + ", tipoItemConsumivel=" + tipoItemConsumivel + ", gluten=" + gluten + ", lactose=" + lactose
				+ ", visivel=" + visivel + "]";
	}



//	@Override
//	public int hashCode() {
//		return Objects.hash(gluten, lactose, nome, suco, vegano, visivel);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ItemConsumivel other = (ItemConsumivel) obj;
//		return gluten == other.gluten && lactose == other.lactose && Objects.equals(nome, other.nome) && suco == other.suco
//				&& vegano == other.vegano && visivel == other.visivel;
//	}
	
	
	
}
