public class FabricaCarroSedan implements IFabricaCarro {
	
	public ICarro criarCarro() {
		return new CarroSedan();
	}
}

