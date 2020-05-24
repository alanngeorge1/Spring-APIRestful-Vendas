package github.com.alanngeorge1.exception;

public class senhaInvalidaException extends RuntimeException {
    public senhaInvalidaException() {
        super("senha invalida");
    }
}
