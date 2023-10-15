public class FabricaCarroSUV implements IFabricaCarro {

	public ICarro criarCarro() {
		return new CarroSUV();
	}
}
