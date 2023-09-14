package calccontroller;
import model.PilhaInt;
public class Controller {

	public Controller() {
		super();
	}
	PilhaInt P = new PilhaInt();
	
	public void Positivo(int Valor) {
		P.Push(Valor);
	}
	public void negativo(int Valor) {
		try {
			int A = P.pop();
			int B = P.pop();
			int resultado = A + B;
			P.Push(A);
			P.Push(B);
			P.Push(resultado);
		} catch (Exception e) {
		}
	}
	public int Tamanho (int tam) {
		tam = P.size();
		return tam;
	}
}
