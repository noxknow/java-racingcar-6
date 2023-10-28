package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.handler.ErrorHandler;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {

    @DisplayName("1보다 작은 숫자가 입력되면 예외가 발생한다")
    @ParameterizedTest(name = "[{index}] input : {0}")
    @ValueSource(ints = {-1, 0})
    void createTryCountWithInvalidRange(int input) {
        assertThatThrownBy(() -> new TryCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorHandler.INVALID_RANGE.getException().getMessage());
    }
}
