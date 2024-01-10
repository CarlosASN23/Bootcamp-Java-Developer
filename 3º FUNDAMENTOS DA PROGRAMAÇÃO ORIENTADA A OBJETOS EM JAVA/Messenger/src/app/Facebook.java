package app;

public class Facebook extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");	
	}

}
