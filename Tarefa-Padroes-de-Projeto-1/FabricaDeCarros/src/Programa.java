public class Programa {
	public static void main(String[] args) {

		IFabricaCarro fabricaSedan = new FabricaCarroSedan();
		ICarro carroSedan = fabricaSedan.criarCarro();

		IFabricaCarro fabricaSUV = new FabricaCarroSUV();
		ICarro carroSUV = fabricaSUV.criarCarro();

		carroSedan.montarChassi();
		carroSUV.instalarMotor();
		carroSedan.aplicarPintura();
		
	}
}
