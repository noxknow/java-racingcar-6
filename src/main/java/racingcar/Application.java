package racingcar;

import racingcar.controller.RacingCarGameController;
import racingcar.handler.InputHandler;
import racingcar.handler.OutputHandler;
import racingcar.view.ConsoleInput;
import racingcar.view.ConsoleOutput;

public class Application {
    public static void main(String[] args) {

        final InputHandler inputHandler = new ConsoleInput();
        final OutputHandler outputHandler = new ConsoleOutput();

        new RacingCarGameController(inputHandler, outputHandler).run();
    }
}
