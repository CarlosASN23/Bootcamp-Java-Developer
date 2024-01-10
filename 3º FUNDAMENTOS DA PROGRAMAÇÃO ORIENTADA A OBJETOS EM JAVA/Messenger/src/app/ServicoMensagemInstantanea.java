package app;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//Somente as classes filhas terão conhecimento do método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

}