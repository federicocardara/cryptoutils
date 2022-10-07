package cat.uvic.teknos.m09.federicocardara.cryptoutils.exceptions;

public class CryptUtilsException extends RuntimeException {
    public CryptUtilsException() {
    }

    public CryptUtilsException(String message) {
        super(message);
    }

    public CryptUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CryptUtilsException(Throwable cause) {
        super(cause);
    }

    public CryptUtilsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
