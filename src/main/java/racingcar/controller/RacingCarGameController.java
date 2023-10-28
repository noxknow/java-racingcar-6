package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.domain.TryCount;
import racingcar.handler.InputHandler;
import racingcar.handler.OutputHandler;

import java.util.List;

public class RacingCarGameController {

    private final InputHandler inputHandler;
    private final OutputHandler outputHandler;

    public RacingCarGameController(InputHandler inputHandler, OutputHandler outputHandler) {
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
    }

    public void run() {
        RacingCar racingCar = loadCarNames();
        TryCount tryCount = loadTryCount();
    }

    public RacingCar loadCarNames() {
        outputHandler.printInputCarNameMessage();
        List<String> carNames = inputHandler.inputCarNames();

        return new RacingCar(carNames);
    }

    public TryCount loadTryCount() {
        outputHandler.printInputTryCountMessage();
        int tryCount = inputHandler.inputTryCount();

        return new TryCount(tryCount);
    }
}
