package racingcar.handler;

public enum ErrorHandler {

    INVALID_NUMBER("유효하지 않은 숫자입니다.");

    private final String errorMessage;

    ErrorHandler(String message) {
        errorMessage = "[Error] " + message;
    }

    public RuntimeException getException() {
        return new IllegalArgumentException(errorMessage);
    }
}
